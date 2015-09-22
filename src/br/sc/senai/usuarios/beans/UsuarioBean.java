package br.sc.senai.usuarios.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.sc.senai.usuarios.model.Usuario;


@Named
@SessionScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;
	private Usuario usuario;
	
	@PostConstruct
	public void inicializar(){
		usuario 	= new Usuario();
		usuarios 	= new ArrayList<Usuario>();
		usuarios.add(new Usuario("admin","admin",true));
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	//salvar
	public void salvar(){
		if(!this.usuarios.contains(this.usuario) ){
			this.usuarios.add(this.usuario);
		}
		this.usuario  = new Usuario();
		redirect("index.xhtml");
	}
	//editar
	public void editar(Usuario usuario){
		if(this.usuarios.contains(usuario)){
			this.usuario = usuario;
			redirect("cadastrar.xhtml");			
		}
	}
	//remover
	public void excluir(Usuario usuario){
		this.usuarios.remove(usuario);
	}
	
	public void redirect(String page){
		try {
			FacesContext.
						getCurrentInstance().
						getExternalContext().
						redirect(page);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
