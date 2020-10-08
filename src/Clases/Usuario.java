/*autor: Angel Valladares
 * fecha 08-10-2020
 */

package Clases;

import java.util.LinkedList;

public class Usuario {
	
	private int _id;
	private String _nombres;
	private String _apellidos;
	private String _usuario;
	private LinkedList<Publicacion> _lstPublicacion=new LinkedList<>();
	public Usuario() {
		super();
	}
	public Usuario(int _id, String _nombres, String _apellidos, String _usuario,
			LinkedList<Publicacion> _lstPublicacion) {
		super();
		this._id = _id;
		this._nombres = _nombres;
		this._apellidos = _apellidos;
		this._usuario = _usuario;
		this._lstPublicacion = _lstPublicacion;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_nombres() {
		return _nombres;
	}
	public void set_nombres(String _nombres) {
		this._nombres = _nombres;
	}
	public String get_apellidos() {
		return _apellidos;
	}
	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}
	public String get_usuario() {
		return _usuario;
	}
	public void set_usuario(String _usuario) {
		this._usuario = _usuario;
	}
	public LinkedList<Publicacion> get_lstPublicacion() {
		return _lstPublicacion;
	}
	public void set_lstPublicacion(LinkedList<Publicacion> _lstPublicacion) {
		this._lstPublicacion = _lstPublicacion;
	}
	@Override
	public String toString() {
		return "Usuario [_id=" + _id + ", _nombres=" + _nombres + ", _apellidos=" + _apellidos + ", _usuario="
				+ _usuario + ", _lstPublicacion=" + _lstPublicacion + "]";
	}
	 
}
