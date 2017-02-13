package com.example.hibernate.herency.annotations.modelo;

public class Tester extends Tecnologo
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2363018914753968059L;
	private String herramientaDeTesteo;
    
    public Tester()
    {
    }

    public Tester(String nombre, int edad, int aniosDeEstudios, String herramientaDeTesteo)
    {
        super(nombre, edad, aniosDeEstudios);
        this.herramientaDeTesteo = herramientaDeTesteo;
    }
    
    public String getHerramientaDeTesteo()
    {
        return herramientaDeTesteo;
    }

    public void setHerramientaDeTesteo(String herramientaDeTesteo)
    {
        this.herramientaDeTesteo = herramientaDeTesteo;
    }
}