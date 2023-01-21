package application.controlador;
import com.jfoenix.controls.JFXButton;
import application.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CAdministrador{

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnVerInformacionMedicos;

    @FXML
    private JFXButton btnVerInformacionSeguridades;

    @FXML
    private JFXButton btnVerInformacionDirectores;

    

    @FXML
    void verDirectores(ActionEvent event) {

    }

    @FXML
    void verMedicos(ActionEvent event) {
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();

    	try {
 
			FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/application/view/AdministradorVistaMedico.fxml")); //Cargo el loader
			
			CAdministradorVistaMedico controlador8 = new CAdministradorVistaMedico(); //creo el controlador
		
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
    void verSeguratas(ActionEvent event) {

    }

    @FXML
    void volverAlMenu(ActionEvent event) {

    }


}