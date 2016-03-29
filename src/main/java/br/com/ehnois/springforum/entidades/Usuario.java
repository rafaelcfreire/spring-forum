package br.com.ehnois.springforum.entidades;

public class Usuario {
  
  private String login;
  
  private transient String senha;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
  
  
}
