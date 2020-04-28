package com.ufv.mozapaquito;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufv.mozapaquito.Contacto;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ArrayList<Contacto> contactos = new ArrayList<>();
        leerJason(contactos);
        anadirContacto("caca", contactos);
        anadirContacto("pepe", contactos);
        try (Writer writer = new FileWriter("Output.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(contactos, writer);
        } catch (IOException e) {}
        
    }
    public static void anadirContacto(String name, ArrayList<Contacto> contacts) {
    	Contacto contacto = new Contacto(name);
    	contacts.add(contacto);
    }
    public static void leerJason(ArrayList<Contacto> contacts) {
    	try {
    	    // create Gson instance
    	    Gson gson = new Gson();
    	    // create a reader
    	    Reader reader = Files.newBufferedReader(Paths.get("Output.json"));
    	    // convert JSON string to User object
    	    contacts.add(gson.fromJson(reader, Contacto.class));
    	    reader.close();

    	} catch (Exception ex) {
    	    ex.printStackTrace();
    	}
    }
  	 
}
