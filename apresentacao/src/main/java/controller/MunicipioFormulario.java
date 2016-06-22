package controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import modelo.Municipio;


@Named("formulario")
@ApplicationScoped
public class MunicipioFormulario {

	@Inject
	private Municipio municipio;

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
}
