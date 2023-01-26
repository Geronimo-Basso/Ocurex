package application.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import application.model.Director;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CAdministradorVistaDirector implements Initializable {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private TableView<Director> table;
    
    @FXML
    private TableColumn<Director, String> columnaEmail;

    @FXML
    private TableColumn<Director, String> tableColumNombre;

    @FXML
    private TableColumn<Director, String> tableColumApellido;

    @FXML
    private TableColumn<Director, Integer> tableColumaTelefono;

    @FXML
    private TableColumn<Director, String> tableColumaDiomicilio;

    @FXML
    private TableColumn<Director, String> tableColumaSexo;

    @FXML
    private TableColumn<Director, LocalDate> columaFechaEntrada;
    
    @FXML
    private TextField filterField;
        
//    private List<Director> listaVector = new ArrayList<Director>(ControladorJson.recorrerDirectores());
    
//    ObservableList<Director> list = FXCollections.observableArrayList(  listaVector );


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

		columnaEmail.setCellValueFactory(new PropertyValueFactory<Director, String> ("emailUsuario") );
		tableColumNombre.setCellValueFactory(new PropertyValueFactory<Director, String> ("nombre") );
		tableColumApellido.setCellValueFactory(new PropertyValueFactory<Director, String> ("apellido") );
		tableColumaTelefono.setCellValueFactory(new PropertyValueFactory<Director, Integer> ("telefono") );
		tableColumaDiomicilio.setCellValueFactory(new PropertyValueFactory<Director, String> ("domicilio") );
		tableColumaSexo.setCellValueFactory(new PropertyValueFactory<Director, String> ("sexo") );
		columaFechaEntrada.setCellValueFactory(new PropertyValueFactory<Director, LocalDate> ("fechaEntrada") );
		
	    List<Director> listaVector = new ArrayList<Director>(ControladorJson.recorrerDirectores());
	    ObservableList<Director> list = FXCollections.observableArrayList(  listaVector );

		table.setItems(list);			
		
//		FilteredList<Director> filteredData = new FilteredList<Director>(list, b -> true);
//			
//			filterField.textProperty().addListener((observable, oldValue, newValue) -> {
//			filteredData.setPredicate(director -> {
//					// If filter text is empty, display all persons.
//									
//					if (newValue == null || newValue.isEmpty()) {
//						return true;
//					}
//					
//					// Compare first name and last name of every person with filter text.
//					String lowerCaseFilter = newValue.toLowerCase();
//					
//					if (director.getNombre().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
//						return true; // Filter matches first name.
//					} else if (director.getEmailUsuario().toLowerCase().indexOf(lowerCaseFilter) != -1) {
//						return true; // Filter matches last name.
//					}
//					else if (director.getApellido().toLowerCase().indexOf(lowerCaseFilter) != -1)
//					     return true;
//					
//					     else  
//					    	 return false; // Does not match.
//				});
//			});
//			
//			// 3. Wrap the FilteredList in a SortedList. 
//			SortedList<Director> sortedData = new SortedList<>(filteredData);
//			
//			// 4. Bind the SortedList comparator to the TableView comparator.
//			// 	  Otherwise, sorting the TableView would have no effect.
//			sortedData.comparatorProperty().bind(table.comparatorProperty());
//			
//			// 5. Add sorted (and filtered) data to the table.
//			table.setItems(sortedData);


	}
	
}
