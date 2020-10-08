
/*autor: Angel Valladares
 * fecha 08-10-2020
 */
package Clases;

public class Publicacion {
	
	private int _id;
	private String _descripcion;
	private String _fecha;
	private TipoPublicacion _tipoPublicacion;
	public Publicacion() {
		super();
	}
	public Publicacion(int _id, String _descripcion, String _fecha, TipoPublicacion _tipoPublicacion) {
		super();
		this._id = _id;
		this._descripcion = _descripcion;
		this._fecha = _fecha;
		this._tipoPublicacion = _tipoPublicacion;
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
	public String get_fecha() {
		return _fecha;
	}
	public void set_fecha(String _fecha) {
		this._fecha = _fecha;
	}
	public TipoPublicacion get_tipoPublicacion() {
		return _tipoPublicacion;
	}
	public void set_tipoPublicacion(TipoPublicacion _tipoPublicacion) {
		this._tipoPublicacion = _tipoPublicacion;
	}
	@Override
	public String toString() {
		return "Publicacion [_id=" + _id + ", _descripcion=" + _descripcion + ", _fecha=" + _fecha
				+ ", _tipoPublicacion=" + _tipoPublicacion + "]";
	}
	
	

}
