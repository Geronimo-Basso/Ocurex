package application.controlador;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import application.model.Administrador;
import application.model.Director;
import application.model.Medico;
import application.model.Seguridad;

public class Util{
	
	public static boolean stringVacio( String mensaje ) {
		boolean devolucion = false;
		
		if( mensaje.isEmpty()|| mensaje.length()==0) {
			devolucion = true;
		}
		
		return devolucion;
	}
	
	public static int parsearInt( String numero ) {
		int devolucion = 0;
		try{
            devolucion = Integer.parseInt(numero);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
		
		return devolucion;
	}
	
    public static Director jsonADirector (String sJson) {
    	
    	Gson gson = new Gson();
    	
    	Director director = new Director();
    	
    	try (Reader reader = new FileReader (sJson)){
    		
    		director = gson.fromJson(reader, Director.class);

    	} catch (IOException e) {
    		
    	e.printStackTrace();
    	
    	}
    	
    	return director;
    	
    }
    
    public static Medico jsonAMedico (String sJson) {
    	
    	Gson gson = new Gson();
    	
    	Medico medico = new Medico();
    	
    	try (Reader reader = new FileReader (sJson)){
    		
    		medico = gson.fromJson(reader, Medico.class);

    	} catch (IOException e) {
    		
    	e.printStackTrace();
    	
    	}
    	
    	return medico;
    	
    }
    public static Seguridad jsonASeguridad (String sJson) {
    	
    	Gson gson = new Gson();
    	
    	Seguridad seguridad = new Seguridad();
    	
    	try (Reader reader = new FileReader (sJson)){
    		
    		seguridad = gson.fromJson(reader, Seguridad.class);

    	} catch (IOException e) {
    		
    	e.printStackTrace();
    	
    	}
    	
    	return seguridad;
    	
    }
    
    public static Administrador jsonAAdministrador (String sJson) {
    	
    	Gson gson = new Gson();
    	
    	Administrador administrador = new Administrador();
    	
    	try (Reader reader = new FileReader (sJson)){
    		
    		administrador = gson.fromJson(reader, Administrador.class);

    	} catch (IOException e) {
    		
    	e.printStackTrace();
    	
    	}
    	
    	return administrador;
    	
    }

}
