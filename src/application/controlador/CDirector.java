package application.controlador;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CDirector {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnVerInformacionMedicos;

    @FXML
    private JFXButton btnVerInformacionSeguridades;

    @FXML
    private JFXButton btnVerInformacionDirectores;

    @FXML
    private JFXButton btnVerZonas;
    
    @FXML
    private JFXButton btnVerPresos;

    @FXML
    void verDirectores(ActionEvent event) {
    	
    	Stage priorStage = (Stage)btnVerInformacionDirectores.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/DirectorVistaDirector.fxml")); 
			
			CDirectorVistaDirector controlador2 = new CDirectorVistaDirector(); 
			
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
    	Stage priorStage = (Stage)btnVerInformacionMedicos.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/DirectorVistaMedico.fxml")); 
			
			CDirectorVistaMedico controlador2 = new CDirectorVistaMedico(); 
			
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
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/DirectorVistaSeguridad.fxml")); 
			
			CDirectorVistaSeguridad controlador2 = new CDirectorVistaSeguridad(); 
			
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
    	
    	Stage priorStage = (Stage)btnVerZonas.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/Zona.fxml")); 
			
			CZona controlador2 = new CZona(); 
			
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
    
    @FXML
    void verPresos(ActionEvent event) {
    	
    	Stage priorStage = (Stage)btnVerPresos.getScene().getWindow();
		Stage stage = new Stage();
		
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/DirectorVistaPresos.fxml")); 
			
			CDirectorVistaPrisionero controlador2 = new CDirectorVistaPrisionero(); 
			
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

}

