package com.vacuna.Vacuna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vacuno")
public class Vacuna{
    private int id;
    private String nombre;
    private float pfizer;
    private float moderna;
    private float administrado;
    private float vacunados;

    public Vacuna() {
    }
    
    
   
    public Vacuna(int id, String nombre, float pfizer, float moderna, float administrado, float vacunados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pfizer = pfizer;
		this.moderna = moderna;
		this.administrado = administrado;
		this.vacunados = vacunados;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
	
	
	

	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public float getPfizer() {
		return pfizer;
	}



	public void setPfizer(float pfizer) {
		this.pfizer = pfizer;
	}



	public float getModerna() {
		return moderna;
	}



	public void setModerna(float moderna) {
		this.moderna = moderna;
	}



	public float getAdministrado() {
		return administrado;
	}



	public void setAdministrado(float administrado) {
		this.administrado = administrado;
	}



	public float getVacunados() {
		return vacunados;
	}



	public void setVacunados(float vacunados) {
		this.vacunados = vacunados;
	}
	
	
}