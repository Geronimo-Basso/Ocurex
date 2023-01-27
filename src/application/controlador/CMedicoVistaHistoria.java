package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.model.ConsultaMedica;
import application.model.Medico;
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
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;




public class CMedicoVistaHistoria implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private TableView<ConsultaMedica> table;

    @FXML
    private TableColumn<ConsultaMedica ,String > columnaIdPreso;
   
    @FXML
    private TableColumn<ConsultaMedica , String > columnaNombre;

    @FXML
    private TableColumn<ConsultaMedica , String > columnaApellido;

    @FXML
    private TableColumn<ConsultaMedica,String> columnaIdConsulta;

    @FXML
    private TableColumn<ConsultaMedica, String > columaDescripcion;

    @FXML
    private TableColumn<ConsultaMedica, LocalDate> columnaFechaConsulta;

    @FXML
    private TableColumn<ConsultaMedica, String > columnaEmailMedico;

    @FXML
    private JFXButton btnAgregarHistoria;
    
    @FXML
    void agregarHistoria(ActionEvent event) {
    	Stage priorStage = (Stage)btnAgregarHistoria.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/RegistrarHistoria.fxml")); 
			
			CRegistrarHistoria controlador2 = new CRegistrarHistoria(); 
			
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
		
		columnaIdConsulta.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, String> ("idConsulta") );
		columaDescripcion.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, String> ("descripcion") );
		columnaFechaConsulta.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, LocalDate> ("fechaConslta") );
		columnaIdPreso.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, String> ("idPreso") );
		columnaNombre.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, String> ("nombrePreso") );
		columnaApellido.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, String> ("apellidoPreso") );
		columnaEmailMedico.setCellValueFactory(new PropertyValueFactory<ConsultaMedica, String> ("idMedico") );

		
	    List<ConsultaMedica> listaVector = new ArrayList<ConsultaMedica>(ControladorJson.recorrerConsultasMedicas()); 
	    ObservableList<ConsultaMedica> list = FXCollections.observableArrayList(  listaVector );
		table.setItems(list);			
	}
		
}
