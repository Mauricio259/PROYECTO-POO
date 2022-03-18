import java.util.ArrayList;

public class Region extends Ciudad {
	private ArrayList<Ciudad> ciudad;
	
	public Region(String nombre) {
		super(nombre);
	}

	public ArrayList<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(ArrayList<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}

}
