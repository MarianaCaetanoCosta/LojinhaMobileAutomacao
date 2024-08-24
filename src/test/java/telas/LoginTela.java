package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginTela {
    //Preencher a informação de login

    //1° Crie um atributo
    private WebDriver app;

    //2° Crie um contrutor que recebe e retorna o atributo
    public LoginTela(WebDriver app){
        this.app = app;
    }
    //3° Definir os métodos de interação com os elementos
    public LoginTela preencherUsuario(String usuario){
        this.app.findElement(By.id("com.lojinha:id/user")).click();
        this.app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);
        return this; //vou ficar na mesma tela
    }

    public LoginTela preencherSenha(String senha){
        this.app.findElement(By.id("com.lojinha:id/password")).click();
        this.app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys(senha);
        return this;
    }

    public ListagemDeProdutosTela submeterLogin(){
        this.app.findElement(By.id("com.lojinha:id/loginButton")).click();
        return new ListagemDeProdutosTela(app);
    }
}
