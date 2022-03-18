public class Empresa_electrica {
	private Planta_electrica consumos;
	
	public Empresa_electrica() {
		
	}

	public Planta_electrica getConsumos() {
		return consumos;
	}

	public void setPlantaConsumo(Planta_electrica consumos) {
		this.consumos = consumos;
	}
	
	@Override
	public String toString() {
		return consumos.getConsumo()+" "+consumos.getTarifa();
	}
	 
}