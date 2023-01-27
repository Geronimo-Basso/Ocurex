package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.model.Seguridad;
import application.model.Zona;
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


import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CSeguridadVistaZona implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private TableView<Zona> table;
    
    @FXML
    private TableColumn<Zona , String> columnaNombre;

    @FXML
    private TableColumn<Zona, Integer> columnaConteo;

    @FXML
    private JFXButton btnActualizarValores;

    
    private List<Zona> listaVector = new ArrayList<Zona>(ControladorJson.recorrerZonas());
    
    ObservableList<Zona> list = FXCollections.observableArrayList(  listaVector );


    @FXML
    void volverAlMenu(ActionEvent event) {


    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
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
    
    @FXML
    void actualizarValores(ActionEvent event) {
    	/*
    	 * funcion que planea agarrar los valores de los sensores y modificarlos
    	 */
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		columnaNombre.setCellValueFactory(new PropertyValueFactory<Zona, String> ("nombre") );
		columnaConteo.setCellValueFactory(new PropertyValueFactory<Zona, Integer> ("conteo") );

		table.setItems(list);			

	}

}
