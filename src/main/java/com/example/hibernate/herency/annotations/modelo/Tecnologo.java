package com.example.hibernate.herency.annotations.modelo;

public class Tecnologo extends Persona
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2768578190218860733L;
	private int aniosDeEstudios;
    
    public Tecnologo()
    {
    }

    public Tecnologo(String nombre, int edad, int aniosDeEstudios)
    {
        super(nombre, edad);
        this.aniosDeEstudios = aniosDeEstudios;
    }

    public int getAniosDeEstudios()
    {
        return aniosDeEstudios;
    }

    public void setAniosDeEstudios(int aniosDeEstudios)
    {
        this.aniosDeEstudios = aniosDeEstudios;
    }
}
