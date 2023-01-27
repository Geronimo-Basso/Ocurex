package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.model.Prisionero;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class CMedicoVistaBpm implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private TableView<Prisionero> table;
    
    @FXML
    private TableColumn<Prisionero, String> columnaIdPrisionero;

    @FXML
    private TableColumn<Prisionero, String> columaNombre;

    @FXML
    private TableColumn<Prisionero, String> columaApellido;

    @FXML
    private TableColumn<Prisionero, Integer> columnaBpm;
        
    private List<Prisionero> listaVector = new ArrayList<Prisionero>(ControladorJson.recorrerPrisioneros());
    
    ObservableList<Prisionero> list = FXCollections.observableArrayList(  listaVector );
    
    @FXML
    private JFXButton btnActualizarMedidas;

    @FXML
    void actualizarMedidas(ActionEvent event) {
    		
    	/*
    	 * Funcion que se va a usar para recargar las medidas de los sensores de pulsaciones. 
    	 */
    }
    

    @FXML
    void volverAlMenu(ActionEvent event) {


    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		columnaIdPrisionero.setCellValueFactory(new PropertyValueFactory<Prisionero, String> ("identificadorPreso") );
		columaNombre.setCellValueFactory(new PropertyValueFactory<Prisionero, String> ("nombre") );
		columaApellido.setCellValueFactory(new PropertyValueFactory<Prisionero, String> ("apellido") );
		columnaBpm.setCellValueFactory(new PropertyValueFactory<Prisionero, Integer> ("sensorBpm") );


		table.setItems(list);			

		

	}
	
}
