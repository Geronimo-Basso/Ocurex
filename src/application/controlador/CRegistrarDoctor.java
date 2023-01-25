package application.controlador;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import application.controlador.excepciones.DatosVacios;
import application.model.Director;
import application.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class CRegistrarDoctor {

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
    private JFXTextField jfxEspecialidad;
    
    @FXML
    private Label label;


    @FXML
    void volverAlMenu(ActionEvent event) {
    
    	//dar alerta de que se guardo el director en el json
		
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
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
	    	String especialidad = jfxEspecialidad.getText();
	
	    	if (Util.stringVacio(email) || Util.stringVacio(nombre) || Util.stringVacio(apellido) || Util.stringVacio(password) || Util.stringVacio(sexo) || Util.stringVacio(domicilio) || telefono == 0 || Util.stringVacio(especialidad)){
		    	
	    		throw new DatosVacios("Alguno de los datos esta mal");
	    	}
	    	
			Medico medico = new Medico( email , nombre , apellido , password ,especialidad , telefono , domicilio , sexo , LocalDate.now());
			Medico medico1 = new Medico( "angel.charte@example.com" , "Angel" , "Chartel" , "ibuprofeno1" , "Medicina familiar" , 624785123 , "C/Principe Asturias 25, 28670" , "M" , LocalDate.of(2020,9,12));
			Medico medico2 = new Medico( "rafael.mur@example.com" , "Rafael" , "Mur" , "farmacia72" , "Traumatologia" , 658412784 , "C/Tajo 12, 28670" , "M" , LocalDate.of( 2021 , 7 , 12 ));
			Medico medico3 = new Medico( "damian.olmo@example.com" , "Damian" , "Olmo" , "garganta79" , "Cirugia" , 632478652 , "C/San Francisco 22, 28670" , "M" , LocalDate.of( 2022 , 5 , 10));
			Medico medico4 = new Medico( "fernando.otero@example.com" , "Fernando" , "Oter" , "ferna7415" , "Cirugia" , 632784521 , "C/ 10 y 49, 25745" , "M" , LocalDate.of( 2022 , 10 , 10 ));
			Medico medico5 = new Medico( "iman.ghazi@example.com" , "Iman" , "Ghazi" , "workkk247" , "Medicina Familiar" , 624789142 , "C/ Los libertadores 72, 28670" , "M" , LocalDate.of( 2023 , 1 , 5 ));
			Medico medico6 = new Medico( "susana.fernandez@example.com" , "Susana" , "Fernandez" , "su0587fe" , "Traumatologia" , 684521012 , "C/ Nandos 27, 28019" , "F" , LocalDate.of( 2022 , 12 , 12));

	    	Vector<Medico> medicos = new Vector<Medico>();
	    	medicos.add(medico);
	    	medicos.add(medico1);
	    	medicos.add(medico2);
	    	medicos.add(medico3);
	    	medicos.add(medico4);
	    	medicos.add(medico5);
	    	medicos.add(medico6);

			
			Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			String representacionBonita = prettyGson.toJson(medicos);
			System.out.println(representacionBonita);
			
			
			try(FileWriter writer = new FileWriter("src/application/model/json/medicos.json")){
				
				prettyGson.toJson(medicos, writer);
				
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
    		
    	}catch(Exception e) {
    		
    		label.setText( "ERROR ! ALGUNO DE LOS DATOS ESTA MAL INGRESADO" );
    		
    	}

    }	
 	
}