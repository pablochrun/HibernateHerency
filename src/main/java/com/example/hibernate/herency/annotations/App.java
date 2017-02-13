package com.example.hibernate.herency.annotations;

import com.example.hibernate.herency.annotations.dao.AbstractDAO;
import com.example.hibernate.herency.annotations.modelo.Normal;
import com.example.hibernate.herency.annotations.modelo.Programador;
import com.example.hibernate.herency.annotations.modelo.Tecnologo;
import com.example.hibernate.herency.annotations.modelo.Tester;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Normal      normal       = new Normal("normal", 21, "Empleado");
        Tecnologo   tecnologo    = new Tecnologo("tecnologo", 24, 4);
        Programador programador1 = new Programador("primer programador", 25, 4, "java", 4);
        Programador programador2 = new Programador("segundo programador", 25, 5, "java", 2);
        Tester      tester       = new Tester("tester", 18, 3, "JUnit");
        
        /* Almacena en BD, necesito BD instalada.
        AbstractDAO.almacenaEntidad(normal);
        AbstractDAO.almacenaEntidad(tecnologo);
        AbstractDAO.almacenaEntidad(programador1);
        AbstractDAO.almacenaEntidad(programador2);
        AbstractDAO.almacenaEntidad(tester);
		*/
        
    }
}
