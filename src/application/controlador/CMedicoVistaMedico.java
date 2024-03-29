package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.model.Medico;
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

public class CMedicoVistaMedico implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private TableView<Medico> table;
    
    @FXML
    private TableColumn<Medico, String> columnaEmail;

    @FXML
    private TableColumn<Medico, String> tableColumNombre;

    @FXML
    private TableColumn<Medico, String> tableColumApellido;

    @FXML
    private TableColumn<Medico, String> tableColumEspecialidad;

    @FXML
    private TableColumn<Medico, Integer> tableColumaTelefono;

    @FXML
    private TableColumn<Medico, String> tableColumaDiomicilio;

    @FXML
    private TableColumn<Medico, String> tableColumaSexo;

    @FXML
    private TableColumn<Medico, LocalDate> columaFechaEntrada;
    
    private static Medico medicoAAgregar;
    
    private List<Medico> listaVector = new ArrayList<Medico>(ControladorJson.recorrerMedicos());
    
    ObservableList<Medico> list = FXCollections.observableArrayList(  listaVector );

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

		columnaEmail.setCellValueFactory(new PropertyValueFactory<Medico, String> ("emailUsuario") );
		tableColumNombre.setCellValueFactory(new PropertyValueFactory<Medico, String> ("nombre") );
		tableColumApellido.setCellValueFactory(new PropertyValueFactory<Medico, String> ("apellido") );
		tableColumEspecialidad.setCellValueFactory(new PropertyValueFactory<Medico, String> ("especialidad") );
		tableColumaTelefono.setCellValueFactory(new PropertyValueFactory<Medico, Integer> ("telefono") );
		tableColumaDiomicilio.setCellValueFactory(new PropertyValueFactory<Medico, String> ("domicilio") );
		tableColumaSexo.setCellValueFactory(new PropertyValueFactory<Medico, String> ("sexo") );
		columaFechaEntrada.setCellValueFactory(new PropertyValueFactory<Medico, LocalDate> ("fechaEntrada") );

		table.setItems(list);			

		

	}

	public static Medico getMedicoAAgregar() {
		return medicoAAgregar;
	}

	public static void setMedicoAAgregar(Medico medicoAAgregar) {
		CMedicoVistaMedico.medicoAAgregar = medicoAAgregar;
	}
	
	
	
}
