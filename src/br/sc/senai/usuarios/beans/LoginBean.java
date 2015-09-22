package br.sc.senai.usuarios.beans;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.sc.senai.usuarios.model.Usuario;

@Named(value="loginBean")
@RequestScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private UsuarioBean usuarioBean;
	
	
	public void auth(){
		usuarioBean.redirect("Users/index.xhtml");		
	}
}
