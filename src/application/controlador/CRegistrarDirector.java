package application.controlador;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jfoenix.controls.JFXButton;
import application.model.Director;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXTextField;


public class CRegistrarDirector {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnContinuar;

    @FXML
    private JFXTextField jfxDomicilio;

    @FXML
    private JFXTextField jfxApellido;

    @FXML
    private JFXTextField jfxTelefono;

    @FXML
    private JFXTextField jfxNombre;

    @FXML
    private JFXTextField jfxEmail;
    
    @FXML
    private JFXTextField jfxSexo;

    @FXML
    void volverAlMenu(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
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
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    
    @FXML
    void continuar(ActionEvent event) {
    	String email = jfxEmail.getText();
    	String nombre = jfxNombre.getText();
    	String apellido = jfxApellido.getText();
    	int telefono = Util.parsearInt(jfxTelefono.getText());
    	String sexo = jfxSexo.getText();
    	String domicilio = jfxDomicilio.getText();
		//falta chequear que los datos no esten vacios
		
    	//json related
		Director director = new Director( email , nombre , apellido , telefono , sexo , domicilio , LocalDate.now());
		directorAJson( director , "src/application/model/json/directores.json" );
		//dar alerta de que se guardo el director en el json
		
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();

    	try {
 
			FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador8 = new CIniciarSesion(); //creo el controlador
		
			loader8.setController(controlador8); //seteo el controlador con el loader que cree antes.
			
			Parent root8 = loader8.load(); //lo pongo como parent
			
			Scene scene = new Scene( root8 );
			
			stage.setScene(scene);
			
			stage.show();
									
			priorStage.close();	

			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
	
	private static void directorAJson (Director empleado, String sJson) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try(FileWriter writer = new FileWriter(sJson)){
			gson. toJson (empleado, writer);
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}
		
}
