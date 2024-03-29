package application.controlador;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;

import application.controlador.excepciones.DatosVacios;
import application.model.Prisionero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXTextField;

public class CRegistrarPrisionero {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnRegistrarse;

    @FXML
    private JFXTextField jfxDelito;

    @FXML
    private JFXTextField jfxEdad;

    @FXML
    private JFXTextField jfxSexo;

    @FXML
    private JFXTextField jfxApellido;

    @FXML
    private JFXTextField jfxNombre;

    @FXML
    private Label label;

    @FXML
    private JFXDatePicker jfxFechaNacimiento;

    @FXML
    private JFXDatePicker jfxFechaSalida;

    @FXML
    void volverAlMenu(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();
    	
    	try {
 
			FXMLLoader loader7 = new FXMLLoader(getClass().getResource("/application/view/Director.fxml")); //Cargo el loader
			
			CDirector controlador7 = new CDirector(); //creo el controlador
		
			loader7.setController(controlador7); //seteo el controlador con el loader que cree antes.
			
			Parent root7 = loader7.load(); //lo pongo como parent
			
			Scene scene = new Scene( root7 );
			
			stage.setScene( scene );
									
			stage.show();//muestro la el archivo.
			
			priorStage.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    
    @FXML
    void registrarse(ActionEvent event) throws DatosVacios {
    	

    	try {
        	String nombre = jfxNombre.getText();
        	String apellido = jfxApellido.getText();
        	String sexo = jfxSexo.getText();
        	LocalDate fechaNacimiento = jfxFechaNacimiento.getValue(); 
        	int edad = Util.parsearInt(jfxEdad.getText());
        	String delito = jfxDelito.getText();
        	LocalDate fechaSalida = jfxFechaNacimiento.getValue(); 


        
	    	if (Util.stringVacio(nombre) || Util.stringVacio(apellido) ||  Util.stringVacio(sexo) || Util.stringVacio(delito) || edad == 0 || fechaNacimiento == null || fechaSalida == null){
	    	
	    		throw new DatosVacios("Alguno de los datos esta mal");
	    	}
			
	    	//json related
			Prisionero prisionero0 = new Prisionero( "1", "Victor", "Marlor" , "H" ,LocalDate.of(2003 , 5 , 20), 68 , "Daños" , LocalDate.of(2025,5,22));
			Prisionero prisionero1 = new Prisionero( Util.getAlphaNumericString(15) , "Nico", "Salmeron" , "H" ,LocalDate.of(1954 , 5 , 20), 68 , "Usurpacion" , LocalDate.of(2028,5,25));
			Prisionero prisionero2 = new Prisionero( Util.getAlphaNumericString(15) , "Hector", "Valdes" , "H" ,LocalDate.of(1932 , 7 , 7), 90 , "Daños" , LocalDate.of(2025,2,25));
			Prisionero prisionero3 = new Prisionero( Util.getAlphaNumericString(15) , "Seve", "Goicoechea" , "H" ,LocalDate.of(1912 , 2 , 28), 105 , "Falsedades documentales" , LocalDate.of(2024,7,14));
			Prisionero prisionero4 = new Prisionero( Util.getAlphaNumericString(15) , "Ricardo", "Enriquez" , "H" ,LocalDate.of(1917 , 7 , 7), 90 , "Daños" , LocalDate.of(2025,2,25));
			Prisionero prisionero5 = new Prisionero( Util.getAlphaNumericString(15) , "Guadalupe", "Garcia" , "F" ,LocalDate.of(1997 , 9 , 21), 25 , "Robos" , LocalDate.of(2024,4,22));
			Prisionero prisionero6 = new Prisionero( Util.getAlphaNumericString(15) , "Florencia", "Palau" , "F" ,LocalDate.of(1997 , 11 , 12), 90 , "Daños" , LocalDate.of(2028,11,25));
			Prisionero prisionero7 = new Prisionero( Util.getAlphaNumericString(15) , "Kike", "Caro" , "H" ,LocalDate.of(1920 , 2 , 10), 102 , "Usurpacion" , LocalDate.of(2030,5,29));
			Prisionero prisionero8 = new Prisionero( Util.getAlphaNumericString(15) , "Vidal", "Bardia" , "H" ,LocalDate.of(1947 , 1 , 11), 75 , "Daños a la propiedad privada" , LocalDate.of(2025,1,3));
			Prisionero prisionero9 = new Prisionero( Util.getAlphaNumericString(15) , "Juan", "Pérez" , "M" ,LocalDate.of(1985 , 1 , 15), 38 , "Robo" , LocalDate.of(2022,10,5));
			Prisionero prisionero10 = new Prisionero( Util.getAlphaNumericString(15) , "Maria", "Garcia" , "F" ,LocalDate.of(1980 , 3 , 25), 43 , "Asesinato" , LocalDate.of(2030,5,10));
			Prisionero prisionero11 = new Prisionero( Util.getAlphaNumericString(15) , "Pedro", "Sánchez" , "M" ,LocalDate.of(1990 , 7 , 30), 33 , "Trafico de drogas" , LocalDate.of(2024,3,15));
			Prisionero prisionero12 = new Prisionero( Util.getAlphaNumericString(15) , "Ana", "Martinez" , "F" ,LocalDate.of(1995 , 12 , 10), 28 , "Estafa" , LocalDate.of(2021,8,20));
			Prisionero prisionero13 = new Prisionero( Util.getAlphaNumericString(15) , "Carlos", "Gómez" , "M" ,LocalDate.of(2000 , 4 , 20), 23 , "Secuestro" , LocalDate.of(2025,6,5));
			Prisionero prisionero14 = new Prisionero( Util.getAlphaNumericString(15) , "Isabel", "Rodriguez" , "F" ,LocalDate.of(1987 , 8 , 15), 36 , "Violación" , LocalDate.of(2027,2,10));
			Prisionero prisionero15 = new Prisionero( Util.getAlphaNumericString(15) , "Juan Carlos", "Fernández" , "M" ,LocalDate.of(1992 , 2 , 28), 31 , "Terrorismo" , LocalDate.of(2029,11,15));
			Prisionero prisionero16 = new Prisionero( Util.getAlphaNumericString(15) , "Sofia", "Lopez" , "F" ,LocalDate.of(1998 , 5 , 10), 25 , "Fraude" , LocalDate.of(2022,1,5));
			Prisionero prisionero17 = new Prisionero( Util.getAlphaNumericString(15) , "David", "Gonzalez" , "M" ,LocalDate.of(1994 , 11 , 20), 29 , "Corrupción" , LocalDate.of(2024,7,15));
			Prisionero prisionero18 = new Prisionero( Util.getAlphaNumericString(15) , "Lucia", "Jimenez" , "F" ,LocalDate.of(2001 , 6 , 30), 22 , "Tráfico humano" , LocalDate.of(2026,3,5));
			Prisionero prisionero19 = new Prisionero( Util.getAlphaNumericString(15) , "Jorge", "Moreno" , "M" ,LocalDate.of(1989 , 9 , 10), 34 , "Lesiones graves" , LocalDate.of(2023,4,15));
			Prisionero prisionero20 = new Prisionero( Util.getAlphaNumericString(15) , "Alejandra", "Muñoz" , "F" ,LocalDate.of(1996 , 1 , 20), 27 , "Intento de homicidio" , LocalDate.of(2028,8,10));
			Prisionero prisionero21 = new Prisionero( Util.getAlphaNumericString(15) , "Miguel", "Romero" , "M" ,LocalDate.of(1991 , 7 , 25), 32 , "Extorsión" , LocalDate.of(2022,12,5));
			Prisionero prisionero22 = new Prisionero( Util.getAlphaNumericString(15) , "Eduardo", "Navarro" , "M" ,LocalDate.of(1984 , 3 , 10), 39 , "Piratería informática" , LocalDate.of(2024,5,20));
			Prisionero prisionero23 = new Prisionero( Util.getAlphaNumericString(15) , "Rebeca", "Torres" , "F" ,LocalDate.of(1999 , 8 , 15), 24 , "Blanqueo de capitales" , LocalDate.of(2026,1,10));
			Prisionero prisionero24 = new Prisionero( Util.getAlphaNumericString(15) , "Alberto", "Gómez" , "M" ,LocalDate.of(1997 , 12 , 30), 26 , "Drogadicción" , LocalDate.of(2028,6,15));
			Prisionero prisionero25 = new Prisionero( Util.getAlphaNumericString(15) , "Mercedes", "Pérez" , "F" ,LocalDate.of(1993 , 2 , 15), 30 , "Delitos ambientales" , LocalDate.of(2029,9,5));
			Prisionero prisionero = new Prisionero( Util.getAlphaNumericString(15) ,nombre , apellido , sexo , fechaNacimiento , edad , delito , fechaSalida );


	    	Vector<Prisionero> prisioneros = new Vector<Prisionero>();
	    	prisioneros.add(prisionero0);
	    	prisioneros.add(prisionero1);
	    	prisioneros.add(prisionero2);
	    	prisioneros.add(prisionero3);
	    	prisioneros.add(prisionero4);
	    	prisioneros.add(prisionero5);
	    	prisioneros.add(prisionero6);
	    	prisioneros.add(prisionero7);
	    	prisioneros.add(prisionero8);
	    	prisioneros.add(prisionero9);
	    	prisioneros.add(prisionero10);
	    	prisioneros.add(prisionero11);
	    	prisioneros.add(prisionero12);
	    	prisioneros.add(prisionero13);
	    	prisioneros.add(prisionero14);
	    	prisioneros.add(prisionero15);
	    	prisioneros.add(prisionero16);
	    	prisioneros.add(prisionero17);
	    	prisioneros.add(prisionero18);
	    	prisioneros.add(prisionero19);
	    	prisioneros.add(prisionero20);
	    	prisioneros.add(prisionero21);
	    	prisioneros.add(prisionero22);
	    	prisioneros.add(prisionero23);
	    	prisioneros.add(prisionero24);
	    	prisioneros.add(prisionero25);
	    	prisioneros.add(prisionero);
			
			Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			String representacionBonita = prettyGson.toJson(prisioneros);
			System.out.println(representacionBonita);
			
			
			try(FileWriter writer = new FileWriter("src/application/model/json/presos.json")){
				
				prettyGson.toJson(prisioneros, writer);
				
		    } catch (IOException e) {
		    	
		        e.printStackTrace();
		        
		    }
			
	    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
	    	Stage stage = new Stage();
	
	    	try {
	 
				FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/application/view/Director.fxml")); //Cargo el loader
				
				CDirector controlador8 = new CDirector(); //creo el controlador
			
				loader8.setController(controlador8); //seteo el controlador con el loader que cree antes.
				
				Parent root8 = loader8.load(); //lo pongo como parent
				
				Scene scene = new Scene( root8 );
				
				stage.setScene(scene);
				
				stage.show();
										
				priorStage.close();	
	
				
			} catch(Exception e) {
				e.printStackTrace();
			}		
    		
    	}catch (Exception e) {
    		label.setText( "ERROR! Datos INCORRECTOS" );
    	}
    	
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
		
}

