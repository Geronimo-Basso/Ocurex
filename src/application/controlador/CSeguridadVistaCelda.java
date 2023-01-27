package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.model.Celda;
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

public class CSeguridadVistaCelda implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;
 
    @FXML
    private TableView<Celda> table;
    
    @FXML
    private TableColumn<Celda, Integer> columnaNumeroCelda;

    @FXML
    private TableColumn<Celda, Integer> columnaPiso;

    @FXML
    private TableColumn<Celda, Integer> columaCantidadVentanas;

    @FXML
    private TableColumn<Celda, Integer> columnaMetrosCuadrados ;
        
    private List<Celda> listaVector = new ArrayList<Celda>(ControladorJson.recorrerConsultasCelda());
    
    ObservableList<Celda> list = FXCollections.observableArrayList(  listaVector );
    

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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		columnaNumeroCelda.setCellValueFactory(new PropertyValueFactory<Celda, Integer> ("numeroCelda") );
		columnaPiso.setCellValueFactory(new PropertyValueFactory<Celda, Integer> ("piso") );
		columaCantidadVentanas.setCellValueFactory(new PropertyValueFactory<Celda, Integer> ("cantidadVentanas") );
		columnaMetrosCuadrados.setCellValueFactory(new PropertyValueFactory<Celda, Integer> ("metrosCuadrados") );
		
		table.setItems(list);			

	}
	
}
