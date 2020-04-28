package com.ufv.mozapaquito;

import java.io.BufferedReader;
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
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

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
       
        anadirContacto("cree", contactos);
        anadirContacto("vvc", contactos);
        try (Writer writer = new FileWriter("Output.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(contactos, writer);
        } catch (IOException e) {}
      leerJason(contactos);
    }
    public static void anadirContacto(String name, ArrayList<Contacto> contacts) {
    	Contacto contacto = new Contacto(name);
    	contacts.add(contacto);
    }
    public static void leerJason(ArrayList<Contacto> contacts) {
    	Gson gson = new Gson();
    	Type userListType = new TypeToken<ArrayList<Contacto>>(){}.getType();
    	try {
    	    File	archivo  = new File("alumnos.json");
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader br = new BufferedReader(fr);
			
			
			contacts = gson.fromJson(fr, userListType);
			
		   //String linea = br.readLine();
		   System.out.println(contacts.get(0));
    	} catch (Exception ex) {
    	    ex.printStackTrace();
    	}
    }
  	 
}
