/*autor: Angel Valladares
 * fecha 08-10-2020
 */
package Clases;



public class TipoPublicacion {
	

	
	private int _id;
	private String _descripcion;
	public TipoPublicacion() {
		super();
	}
	public TipoPublicacion(int _id, String _descripcion) {
		super();
		this._id = _id;
		this._descripcion = _descripcion;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_descripcion() {
		return _descripcion;
	}
	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	@Override
	public String toString() {
		return "TipoPublicacion [_id=" + _id + ", _descripcion=" + _descripcion + "]";
	}
	

}
