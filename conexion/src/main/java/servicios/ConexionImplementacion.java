package servicios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controladores.Inicio;




public class ConexionImplementacion implements ConexionInterfaz {

	// URL de conexión a la base de datos
	private static final String URL = "jdbc:postgresql://localhost:5432/gestionmotos"; 

	private static final String USER = "postgres";

	private static final String PASSWORD = "altair006";
	Connection conexion = null;
	@Override
	public Connection abrirConexion() {
		
		try {
			// Cargar el controlador JDBC de PostgreSQL
			
			 
            Class.forName("org.postgresql.Driver");

            

            // Conectar a la base de datos

            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexión exitosa a la base de datos.");
            
            
            

            
		}catch(SQLException sqle) {
			System.out.println("Error al conectar con la base de datos");
		}catch (ClassNotFoundException e) {

            System.out.println("Error al cargar el controlador de PostgreSQL.");

            e.printStackTrace();
		}
		
		return conexion;
		
	}

	@Override
	public void cerrarConexion() {
		
		 if (conexion != null) {

             try {

                 conexion.close();

                 System.out.println("Conexión cerrada.");

             } catch (SQLException e) {

                 e.printStackTrace();

             }

         }
		
	}

}