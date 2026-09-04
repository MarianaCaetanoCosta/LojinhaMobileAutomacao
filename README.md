## 📱 Lojinha Mobile — Automação de Testes com JUnit e Appium

Projeto de automação de testes mobile da aplicação Lojinha, desenvolvido utilizando Java, JUnit e Appium.

O projeto tem como objetivo demonstrar a criação e execução de testes automatizados para o fluxo de login e cadastro de produtos, incluindo a validação de regras de negócio relacionadas ao valor do produto.

## 🎯 Objetivo

Automatizar e validar o fluxo de utilização da aplicação Lojinha Mobile, contemplando:

1. Autenticação do usuário;
2. Cadastro de produto;
3. Validação das regras de negócio;
4. Validação dos valores permitidos para o produto.

## 🧪 Cenários automatizados

Os testes contemplam as principais funcionalidades da aplicação:

1. 🔐 Login
2. 📦 Cadastro de produto
3. 💰 Validação do valor do produto utilizando partições de equivalência

## Preparação do ambiente

* [Intellij](https://www.jetbrains.com/idea/download/?section=windows)
 
* [Android Studio](https://developer.android.com/studio?hl=pt-br#downloads) (Baixar o Android Studio e Ferramenta de Linha de comando)
 
* [Android SDK](https://androidsdkmanager.azurewebsites.net/build_tools.html)

* [Appium](https://github.com/appium/appium-desktop/releases)

* [Appium Inspector](https://github.com/appium/appium-inspector)

## Dependências

* [Api Junit Jupter](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.11.0-M2)
* [Appium Java-client ](https://mvnrepository.com/artifact/io.appium/java-client/9.2.3)

## Notas Gerais

* Notações:
   - **DisplayName** para dar descrições em português para nossos testes.

   - **Before Each**: para capturar o usuário e senha que será utilizado posteriormente nos métodos de teste.
    
* Desing Pattern:
   - **Page Object Model** : O Page Object Model é usado em testes de automação, onde cada página é representada como uma classe. A classe contém os elementos e ações que podem ser realizados na página. Isso torna o código de teste mais sustentável, pois as alterações na página podem ser feitas em um só lugar, em vez de em vários testes.

## Apresentação


https://github.com/user-attachments/assets/1966595c-b130-498c-8bde-925af6e04d6f


## 👩‍💻 Sobre o projeto

Projeto desenvolvido como parte do meu portfólio de **Qualidade de Software e Automação de Testes**, com foco na aplicação prática de **Java, JUnit e Appium** para criação e execução de testes automatizados em aplicações mobile.

O projeto demonstra desde a **configuração do ambiente e identificação dos elementos da aplicação** até a **automação dos fluxos de login e cadastro de produtos, aplicação de partições de equivalência e organização dos testes utilizando o padrão Page Object Model**.



