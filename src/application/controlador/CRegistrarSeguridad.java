package application.controlador;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import application.controlador.excepciones.DatosVacios;
import application.model.Seguridad;

public class CRegistrarSeguridad {

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
    private JFXTextField jfxZonaControla;
    
    @FXML
    private Label label;


    @FXML
    void volverAlMenu(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();

    	try {
 
			FXMLLoader loader9 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador9 = new CIniciarSesion(); //creo el controlador
		
			loader9.setController(controlador9); //seteo el controlador con el loader que cree antes.
			
			Parent root9 = loader9.load(); //lo pongo como parent
			
			Scene scene = new Scene( root9 );
			
			stage.setScene(scene);
			
			stage.show();
						
			priorStage.close();	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    
    @FXML
    void registrarse(ActionEvent event) {
    	try {
    		
	    	String email = jfxEmail.getText();
	    	String nombre = jfxNombre.getText();
	    	String apellido = jfxApellido.getText();
	    	String password = jfxPassword.getText();
	    	int telefono = Util.parsearInt(jfxTelefono.getText());
	    	String sexo = jfxSexo.getText();
	    	String domicilio = jfxDomicilio.getText();
	    	String zonaControla = jfxZonaControla.getText();
	
	
	    	if (Util.stringVacio(email) || Util.stringVacio(nombre) || Util.stringVacio(apellido) || Util.stringVacio(password) || Util.stringVacio(sexo) || Util.stringVacio(domicilio) || telefono == 0 || Util.stringVacio(zonaControla)){
		    	
	    		throw new DatosVacios("Alguno de los datos esta mal");
	    	}
	    	
			Seguridad seguridad = new Seguridad( email , nombre , apellido , password ,telefono , domicilio , sexo , zonaControla , LocalDate.now());
			Seguridad seguridad1 = new Seguridad( "flabio.rodriguez@example.com" , "Flabio" , "Rodriguez" , "seguridad24" , 652789254 , "Glorieta Loreto Nicolás 6, Ceuta, 04195" , "M" ,"Edificio A , planta B" , LocalDate.of( 2019 , 5 , 17 ));
			Seguridad seguridad2 = new Seguridad( "santiago.martinez@example.com" , "Santiago" , "Martinez" , "nosequeponer12" , 658587235 , "Calle Ángeles Mendizábal 7 Apt. 91, Cádiz, 24435" , "M" ,"Edificio A , comedor" , LocalDate.of(2020 , 1 , 19 ));
			Seguridad seguridad3 = new Seguridad( "nicolas.fernandez@example.com" , "Nicolas" , "Fernandez" , "segurata4life" , 651027841 , "Pasadizo de Eduardo Baños 5 Piso 3, Ourense, 30825" , "M" , "Edificio B, patio afuera" ,LocalDate.of( 2021 , 1 , 17 ));
			Seguridad seguridad4 = new Seguridad( "fausto.rodriguez@example.com" , "Fausto" , "Rodriguez" , "fausto123" , 654127854 , "Avenida de los poblados 15, 28772" , "M" , "Edificio A Comedor" ,LocalDate.of( 2022 , 5 , 12 ));
			Seguridad seguridad5 = new Seguridad( "diego.forlan@example.com" , "Diego" , "Forlan" , "diego1700" , 685214578 , "Principe Asturias 77, 28670" , "M" , "Edificio A Salida" ,LocalDate.of( 2023, 1 ,7 ));
			Seguridad seguridad6 = new Seguridad( "chris.brown@example.com" , "Chris" , "Brown" , "cb13112001" , 621478521 , "Tomas Giribaldi 12, 28670" , "M" , "Edificio B salida" ,LocalDate.of( 2021, 8 , 5 ));

	    	Vector<Seguridad> seguridades = new Vector<Seguridad>();
	    	seguridades.add(seguridad);
	    	seguridades.add(seguridad1);
	    	seguridades.add(seguridad2);
	    	seguridades.add(seguridad3);
	    	seguridades.add(seguridad4);
	    	seguridades.add(seguridad5);
	    	seguridades.add(seguridad6);
	    	
			Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			String representacionBonita = prettyGson.toJson(seguridad);
			System.out.println(representacionBonita);
			
			
			try(FileWriter writer = new FileWriter("src/application/model/json/seguridad.json")){
				
				prettyGson.toJson( seguridades , writer);
				
		    } catch (IOException e) {
		    	
		        e.printStackTrace();
		        
		    }
	    
	    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
	       	//Registrar al cliente, y mandarlo al iniciar sesion asi puede entrar.
	    	
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
    		
    	}catch (Exception e) {
    		label.setText( "ERROR ! ALGUNO DE LOS DATOS ESTA MAL INGRESADO" );
    	}

    } 	
}