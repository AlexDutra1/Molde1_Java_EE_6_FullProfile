package controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("municipioController")
@ApplicationScoped
public class MunicipioController {

	@Inject
	private MunicipioFormulario formulario;
	
	public void cadastrar(){
		System.out.println("NOME----: "+formulario.getMunicipio().getNome());
	}
	
	
	
	
	public MunicipioFormulario getFormulario() {
		return formulario;
	}

	public void setFormulario(MunicipioFormulario formulario) {
		this.formulario = formulario;
	}
	
}
