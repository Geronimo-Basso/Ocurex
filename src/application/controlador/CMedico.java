package application.controlador;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CMedico {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnVerHistoriasMedicas;

    @FXML
    private JFXButton btnVerMedicos;
    
    @FXML
    private JFXButton btnVerMedidasBpm;
   

    @FXML
    void verHistorias(ActionEvent event) {
    	Stage priorStage = (Stage)btnVerHistoriasMedicas.getScene().getWindow();
		Stage stage = new Stage();
		
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/MedicoVistaHistorias.fxml")); 
			
			CMedicoVistaHistoria controlador2 = new CMedicoVistaHistoria(); 
			
			loader2.setController(controlador2); 
			
			Parent root2 = loader2.load(); 
			
			Scene scene = new Scene( root2 );
			
			stage.setScene(scene);
			
			stage.show();
			
			priorStage.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void verMedicos(ActionEvent event) {
    	Stage priorStage = (Stage)btnVerMedicos.getScene().getWindow();
		Stage stage = new Stage();
		
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/MedicoVistaMedico.fxml")); 
			
			CMedicoVistaMedico controlador2 = new CMedicoVistaMedico(); 
			
			loader2.setController(controlador2); 
			
			Parent root2 = loader2.load(); 
			
			Scene scene = new Scene( root2 );
			
			stage.setScene(scene);
			
			stage.show();
			
			priorStage.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}

    }
    
    @FXML
    void verMedidas(ActionEvent event) {
    	Stage priorStage = (Stage)btnVerMedidasBpm.getScene().getWindow();
		Stage stage = new Stage();
		
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/MedicoVistaBpm.fxml")); 
			
			CMedicoVistaBpm controlador2 = new CMedicoVistaBpm(); 
			
			loader2.setController(controlador2); 
			
			Parent root2 = loader2.load(); 
			
			Scene scene = new Scene( root2 );
			
			stage.setScene(scene);
			
			stage.show();
			
			priorStage.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}

    }
    

    @FXML
    void volverAlMenu(ActionEvent event) {
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

    }

}
