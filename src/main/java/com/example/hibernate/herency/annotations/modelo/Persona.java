package com.example.hibernate.herency.annotations.modelo;

import java.io.Serializable;

public abstract class Persona implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5029009655390616430L;
	private long id;
    private String nombre;
    private int edad;

    public Persona()
    {
    }

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public long getId()
    {
        return id;
    }

    protected void setId(long id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}