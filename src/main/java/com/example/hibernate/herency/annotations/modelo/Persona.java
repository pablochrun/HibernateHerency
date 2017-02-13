package com.example.hibernate.herency.annotations.modelo;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //INDICA QUE LA CLASE Y SUBCLASES ESTARÁN EN LA MISMA TABLA.
@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.STRING)
public abstract class Persona implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5029009655390616430L;
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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