/*autor: Angel Valladares
 * fecha 08-10-2020
 */

package Gestion;

import java.util.LinkedList;

import Clases.TipoPublicacion;

public class GestionTipoPublicacion {
	
	int posicion=-1;
	
	private LinkedList<TipoPublicacion> lstTipoPublicacion=new LinkedList<>();

	public GestionTipoPublicacion() {
		super();
	}
	
	
	
	
	
	/**
	 * Metodo que busca por id
	 * @param id
	 * @return posicion de la coleccion donde se encuentra el objeto.
	 */
	public int  BuscarPorId(int id) {
		int posicion=-1;
		for(int i=0;i<lstTipoPublicacion.size();i++) {
			if(lstTipoPublicacion.get(i).get_id()==id) {
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
	public TipoPublicacion BuscarPorObjeto(int id) {
		TipoPublicacion TipoEncontrado=null;
		for(int i=0;i<lstTipoPublicacion.size(); i++) {
			if(lstTipoPublicacion.get(i).get_id()==id) {
				TipoEncontrado=lstTipoPublicacion.get(i);
				break;
			}
			
		}
		return TipoEncontrado;
	}
	
	/**
	 * Metodo para agregar una publicacion
	 * @param publicacion
	 * @return true si se agrega, false si no 
	 */
	public boolean Agregar(TipoPublicacion publicacion) {
		lstTipoPublicacion.add(publicacion);

		return true;
	}
	
	
	public boolean Eliminar() {
		if(posicion<0 || posicion>lstTipoPublicacion.size()) {
			return false;
		}else {
			lstTipoPublicacion.remove(posicion);
			return true;
		}
	}
	
	
	
	/**
	 * Metodo que modifica TipoPublicacion
	 * @param id
	 * @param nuevoTipoPublicacion
	 * @return true si se modifica, false si no.
	 */
	public boolean Modificar(int id, TipoPublicacion nuevoTipoPublicacion) {
		if(posicion<0 || posicion>lstTipoPublicacion.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorId(nuevoTipoPublicacion.get_id());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				lstTipoPublicacion.set(posicion, nuevoTipoPublicacion);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	
	
	 /**
	  * Metodo que imprime la coleccion
	  */
	public void imprimirTodos() {
		for(int i=0;i<lstTipoPublicacion.size(); i++) {
			System.out.println(lstTipoPublicacion.get(i));
			
		}
	}

	
	
	

}
