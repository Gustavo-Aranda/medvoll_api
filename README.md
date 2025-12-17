# Med.Voll API 🏥

API REST para gerenciamento de uma clínica médica, desenvolvida durante os estudos na Alura. A aplicação permite um CRUD completo de pacientes e médicos.

## 🛠 Tecnologias Utilizadas
* **Java 17**
* **Spring Boot 3**
* **Gradle** (Gerenciador de dependências)
* **MySQL** (Banco de dados)
* **Flyway** (Migração de banco de dados)
* **Lombok** (Produtividade Java)

## 🚀 Como Rodar o Projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado:
* [JDK 17+](https://www.oracle.com/java/technologies/downloads/)
* [MySQL](https://www.mysql.com/downloads/)
* Uma IDE (IntelliJ, Eclipse, VS Code)

### ⚙️ Configuração do Banco de Dados
A aplicação utiliza variáveis de ambiente para proteger dados sensíveis. Você pode configurar as credenciais no seu sistema ou editar o arquivo `src/main/resources/application_example.properties`:

1. Crie um banco de dados chamado: `vollmed_api`
2. Configure as variáveis de ambiente:
   - `DB_USERNAME`: seu usuário do MySQL
   - `DB_PASSWORD`: sua senha do MySQL

Ou altere diretamente no `application_example.properties`:
```
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha 
```
## 🏃 Execução

No terminal, na raiz do projeto, execute:

`./gradlew bootRun`

O servidor iniciará na porta 8080.

## 📂 Estrutura de Endpoints

A API possui os seguintes recursos (exemplos):

### Médicos

   - **POST** /medicos - Cadastro de médicos

   - **GET** /medicos - Listagem de médicos (paginada)

   - **PUT** /medicos - Atualização de dados

   - **DELETE** /medicos/{id} - Exclusão lógica

### Pacientes

   - **POST** /pacientes - Cadastro de pacientes

   - **GET** /pacientes - Listagem de pacientes (paginada)

   - **PUT** /pacientes - Atualização de dados

   - **DELETE** /pacientes/{id} - Exclusão lógica


### 📖 Documentação da API (Swagger)

Para visualizar e testar os endpoints da API de forma interativa, siga os passos abaixo:

1. Inicie a aplicação.
2. Acesse no navegador: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

Lá você encontrará a lista de todos os controladores, modelos e poderá executar as requisições diretamente pela interface.
