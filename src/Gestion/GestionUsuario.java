/*autor: Angel Valladares
 * fecha 08-10-2020
 */
 

package Gestion;

import java.util.LinkedList;

import Clases.Usuario;

public class GestionUsuario {
	
		private LinkedList<Usuario> lstUsuario=new LinkedList<>();

		public GestionUsuario() {
			super();
		}
		
		
		
		int posicion=-1;
		/**
		 * Metodo que busca por id
		 * @param id
		 * @return posicion de la coleccion donde se encuentra el objeto.
		 */
		public int  BuscarPorId(int id) {
			int posicion=-1;
			for(int i=0;i<lstUsuario.size();i++) {
				if(lstUsuario.get(i).get_id()==id) {
					posicion=i;
					break;
				}
			}
			return posicion;
		}
		
		
		
		
		/**
		 * metodo que busca por objeto
		 * @param id
		 * @return objeto encontrado
		 */
		public Usuario BuscarPorObjeto(int id) {
			Usuario UsuarioEncontrado=null;
			for(int i=0;i<lstUsuario.size(); i++) {
				if(lstUsuario.get(i).get_id()==id) {
					UsuarioEncontrado=lstUsuario.get(i);
					break;
				}
				
			}
			return UsuarioEncontrado;
		}
	
		public boolean agregar(Usuario usuario) {
			lstUsuario.add(usuario);
			return true;
		}
		
		
		
		public boolean Eliminar() {
			if(posicion<0 || posicion>lstUsuario.size()) {
				return false;
			}else {
				lstUsuario.remove(posicion);
				return true;
			}
		}
		
		public void imprimirTodos() {
			for(int i=0;i<lstUsuario.size(); i++) {
				System.out.println(lstUsuario.get(i));
				
			}
		}
	
}
