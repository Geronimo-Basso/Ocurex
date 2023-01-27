package application.controlador;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Vector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import application.model.Celda;
import application.model.ConsultaMedica;
import application.model.Director;
import application.model.Medico;
import application.model.Prisionero;
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
	
	public static Medico comprobarExistenteMedicoEmail ( String email ) {
		Medico medico = null;
		Vector<Medico> lista = recorrerMedicos();
		
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
	
	public static Prisionero comprobarExistentePrisionero ( String idPrisionero ) {
		Prisionero prisionero = null;
		Vector<Prisionero> lista = recorrerPrisioneros();
		
		for (Prisionero d : lista) {
			
			if (d.getIdentificadorPreso().equals( idPrisionero )) {
				
				prisionero = d;
				
			}
			
		}
		
		return prisionero;
		
	}

	public static Vector<Prisionero> recorrerPrisioneros () {
		
		Vector<Prisionero> lista = new Vector<Prisionero>();
		
		try (Reader reader = new FileReader("src/application/model/json/presos.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Prisionero>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static ConsultaMedica comprobarExistenteConsultaMedica ( String id) {
		ConsultaMedica consultamedica = null;
		Vector<ConsultaMedica> lista = recorrerConsultasMedicas();
		
		for (ConsultaMedica d : lista) {
			
			if (d.getIdConsulta().equals( id )) {
				
				consultamedica = d;
				
			}
			
		}
		
		return consultamedica;
		
	}

	public static Vector<ConsultaMedica> recorrerConsultasMedicas () {
		
		Vector<ConsultaMedica> lista = new Vector<ConsultaMedica>();
		
		try (Reader reader = new FileReader("src/application/model/json/historias.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<ConsultaMedica>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static Vector<Celda> recorrerConsultasCelda() {
		
		Vector<Celda> lista = new Vector<Celda>();
		
		try (Reader reader = new FileReader("src/application/model/json/celdas.json")) {
			

			Gson gson = new Gson();
			
			Type tipoLista = new TypeToken<Vector<Celda>>() {
				
			}.getType();
			lista = gson.fromJson(reader, tipoLista);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
		return lista;
	}
	
}
