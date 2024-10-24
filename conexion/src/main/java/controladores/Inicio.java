package controladores;


import java.util.Scanner;

import servicios.ConexionImplementacion;
import servicios.ConexionInterfaz;



public class Inicio {


    public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		ConexionInterfaz ci = new ConexionImplementacion();
		
		
		ci.abrirConexion();
		ci.cerrarConexion();

	}

}
