/*autor: Angel Valladares
 * fecha 08-10-2020
 */
package Implementacion;

import java.util.Scanner;

import Clases.*;
import Gestion.*;

public class Principal {

	public static void main(String[] args) {
		
		int idUsuario;
		String nombres, apellidos, usuario;
		boolean centinela=true;
		Scanner sc0 = new Scanner(System.in); //sc0 para nextLine
		Scanner sc1 = new Scanner(System.in); //sc1 para nextInt
		Scanner sc2 = new Scanner(System.in); //sc2 para nextFloat

		System.out.println("Red Social UNAH");
		
		
		GestionTipoPublicacion tipoPublicacion = new GestionTipoPublicacion();
		GestionPublicacion gPublicacion = new GestionPublicacion();
		GestionUsuario gUsuario = new GestionUsuario();
		
		TipoPublicacion TipoA=new TipoPublicacion(1, "Compartir en mi muro");
		TipoPublicacion TipoB=new TipoPublicacion(2, "Postear a amigo");
		
		tipoPublicacion.Agregar(TipoA);
		tipoPublicacion.Agregar(TipoB);
		
		
		int idTipo,idPublicacion, salir, opcionA=0;
	
		String descripcion, fecha;
	
		while(centinela) {
		System.out.println("1. Agregar publicacion");
		System.out.println("2. Agregar usuario");
		System.out.println("3. Agregar publicacion de determinado usuario");
		System.out.println("4. Salir");
		opcionA=sc1.nextInt();
				
		switch(opcionA) {
		case 1://Opcion que Agrega publicacion
			System.out.println("Agregar publicacion");
			System.out.println("Seleccione el tipo de publicacion");
			tipoPublicacion.imprimirTodos();
			
			idTipo=sc1.nextInt();
			
			TipoPublicacion publicacionIngresada = tipoPublicacion.BuscarPorObjeto(idTipo);
			if(publicacionIngresada==null) {
				System.out.println("Tipo de publicacion no encontrada");
				
			}
			
			System.out.println("Ingrese Id de publicacion:");
			idPublicacion=sc1.nextInt();
			
			System.out.println("Ingrese descripcion de publicacion:");
			descripcion = sc0.nextLine();
			
			System.out.println("Ingrese la fecha");
			fecha=sc0.nextLine();
			break;
		
		case 2: //Agregar usuario
			System.out.println("Agregar Usuario");
			
			System.out.println("Nombres del Usuario");
			nombres=sc0.nextLine();
			System.out.println("Apellidos del usuario ");
			apellidos=sc0.nextLine();

			System.out.println("Id del usuario");
			idUsuario=sc1.nextInt();

			System.out.println("Ingrese nombre de usuario:");
			usuario=sc0.nextLine();
			
			Usuario usuario1 = new Usuario();
			usuario1.set_nombres(nombres);
			usuario1.set_apellidos(apellidos);
			usuario1.set_id(idUsuario);
			usuario1.set_usuario(usuario);
			
			
			
			break;
			
		case 3:
			System.out.println("Agregar Publicacion");
			
			System.out.println("Buscar Usuario");
			
			
			System.out.println("Registrar publicacion de usuario encontrado");
			
			
			
			
		
		case 4:
		
			centinela=false;
			break;
		
		}
		
		
		
		
		
		}
	}

}
