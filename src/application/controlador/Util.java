package application.controlador;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
}
