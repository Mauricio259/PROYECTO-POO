import java.util.ArrayList;

public class Planta_electrica extends Ciudad {
	private Region region;
	private Ciudad ciudad;
	private ArrayList<Integer> consumo;
	private double tarifa;
	private int totalMega;
	
	public Planta_electrica(String nombre) {
		super(nombre);
	}

	public ArrayList<Integer> getConsumo() {
		return consumo;
	}

	public void setConsumo(ArrayList<Integer> consumo) {
		this.consumo = consumo;
	}
	
	public double getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getTotalMega() {
		return totalMega;
	}

	public void setTotalMega(int totalMega) {
		this.totalMega = totalMega;
	}

	public ArrayList<Integer> consumoCiudades() {
		consumo = new ArrayList<Integer>();
		int i = 0;
		while(i < 12) {
			consumo.add((int) (Math.random()*(500+40)));
			i++;
		}
		return consumo;
	}
	
	public int consumoTotal() {
		int resultado = 0;
		for(int i = 0; i < consumo.size(); i++) {
			resultado = resultado + consumo.get(i);
		}
		return totalMega = resultado;		
	}
	
	public double tarifas(double tarifas) {
		double resultado = 0.0;
		for(int i = 0; i < consumo.size(); i++) {
			resultado = resultado + consumo.get(i);
		}
		return tarifa = (double) tarifas*resultado;
	}
	
	@Override
	public String toString() {
		return " Consumos: "+consumo;
	}

}

