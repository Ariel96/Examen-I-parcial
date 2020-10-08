/*autor: Angel Valladares
 * fecha 08-10-2020
 */

package Gestion;

import java.util.LinkedList;

import Clases.Publicacion;


public class GestionPublicacion {
	
	private LinkedList<Publicacion> lstPublicacion=new LinkedList<>();

	public GestionPublicacion() {
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
		for(int i=0;i<lstPublicacion.size();i++) {
			if(lstPublicacion.get(i).get_id()==id) {
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
	public Publicacion BuscarPorObjeto(int id) {
		Publicacion PublicacionEncontrado=null;
		for(int i=0;i<lstPublicacion.size(); i++) {
			if(lstPublicacion.get(i).get_id()==id) {
				PublicacionEncontrado=lstPublicacion.get(i);
				break;
			}
			
		}
		return PublicacionEncontrado;
	}
	
	/**
	 * Metodo para agregar una publicacion
	 * @param publicacion
	 * @return true si se agrega, false si no 
	 */
	public boolean Agregar(Publicacion publicacion) {
		int nuevoIdPublicacion=GenerarIdPublicacion();
		
		publicacion.set_id(nuevoIdPublicacion);
		
		
		lstPublicacion.add(publicacion);
		return true;
	}
	
	
	public boolean Eliminar() {
		if(posicion<0 || posicion>lstPublicacion.size()) {
			return false;
		}else {
			lstPublicacion.remove(posicion);
			return true;
		}
	}
	
	
	
	/**
	 * Metodo que modifica TipoPublicacion
	 * @param id
	 * @param nuevoTipoPublicacion
	 * @return true si se modifica, false si no.
	 */
	public boolean Modificar(int id, Publicacion nuevoPublicacion) {
		if(posicion<0 || posicion>lstPublicacion.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorId(nuevoPublicacion.get_id());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				lstPublicacion.set(posicion, nuevoPublicacion);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	
	public int GenerarIdPublicacion() {
		return lstPublicacion.size()+1;
	}
	
	
	
	/**
	  * Metodo que imprime la coleccion
	  */
	public void imprimirTodos() {
		for(int i=0;i<lstPublicacion.size(); i++) {
			System.out.println(lstPublicacion.get(i));
			
		}
	}
	
	
	
}
