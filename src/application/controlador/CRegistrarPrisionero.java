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
 
			FXMLLoader loader7 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador7 = new CIniciarSesion(); //creo el controlador
		
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
        	String id = "9";

        
	    	if (Util.stringVacio(nombre) || Util.stringVacio(apellido) ||  Util.stringVacio(sexo) || Util.stringVacio(delito) || edad == 0 || fechaNacimiento == null || fechaSalida == null){
	    	
	    		throw new DatosVacios("Alguno de los datos esta mal");
	    	}
			
	    	//json related
			Prisionero prisionero1 = new Prisionero( "1" , "Nico", "Salmeron" , "H" ,LocalDate.of(1954 , 5 , 20), 68 , "Usurpacion" , LocalDate.of(2028,5,25));
			Prisionero prisionero2 = new Prisionero( "2" , "Hector", "Valdes" , "H" ,LocalDate.of(1932 , 7 , 7), 90 , "Daños" , LocalDate.of(2025,2,25));
			Prisionero prisionero3 = new Prisionero( "3" , "Seve", "Goicoechea" , "H" ,LocalDate.of(1912 , 2 , 28), 105 , "Falsedades documentales" , LocalDate.of(2024,7,14));
			Prisionero prisionero4 = new Prisionero( "4" , "Ricardo", "Enriquez" , "H" ,LocalDate.of(1917 , 7 , 7), 90 , "Daños" , LocalDate.of(2025,2,25));
			Prisionero prisionero5 = new Prisionero( "5" , "Guadalupe", "Garcia" , "F" ,LocalDate.of(1997 , 9 , 21), 25 , "Robos" , LocalDate.of(2024,4,22));
			Prisionero prisionero6 = new Prisionero( "6" , "Florencia", "Palau" , "F" ,LocalDate.of(1997 , 11 , 12), 90 , "Daños" , LocalDate.of(2028,11,25));
			Prisionero prisionero7 = new Prisionero( "7" , "Kike", "Caro" , "H" ,LocalDate.of(1920 , 2 , 10), 102 , "Usurpacion" , LocalDate.of(2030,5,29));
			Prisionero prisionero8 = new Prisionero( "8" , "Vidal", "Bardia" , "H" ,LocalDate.of(1947 , 1 , 11), 75 , "Daños a la propiedad privada" , LocalDate.of(2025,1,3));
			Prisionero prisionero = new Prisionero( id ,nombre , apellido , sexo , fechaNacimiento , edad , delito , fechaSalida );

	    	Vector<Prisionero> prisioneros = new Vector<Prisionero>();
	    	prisioneros.add(prisionero1);
	    	prisioneros.add(prisionero2);
	    	prisioneros.add(prisionero3);
	    	prisioneros.add(prisionero4);
	    	prisioneros.add(prisionero5);
	    	prisioneros.add(prisionero6);
	    	prisioneros.add(prisionero7);
	    	prisioneros.add(prisionero8);
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
	 
				FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
				
				CIniciarSesion controlador8 = new CIniciarSesion(); //creo el controlador
			
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
    		label.setText( "ERROR ! ALGUNO DE LOS DATOS ESTA MAL INGRESADO" );
    	}
    	
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
		
}

