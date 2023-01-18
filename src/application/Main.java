package application;
	
import application.controlador.CIniciarSesion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	

	
	@Override
	public void start(Stage primaryStage) {
		
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador = new CIniciarSesion(); //creo el controlador
			
			loader.setController(controlador); //seteo el controlador con el loader que cree antes.
			
			Parent root = loader.load(); //lo pongo como parent
			
			primaryStage.setScene(new Scene(root));//lo seteo como primary stage
			
			primaryStage.show();//muestro la el archivo.
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}