package com.example.hibernate.herency.annotations.modelo;

public class Programador extends Tecnologo
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3107271851383137014L;
	private String lenguajeFavorito;
    private int aniosDeExperiencia;

    public Programador()
    {
    }

    public Programador(String nombre, int edad, int aniosDeEstudios, String lenguajeFavorito, int aniosDeExperiencia)
    {
        super(nombre, edad, aniosDeEstudios);
        this.lenguajeFavorito = lenguajeFavorito;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public int getAniosDeExperiencia()
    {
        return aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(int aniosDeExperiencia)
    {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public String getLenguajeFavorito()
    {
        return lenguajeFavorito;
    }

    public void setLenguajeFavorito(String lenguajeFavorito)
    {
        this.lenguajeFavorito = lenguajeFavorito;
    }
}
