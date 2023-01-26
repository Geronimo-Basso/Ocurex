package application.controlador;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CSeguridad {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnVerInformacionSeguridades;

    @FXML
    private JFXButton btnVerZonas;

    @FXML
    private JFXButton btnVerPresos;

    @FXML
    void verPresos(ActionEvent event) {
    	
    	Stage priorStage = (Stage)btnVerPresos.getScene().getWindow();
		Stage stage = new Stage();
		
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/SeguridadVistaPresos.fxml")); 
			
			CSeguridadVistaPrisionero controlador2 = new CSeguridadVistaPrisionero(); 
			
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
    void verSeguratas(ActionEvent event) {
    	
    	Stage priorStage = (Stage)btnVerInformacionSeguridades.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/SeguridadVistaSeguridad.fxml")); 
			
			CSeguridadVistaSeguridad controlador2 = new CSeguridadVistaSeguridad(); 
			
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
    void verZonas(ActionEvent event) {

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
