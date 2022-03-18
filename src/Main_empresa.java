import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main_empresa {
	public static void main(String[] args) {
		Map<String, Map<String, Planta_electrica>> consumosPlantas = new HashMap<String, Map<String, Planta_electrica>>();
		Map<String, Region> consumosRegiones = new HashMap<String, Region>();
		Map<String, Planta_electrica> consCiudadesSinc = new HashMap<String, Planta_electrica>();
		Map<String, Planta_electrica> consCiudadesSopl = new HashMap<String, Planta_electrica>();
		ArrayList<Ciudad> ciudadCosta = new ArrayList<Ciudad>();
		ArrayList<Ciudad> ciudadSierra = new ArrayList<Ciudad>();
		ArrayList<Ciudad> ciudadOriente = new ArrayList<Ciudad>();
		Planta_electrica sopladora, sinclair;
		Region costa, sierra, oriente;
		Ciudad ciudad;
		String planta, region, canton;
		boolean opcion = true;
		int item, cant;
		double tarifa;
		Scanner leer;

		while(opcion) {
			System.out.println("\n*** Matriz Energetica del Ecuador **\n"+"** Consumos mensuales y tarifa anual ***\n");
			System.out.println("[1]: Registrar planta, region y ciudad");
			System.out.println("[2]: Presentar consumos mensuales");
			System.out.println("[3]: Presentar tarifa anual");
			System.out.println("[4]: Presentar base de datos");
			System.out.println("[5]: Salir\n");
			leer = new Scanner(System.in);
			System.out.print("Ingrese el item: ");
			item = leer.nextInt();