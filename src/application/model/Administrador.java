package application.model;
/**
 * Class Administrador
 * created 19/01/2023
 * @author GeronimoBasso
 *
 */
public class Administrador {
	
	private String emailUsuario;
	private String password;

	
	/**
	 * Constructor class Administrador
	 * @param emailUsuario
	 * @param nombre
	 * @param apellido
	 * @param password
	 * @param telefono
	 * @param domicilio
	 * @param sexo
	 * @param fechaEntrada
	 */
	public Administrador(String emailUsuario, String password) {
		this.emailUsuario = emailUsuario;
		this.password = password;

	}
	
	public Administrador() {
		
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
