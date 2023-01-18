package application.controlador;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CRegistrarMenu {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnDirector;

    @FXML
    private JFXButton btnDoctor;

    @FXML
    private JFXButton btnSeguridad;

    
    @FXML
    void registrarDirector(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage1 = (Stage)btnDirector.getScene().getWindow();
		Stage stage1 = new Stage();

    	try {
 
			FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseDirector.fxml")); //Cargo el loader
			
			CRegistrarDirector controlador3 = new CRegistrarDirector(); //creo el controlador
			
			loader3.setController(controlador3); //seteo el controlador con el loader que cree antes.
			
			Parent root3 = loader3.load(); //lo pongo como parent
			
			Scene scene = new Scene( root3 );
			
			stage1.setScene(scene);
			
			stage1.show();
			
			priorStage1.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void registrarDoctor(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage1 = (Stage)btnDoctor.getScene().getWindow();
		Stage stage1 = new Stage();

    	try {
 
			FXMLLoader loader4 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseDoctor.fxml")); //Cargo el loader
			
			CRegistrarDoctor controlador4 = new CRegistrarDoctor(); //creo el controlador
			
			loader4.setController(controlador4); //seteo el controlador con el loader que cree antes.
			
			Parent root4 = loader4.load(); //lo pongo como parent
			
			Scene scene = new Scene( root4 );
			
			stage1.setScene(scene);
			
			stage1.show();
			
			priorStage1.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void registrarSeguridad(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage2 = (Stage)btnSeguridad.getScene().getWindow();
		Stage stage2 = new Stage();

    	try {
 
			FXMLLoader loader5 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseSeguridad.fxml")); //Cargo el loader
			
			CRegistrarSeguridad controlador5 = new CRegistrarSeguridad(); //creo el controlador
			
			loader5.setController(controlador5); //seteo el controlador con el loader que cree antes.
			
			Parent root5 = loader5.load(); //lo pongo como parent
			
			Scene scene = new Scene( root5 );
			
			stage2.setScene(scene);
			
			stage2.show();
			
			priorStage2.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void volverAlMenu(ActionEvent event) {
	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
    Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();

    Stage stage1 = new Stage();
    	try {
 
			FXMLLoader loader6 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador6 = new CIniciarSesion(); //creo el controlador
		
			loader6.setController(controlador6); //seteo el controlador con el loader que cree antes.
			
			Parent root6 = loader6.load(); //lo pongo como parent
			
			Scene scene = new Scene( root6 );
			
			stage1.setScene(scene);
					
			stage1.show();
								
			priorStage.close();			
			} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

}
