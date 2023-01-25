package application.controlador;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jfoenix.controls.JFXButton;

import application.controlador.excepciones.DatosVacios;
import application.model.Director;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXTextField;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class CRegistrarDirector {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnRegistrarse;

    @FXML
    private JFXTextField jfxDomicilio;

    @FXML
    private JFXTextField jfxTelefono;

    @FXML
    private JFXTextField jfxApellido;

    @FXML
    private JFXTextField jfxSexo;

    @FXML
    private JFXTextField jfxNombre;

    @FXML
    private JFXTextField jfxEmail;

    @FXML
    private JFXPasswordField jfxPassword;
    
    @FXML
    private Label label;

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
        	String email = jfxEmail.getText();
        	String nombre = jfxNombre.getText();
        	String apellido = jfxApellido.getText();
        	String password = jfxPassword.getText();
        	int telefono = Util.parsearInt(jfxTelefono.getText());
        	String sexo = jfxSexo.getText();
        	String domicilio = jfxDomicilio.getText();
        
	    	if (Util.stringVacio(email) || Util.stringVacio(nombre) || Util.stringVacio(apellido) || Util.stringVacio(password) || Util.stringVacio(sexo) || Util.stringVacio(domicilio) || telefono == 0){
	    	
	    		throw new DatosVacios("Alguno de los datos esta mal");
	    	}
			
	    	//json related
			Director director = new Director( email , nombre , apellido , password , telefono , sexo , domicilio , LocalDate.now());
			Director director1 = new Director( "federico.fernandez@example.com", "Federico", "Fernandez" , "uruguay2020" ,672122544 , "Gran via 4, 28019" , "M" , LocalDate.of(2022,5,25));
			Director director2 = new Director( "fernando.alonso@example.com", "Fernando", "Alonso" , "iniesta2010" ,621125255 , "Pablo Alonzo 7, 28019" , "M" , LocalDate.of(2021,7,29));
			Director director3 = new Director( "agustin.sosa@example.com", "Agustin", "Sosa" ,"password123",687754854 , "Calle tajo 27, 28670" , "M" , LocalDate.of(2021,9,25));
			Director director4 = new Director( "federico.fernandez@example.com", "Manuela", "Barrios" , "abcdefg987" ,672154784 , "Calle principe asturias 12, 28670" , "F" , LocalDate.of(2020,5,20));
			Director director5 = new Director( "andrew.tate@example.com", "Andrew", "Tate" , "topg5577" ,621321457 , "Los tilos 12, 28571" , "M" , LocalDate.of(2021,2,15));
			Director director6 = new Director( "tristian.blanco@example.com", "Tristan", "Blanco" , "tristanb74" ,657894521 , "Rafel Alberti, 28670" , "M" , LocalDate.of(2022,1,23));
			Director director7 = new Director( "javier.ramirez@example.com", "Javier", "Ramirez" ,"tati1245",687541201 , "Benigno Granizo 1, 28654" , "M" , LocalDate.of(2023,1,10));
			Director director8 = new Director( "jorge.garcia@example.com", "Jorge", "Garcia" , "richpor7" ,652147587 , "Pegasus drive 28,24714" , "M" , LocalDate.of(2021,7,9));
			
	    	Vector<Director> directores = new Vector<Director>();
	    	directores.add(director);
	    	directores.add(director1);
	    	directores.add(director2);
	    	directores.add(director3);
	    	directores.add(director4);
	    	directores.add(director5);
	    	directores.add(director6);
	    	directores.add(director7);
	    	directores.add(director8);


			
			Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			String representacionBonita = prettyGson.toJson(directores);
			System.out.println(representacionBonita);
			
			
			try(FileWriter writer = new FileWriter("src/application/model/json/directores.json")){
				
				prettyGson.toJson(directores, writer);
				
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

