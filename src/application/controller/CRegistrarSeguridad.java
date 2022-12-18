package application.controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CRegistrarSeguridad {

    @FXML
    private JFXTextArea jfxSexo;

    @FXML
    private JFXTextArea jfxEmail;

    @FXML
    private JFXTextArea jfxNombre;

    @FXML
    private JFXTextArea jfxTelefono;

    @FXML
    private JFXTextArea jfxApellido;

    @FXML
    private JFXTextArea jfxDomicilio;

    @FXML
    private JFXButton btnContinuar;

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    void continuar(ActionEvent event) {

    }

    @FXML
    void volverAlMenu(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();

    	try {
 
			FXMLLoader loader9 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador9 = new CIniciarSesion(); //creo el controlador
		
			loader9.setController(controlador9); //seteo el controlador con el loader que cree antes.
			
			Parent root9 = loader9.load(); //lo pongo como parent
			
			Scene scene = new Scene( root9 );
			
			stage.setScene(scene);
			
			stage.show();
						
			priorStage.close();	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    }	
}