
public class Ciudad {
	private String nombre;
	private Region region;
	
	public Ciudad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
