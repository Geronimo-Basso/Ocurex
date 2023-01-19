package application.controlador;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;
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

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class CRegistrarDirector {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnRegistrarse;

    @FXML
    private JFXTextField jfxDomicilio;

    @FXML
    private JFXTextField jfxTelefono;

    @FXML
    private JFXTextField jfxApellido;

    @FXML
    private JFXTextField jfxSexo;

    @FXML
    private JFXTextField jfxNombre;

    @FXML
    private JFXTextField jfxEmail;

    @FXML
    private JFXPasswordField jfxPassword;

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
    void registrarse(ActionEvent event) {
    	
    	String email = jfxEmail.getText();
    	String nombre = jfxNombre.getText();
    	String apellido = jfxApellido.getText();
    	String password = jfxPassword.getText();
    	int telefono = Util.parsearInt(jfxTelefono.getText());
    	String sexo = jfxSexo.getText();
    	String domicilio = jfxDomicilio.getText();
		
    	//json related
		Director director = new Director( email , nombre , apellido , password , telefono , sexo , domicilio , LocalDate.now());
		Director director1 = new Director( "federico.fernandez@example.com", "Federico", "Fernandez" , "uruguay2020" ,672122544 , "M" , "Gran via 4, 28019" , LocalDate.now());
		Director director2 = new Director( "fernando.alonso@example.com", "Fernando", "Alonso" , "iniesta2010" ,621125255 , "M" , "Pablo Alonzo 7, 28019" , LocalDate.now());
		Director director3 = new Director( "agustin.sosa@example.com", "Agustin", "Sosa" ,"password123",687754854 , "M" , "Calle tajo 27, 28670" , LocalDate.now());
		Director director4 = new Director( "federico.fernandez@example.com", "Manuela", "Barrios" , "abcdefg987" ,672154784 , "F" , "Calle principe asturias 12, 28670" , LocalDate.now());
		
    	Vector<Director> directores = new Vector<Director>();
    	directores.add(director);
    	directores.add(director1);
    	directores.add(director2);
    	directores.add(director3);
    	directores.add(director4);
		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String representacionBonita = prettyGson.toJson(directores);
		System.out.println(representacionBonita);
		
		
		try(FileWriter writer = new FileWriter("src/application/model/json/directores.json")){
			
			prettyGson.toJson(directores, writer);
			
	    } catch (IOException e) {
	    	
	        e.printStackTrace();
	        
	    }
		
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
		
}

