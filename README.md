# 🍔 Hamburgueria - Sistema de Restaurante

Sistema para gerenciamento de **pedidos** e **produtos** em uma hamburgueria, utilizando **Java**, **JavaFX**, **PostgreSQL** e **VS Code**.

---

## ✨ Funcionalidades:

## 👤 Cliente
Fazer Pedido: Adicionar múltiplos produtos ao carrinho (ex: 3 hamburguers e 3 refrigerantes).

(Cálculo Automático: O valor total do pedido é calculado automaticamente).

##  👨‍🍳 Funcionário
Criar produto: adicionar hambúrgueres, bebidas e sobremesas ao menu

Ativar/desativar produto: tornar produtos disponíveis ou indisponíveis no cardápio

Listar produtos: visualizar todos os produtos cadastrados

Registrar pedido: todos os pedidos são salvos no banco com a data que o cliente pediu

Listar pedidos: visualizar todos os pedidos feitos, com filtro por status

## 🚀 Tecnologias Usadas

- Java 17  
- JavaFX  
- PostgreSQL  
- Maven  
- VS Code

## 🖥️ Executando o Projeto

1. Instale os pré-requisitos abaixo.
2. Abra a pasta do projeto no **VS Code**.
3. Compile com `Ctrl + Shift + B` (se configurado).
4. Rode primeiro o arquivo `RestauranteApplication.java` e logo em seguida o arquivo `HelloApplication.java`.

---

## 🧩 Pré-requisitos

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)  
- [JavaFX SDK](https://gluonhq.com/products/javafx/)  
- Qualquer IDE [VS Code](https://code.visualstudio.com/)
- [PostGreSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

**Extensões recomendadas:**
- Java Extension Pack  
- JavaFX Support (opcional)

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/ThiagoMarzari/projeto-software.git
   ```
2. Compile os arquivos:
   ```bash
   javac `RestauranteApplication.java` e `HelloApplication.java`:.java
   ```
3. Execute a interface gráfica:
   ```bash
   java HelloApplication.java
   ```

---

## 🧠 Diagramas Utilizados:

## Diagrama de Caso de Uso:

![DiagramaDeCasoDeUso](https://github.com/user-attachments/assets/24366042-ed0d-4ae7-8e7e-f992de284ace)

## Diagramas de Classe:
  
- Funcionário:

![DiagramaDeClasseFuncionario](https://github.com/user-attachments/assets/cfbce715-c2b5-426f-970d-7e43f27e76ef)

- Cliente: 

![DiagramaDeClasseCliente](https://github.com/user-attachments/assets/c68658d6-b571-47a7-9a83-58dc7f814899)

## Diagramas de Sequência:

- **Criar Produto:**

![DiagramaDeSequencia](https://github.com/user-attachments/assets/c127213e-68b0-491e-b1df-869e6a75cc11)

- **Desabilitar Produto:**

![DiagramaDeSequenciaDesabilitarProduto](https://github.com/user-attachments/assets/f601696e-b699-47a0-a96e-11e3d8235aed)

- **Listar Produto:**

![DiagramaDeSequenciaListarProduto](https://github.com/user-attachments/assets/20c147c2-1015-45f1-8e4e-cd336d6e93c2)

- **Fazer Pedido:**

![DiagramaDeSequenciaFazerPedido](https://github.com/user-attachments/assets/8084be99-88ff-4889-86f8-1c4033e9cf3d)

- **Backup do Pedido:**

![DiagramaDeSequenciaBackupDoPedido](https://github.com/user-attachments/assets/ab1c9303-2546-4ac5-b10d-c6b773d8cd54)

---

## 📁 Estrutura de Pastas

``` Listagem de caminhos de pasta
📦 projeto
├── 📁 backend
│   ├── 📁 .vscode
│   └── 📁 restaurante
│       ├── 📁 .mvn
│       ├── 📁 src
│       │   ├── 📁 main
│       │   │   ├── 📁 java
│       │   │   │   └── 📁 com
│       │   │   │       └── 📁 example
│       │   │   │           └── 📁 restaurante
│       │   │   │               ├── 📁 controller
│       │   │   │               ├── 📁 dto
│       │   │   │               ├── 📁 model
│       │   │   │               ├── 📁 repository
│       │   │   │               └── 📁 service
│       │   │   └── 📁 resources
│       │   └── 📁 test
│       │       └── 📁 java
│       │           └── 📁 com
│       │               └── 📁 example
│       │                   └── 📁 restaurante
│       └── 📁 target
│           ├── 📁 classes
│           │   └── 📁 com
│           │       └── 📁 example
│           │           └── 📁 restaurante
│           └── 📁 test-classes
│               └── 📁 com
│                   └── 📁 example
│                       └── 📁 restaurante
├── 📁 frontend
│   └── 📁 restaurante
│       ├── 📁 .idea
│       ├── 📁 .mvn
│       ├── 📁 src
│       │   ├── 📁 main
│       │   │   ├── 📁 java
│       │   │   │   └── 📁 com
│       │   │   │       └── 📁 thiago
│       │   │   │           └── 📁 restaurante
│       │   │   │               ├── 📁 controllers
│       │   │   │               ├── 📁 enums
│       │   │   │               ├── 📁 models
│       │   │   │               ├── 📁 services
│       │   │   │               └── 📁 utils
│       │   │   └── 📁 resources
│       │   │       └── 📁 com
│       │   │           └── 📁 thiago
│       │   │               └── 📁 restaurante
│       │   │                   ├── 📁 styles
│       │   │                   └── 📁 views
│       └── 📁 target
│           └── 📁 classes
│               └── 📁 com
│                   └── 📁 thiago
│                       └── 📁 restaurante
│                           ├── 📁 controllers
│                           ├── 📁 enums
│                           ├── 📁 models
│                           ├── 📁 services
│                           ├── 📁 styles
│                           ├── 📁 utils
│                           └── 📁 views

```

## 👨‍💻 Autores

**Thiago Marzari**  
GitHub: [@ThiagoMarzari](https://github.com/ThiagoMarzari)

**Gabriel Saccol**  
GitHub: [@Gabrielzinho1518](https://github.com/Gabrielzinho1518)

**Gabriel Pinheiro**  
GitHub: [@gabriel99557](https://github.com/gabriel99557)

## 📄 Licença

Este projeto está licenciado sob os termos da [MIT License](LICENSE).



