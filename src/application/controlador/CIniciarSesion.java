package application.controlador;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import application.model.Administrador;
import application.model.Director;
import application.model.Medico;
import application.model.Seguridad;

public class CIniciarSesion {

    @FXML
    private Label label;
	
    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXTextField usuario;

    @FXML
    private JFXButton btnIniciarSesion;

    @FXML
    private JFXButton btnRegistrarse;
    
	private static Director director;
	private static Medico medico;
	private static Administrador administrador;
	private static Seguridad seguridad;

    @FXML
    void iniciarSesion(ActionEvent event) {
    	
    	Stage priorStage = (Stage)btnRegistrarse.getScene().getWindow();
		Stage stage = new Stage();
		
    	Director directorComprobar = ControladorJson.comprobarExistenteDirector(usuario.getText());
    	director = directorComprobar;
		if(!(directorComprobar == null)){
			
		}
		//else if () {
//			
//		}else if() {
//			
//		}else if() {
//			
//		}else {
//			
//		}

    	try {
 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/MenuIniciarSesion.fxml")); 
			
			CMenuIniciarSesion controlador2 = new CMenuIniciarSesion(); 
			
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
    void registrarse(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage = (Stage)btnRegistrarse.getScene().getWindow();
		Stage stage = new Stage();

    	try {
 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseMenu.fxml")); //Cargo el loader
			
			CRegistrarMenu controlador2 = new CRegistrarMenu(); //creo el controlador
			
			loader2.setController(controlador2); //seteo el controlador con el loader que cree antes.
			
			Parent root2 = loader2.load(); //lo pongo como parent
			
			Scene scene = new Scene( root2 );
			
			stage.setScene(scene);
			
			stage.show();
			
			priorStage.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    
    @FXML
    void iniciarSesionDirector(ActionEvent event) {
    	Stage priorStage = (Stage)btnRegistrarse.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseMenu.fxml")); 
			
			CRegistrarMenu controlador2 = new CRegistrarMenu(); 
			
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
    
	public static Director getDirector() {
		return director;
	}


	public static Medico getMedico() {
		return medico;
	}


	public static Administrador getAdministrador() {
		return administrador;
	}


	public static Seguridad getSeguridad() {
		return seguridad;
	}
   
}