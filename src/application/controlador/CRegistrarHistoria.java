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
import application.model.ConsultaMedica;
import application.model.Medico;
import application.model.Prisionero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXTextField;

public class CRegistrarHistoria {

	@FXML
	private JFXButton btnSalir;

	@FXML
	private JFXButton btnContinuar;

    @FXML
	private JFXTextField jfxDescripcion;

    @FXML
    private JFXTextField jfxEmailMedico;

    @FXML
	private JFXTextField jfxIdPrisionero;

    @FXML	    
    private Label label;

    @FXML
    private JFXDatePicker jfxFechaConsulta;



    @FXML
    void salir(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage = (Stage)btnSalir.getScene().getWindow();
    	Stage stage = new Stage();
    	
    	try {
 
			FXMLLoader loader7 = new FXMLLoader(getClass().getResource("/application/view/Medico.fxml")); //Cargo el loader
			
			CMedico controlador7 = new CMedico(); //creo el controlador
		
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
        	String idPrisionero = jfxIdPrisionero.getText();
        	String emailMedico = jfxEmailMedico.getText();
        	String descripcion = jfxDescripcion.getText();
        	LocalDate fechaConsulta = jfxFechaConsulta.getValue(); 

        
	    	if (Util.stringVacio(idPrisionero) || Util.stringVacio(emailMedico) ||  Util.stringVacio(descripcion) || fechaConsulta == null ){
	    	
	    		throw new DatosVacios("Alguno de los datos esta mal");
	    	}
	    	
	    	if(ControladorJson.comprobarExistenteMedicoEmail(emailMedico) == null || ControladorJson.comprobarExistentePrisionero(idPrisionero) == null) {
	    		throw new DatosVacios("No exite ese Medico/Preso");

	    	}

	    	ConsultaMedica consultaMedica = new ConsultaMedica(
	    			Util.getAlphaNumericString(10) ,
	    			"El paciente se encuntra en un buen estado de salud" , 
	    			LocalDate.of(2023 , 1  , 1) , 
	    			ControladorJson.comprobarExistentePrisionero( "1" ).getIdentificadorPreso(), 
	    			ControladorJson.comprobarExistentePrisionero( "1" ).getNombre(),
	    			ControladorJson.comprobarExistentePrisionero( "1" ).getApellido(),
	    			ControladorJson.comprobarExistenteMedicoEmail("angel.charte@example.com").getEmailUsuario() 
	    			);
	    	
	    	ConsultaMedica consultaMedicaAAgregar = new ConsultaMedica(
	    			Util.getAlphaNumericString(15) ,
	    			descripcion ,
	    			fechaConsulta , 
	    			ControladorJson.comprobarExistentePrisionero(idPrisionero).getIdentificadorPreso(), 
	    			ControladorJson.comprobarExistentePrisionero(idPrisionero).getNombre(),
	    			ControladorJson.comprobarExistentePrisionero(idPrisionero).getApellido(),
	    			ControladorJson.comprobarExistenteMedicoEmail(emailMedico).getEmailUsuario() 
	    			);
	    	Vector<ConsultaMedica> consultas = new Vector<ConsultaMedica>();
	    	consultas.add(consultaMedica);
	    	consultas.add(consultaMedicaAAgregar);
			
			Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			String representacionBonita = prettyGson.toJson(consultas);
			System.out.println(representacionBonita);
			
			
			try(FileWriter writer = new FileWriter("src/application/model/json/historias.json")){
				
				prettyGson.toJson(consultas, writer);
				
		    } catch (IOException e) {
		    	
		        e.printStackTrace();
		        
		    }
			
	    	Stage priorStage = (Stage)btnContinuar.getScene().getWindow();
	    	Stage stage = new Stage();
	
	    	try {
	 
				FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/application/view/Medico.fxml")); //Cargo el loader
				
				CMedico controlador8 = new CMedico(); //creo el controlador
			
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

