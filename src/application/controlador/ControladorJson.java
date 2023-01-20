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


public class ControladorJson {
	
	public static Director comprobarExistenteDirector ( String email ) {
		Director director = null;
		Vector<Director> lista = recorrerDirectores();
		System.out.println(lista.elementAt(0).getEmailUsuario());
		System.out.println(lista.elementAt(1).getEmailUsuario());
		System.out.println(lista.elementAt(2).getEmailUsuario());
		System.out.println(lista.elementAt(3).getEmailUsuario());
		
		for (Director d : lista) {
			
			if (d.getEmailUsuario().equals( email )) {
				
				director = d;
				
			}
			
		}
		
		return director;
		
	}

	public static Vector<Director> recorrerDirectores () {
		
		Vector<Director> lista = new Vector<Director>();
		
		try (Reader reader = new FileReader("src/application/model/json/directores.json")) {
			
			System.out.println("dentro del try");

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Director>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			
			System.out.println("dentro del else");

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Medico comprobarExistenteMedico ( String email ) {
		Medico medico = null;
		Vector<Medico> lista = recorrerMedicos();
		System.out.println(lista.elementAt(0).getEmailUsuario());
		System.out.println(lista.elementAt(1).getEmailUsuario());
		System.out.println(lista.elementAt(2).getEmailUsuario());
		System.out.println(lista.elementAt(3).getEmailUsuario());
		
		for (Medico d : lista) {
			
			if (d.getEmailUsuario().equals( email )) {
				
				medico = d;
				
			}
			
		}
		
		return medico;
		
	}

	public static Vector<Medico> recorrerMedicos () {
		
		Vector<Medico> lista = new Vector<Medico>();
		
		try (Reader reader = new FileReader("src/application/model/json/medicos.json")) {
			
			System.out.println("dentro del try");

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Medico>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			
			System.out.println("dentro del else");

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Seguridad comprobarExistenteSeguridad ( String email ) {
		Seguridad seguridad = null;
		Vector<Seguridad> lista = recorrerSeguridades();
		System.out.println(lista.elementAt(0).getEmailUsuario());
		System.out.println(lista.elementAt(1).getEmailUsuario());
		System.out.println(lista.elementAt(2).getEmailUsuario());
		System.out.println(lista.elementAt(3).getEmailUsuario());
		
		for (Seguridad d : lista) {
			
			if (d.getEmailUsuario().equals( email )) {
				
				seguridad = d;
				
			}
			
		}
		
		return seguridad;
		
	}

	public static Vector<Seguridad> recorrerSeguridades () {
		
		Vector<Seguridad> lista = new Vector<Seguridad>();
		
		try (Reader reader = new FileReader("src/application/model/json/seguridad.json")) {
			
			System.out.println("dentro del try");

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Seguridad>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			
			System.out.println("dentro del else");

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Administrador comprobarExistenteAdministrador ( String email ) {
		Administrador administrador = null;
		Vector<Administrador> lista = recorrerAdministradores();
		System.out.println(lista.elementAt(0).getEmailUsuario());
		System.out.println(lista.elementAt(1).getEmailUsuario());
		System.out.println(lista.elementAt(2).getEmailUsuario());
		System.out.println(lista.elementAt(3).getEmailUsuario());
		
		for (Administrador d : lista) {
			
			if (d.getEmailUsuario().equals( email )) {
				
				administrador = d;
				
			}
			
		}
		
		return administrador;
		
	}

	public static Vector<Administrador> recorrerAdministradores () {
		
		Vector<Administrador> lista = new Vector<Administrador>();
		
		try (Reader reader = new FileReader("src/application/model/json/administradores.json")) {
			
			System.out.println("dentro del try");

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Administrador>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			
			System.out.println("dentro del else");

			e.printStackTrace();
		}
		
		return lista;
	}
	
}
