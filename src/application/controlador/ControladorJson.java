package application.controlador;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import application.model.Administrador;
import application.model.Director;
import application.model.Medico;
import application.model.Seguridad;
import application.model.Zona;


public class ControladorJson {
	
	public static Director comprobarExistenteDirector ( String email , String password) {
		Director director = null;
		Vector<Director> lista = recorrerDirectores();
		
		for (Director d : lista) {
	
			if (d.getEmailUsuario().equals( email ) && d.getPassword().equals( password )) {
				
				director = d;
				
			}
			
		}
		
		return director;
		
	}

	public static Vector<Director> recorrerDirectores () {
		
		Vector<Director> lista = new Vector<Director>();
		
		try (Reader reader = new FileReader("src/application/model/json/directores.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Director>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Medico comprobarExistenteMedico ( String email , String password) {
		Medico medico = null;
		Vector<Medico> lista = recorrerMedicos();
		
		for (Medico d : lista) {
			
			if (d.getEmailUsuario().equals( email ) && d.getPassword().equals( password )) {
				
				medico = d;
				
			}
			
		}
		
		return medico;
		
	}

	public static Vector<Medico> recorrerMedicos () {
		
		Vector<Medico> lista = new Vector<Medico>();
		
		try (Reader reader = new FileReader("src/application/model/json/medicos.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Medico>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Seguridad comprobarExistenteSeguridad ( String email , String password ) {
		Seguridad seguridad = null;
		Vector<Seguridad> lista = recorrerSeguridades();
		
		for (Seguridad d : lista) {
			
			if (d.getEmailUsuario().equals( email ) && d.getPassword().equals( password )) {
				
				seguridad = d;
				
			}
			
		}
		
		return seguridad;
		
	}

	public static Vector<Seguridad> recorrerSeguridades () {
		
		Vector<Seguridad> lista = new Vector<Seguridad>();
		
		try (Reader reader = new FileReader("src/application/model/json/seguridad.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Seguridad>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Administrador comprobarExistenteAdministrador ( String email , String password ) {
		Administrador administrador = null;
		Vector<Administrador> lista = recorrerAdministradores();
		
		for (Administrador d : lista) {
			
			if (d.getEmailUsuario().equals( email ) && d.getPassword().equals( password )) {
				
				administrador = d;
				
			}
			
		}
		
		return administrador;
		
	}

	public static Vector<Administrador> recorrerAdministradores () {
		
		Vector<Administrador> lista = new Vector<Administrador>();
		
		try (Reader reader = new FileReader("src/application/model/json/administradores.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Administrador>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static Vector<Zona> recorrerZonas () {
		
		Vector<Zona> lista = new Vector<Zona>();
		
		try (Reader reader = new FileReader("src/application/model/json/zonas.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Zona>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
	
}
