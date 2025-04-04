package com.thiago.restaurante;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class InterfaceCliente extends Application {
    private ComboBox<String> categoriaBox = new ComboBox<>();
    private ComboBox<String> produtoBox = new ComboBox<>();
    private TextField quantidadeField = new TextField();
    private Button pedidoBtn = new Button("Fazer Pedido");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        categoriaBox.setPromptText("Escolha uma categoria");
        produtoBox.setPromptText("Escolha um produto");
        quantidadeField.setPromptText("Quantidade");
        pedidoBtn.setOnAction(e -> realizarPedido());
        
        VBox layout = new VBox(10, categoriaBox, produtoBox, quantidadeField, pedidoBtn);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setTitle("Restaurante");
        primaryStage.setScene(scene);
        primaryStage.show();

        carregarCategorias();
    }

    private void carregarCategorias() {
        // Aqui você pode adicionar chamadas para buscar as categorias do backend
        categoriaBox.getItems().addAll("Hambúrguer", "Bebidas", "Sobremesas");
        categoriaBox.setOnAction(e -> carregarProdutos());
    }

    private void carregarProdutos() {
        produtoBox.getItems().clear();
        String categoria = categoriaBox.getValue();
        long idCategoria = obterIdCategoria(categoria);
        
        try {
            URL url = new URL("http://localhost:8080/produtos?categoria=" + idCategoria);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            
            Scanner sc = new Scanner(url.openStream());
            StringBuilder response = new StringBuilder();
            while (sc.hasNext()) response.append(sc.nextLine());
            sc.close();
            
            JSONArray produtos = new JSONArray(response.toString());
            for (int i = 0; i < produtos.length(); i++) {
                JSONObject produto = produtos.getJSONObject(i);
                produtoBox.getItems().add(produto.getString("nome"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void realizarPedido() {
        String produto = produtoBox.getValue();
        long quantidade = Long.parseLong(quantidadeField.getText());

        try {
            URL url = new URL("http://localhost:8080/item/pedido");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.getOutputStream().write(("produto=" + produto + "&quantidade=" + quantidade).getBytes());
            conn.getOutputStream().flush();
            conn.getOutputStream().close();
            
            if (conn.getResponseCode() == 200) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Pedido realizado com sucesso!");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Erro ao realizar pedido.");
                alert.show();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private long obterIdCategoria(String categoria) {
        switch (categoria) {
            case "Hambúrguer": return 1;
            case "Bebidas": return 2;
            case "Sobremesas": return 3;
            default: return 0;
            
        }
    }
}

