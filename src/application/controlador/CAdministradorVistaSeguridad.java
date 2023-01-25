package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.model.Seguridad;
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

public class CAdministradorVistaSeguridad implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private TableView<Seguridad> table;
    
    @FXML
    private TableColumn<Seguridad, String> columnaEmail;

    @FXML
    private TableColumn<Seguridad, String> tableColumNombre;

    @FXML
    private TableColumn<Seguridad, String> tableColumApellido;

    @FXML
    private TableColumn<Seguridad, Integer> tableColumaTelefono;

    @FXML
    private TableColumn<Seguridad, String> tableColumaDiomicilio;

    @FXML
    private TableColumn<Seguridad, String> tableColumaSexo;

    @FXML
    private TableColumn<Seguridad, LocalDate> columaFechaEntrada;
    
    @FXML
    private TableColumn<Seguridad, String> columaZonaControla;
    
    private static Seguridad SeguridadAAgregar;
    
    private List<Seguridad> listaVector = new ArrayList<Seguridad>(ControladorJson.recorrerSeguridades());
    
    ObservableList<Seguridad> list = FXCollections.observableArrayList(  listaVector );


    @FXML
    void volverAlMenu(ActionEvent event) {


    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
		Stage stage = new Stage();
    	try {
   		 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/Administrador.fxml")); 
			
			CAdministrador controlador2 = new CAdministrador(); 
			
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

		columnaEmail.setCellValueFactory(new PropertyValueFactory<Seguridad, String> ("emailUsuario") );
		tableColumNombre.setCellValueFactory(new PropertyValueFactory<Seguridad, String> ("nombre") );
		tableColumApellido.setCellValueFactory(new PropertyValueFactory<Seguridad, String> ("apellido") );
		tableColumaTelefono.setCellValueFactory(new PropertyValueFactory<Seguridad, Integer> ("telefono") );
		tableColumaDiomicilio.setCellValueFactory(new PropertyValueFactory<Seguridad, String> ("domicilio") );
		tableColumaSexo.setCellValueFactory(new PropertyValueFactory<Seguridad, String> ("sexo") );
		columaFechaEntrada.setCellValueFactory(new PropertyValueFactory<Seguridad, LocalDate> ("fechaEntrada") );
		columaZonaControla.setCellValueFactory(new PropertyValueFactory<Seguridad, String> ("zonaControla") );


		table.setItems(list);			

	}

	public static Seguridad getSeguridadAAgregar() {
		return SeguridadAAgregar;
	}

	public static void setSeguridadAAgregar(Seguridad SeguridadAAgregar) {
		CAdministradorVistaSeguridad.SeguridadAAgregar = SeguridadAAgregar;
	}
	
	
	
}
