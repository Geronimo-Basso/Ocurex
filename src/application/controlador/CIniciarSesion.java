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
	private static Seguridad seguridad;

    @FXML
    void iniciarSesion(ActionEvent event) {
		
    	Director directorComprobar = ControladorJson.comprobarExistenteDirector(usuario.getText() , password.getText() );
    	director = directorComprobar;
    	
    	Medico medicoComprobar = ControladorJson.comprobarExistenteMedico(usuario.getText() , password.getText() );
    	medico = medicoComprobar;
    	
    	
    	Seguridad seguridadComprobar = ControladorJson.comprobarExistenteSeguridad(usuario.getText() , password.getText());
    	seguridad = seguridadComprobar;
    	
		System.out.println("H o l a");

    	
		if( ! ( directorComprobar == null ) ){
			
			iniciarSesionDirector( event );
			
		}
		else if (! ( medicoComprobar == null ) ) {
			
			iniciarSesionMedico( event );		
			
		}else if( ! ( seguridadComprobar == null ) ) {
			
			iniciarSesionSeguridad( event );

		}else {
			label.setText("Error! No existe ese usuario");
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
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/Director.fxml")); 
			
			CDirector controlador2 = new CDirector(); 
			
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
    void iniciarSesionMedico(ActionEvent event) {
    	Stage priorStage = (Stage)btnRegistrarse.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/Medico.fxml")); 
			
			CMedico controlador2 = new CMedico(); 
			
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
    void iniciarSesionSeguridad(ActionEvent event) {
    	Stage priorStage = (Stage)btnRegistrarse.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/Seguridad.fxml")); 
			
			CSeguridad controlador2 = new CSeguridad(); 
			
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


	public static Seguridad getSeguridad() {
		return seguridad;
	}
   
}