package servicios;

import java.sql.Connection;

public interface ConexionInterfaz {
	
public Connection abrirConexion();
	
	public void cerrarConexion();


}
