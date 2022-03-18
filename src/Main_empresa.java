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
			
			if(item > 0 && item < 6) {
				if(item == 1) {
					leer = new Scanner(System.in);
					System.out.print("Planta electrica: ");
					planta = leer.nextLine();
					System.out.print("Region: ");
					region = leer.nextLine();
					if(planta.toLowerCase().equals("coca codo sinclair")) {
						sinclair = new Planta_electrica(planta);
						if(region.toLowerCase().equals("costa")) {
							costa = new Region(region);
							leer = new Scanner(System.in);
							System.out.print("Cantidad de ciudades que va a ingresar: ");
							cant = leer.nextInt();
							int i = 0;
							while(i < cant) {
								leer = new Scanner(System.in);
								System.out.print("Ciudad: ");
								canton = leer.nextLine();
								ciudad = new Ciudad(canton);
								ciudadCosta.add(ciudad);
								consCiudadesSinc.put(ciudadCosta.get(i).getNombre(), sinclair);
								i++;
							}
							costa.setCiudad(ciudadCosta);
							sinclair.setRegion(costa);
						}
						if(region.toLowerCase().equals("sierra")) {
							sierra = new Region(region);
							leer = new Scanner(System.in);
							System.out.print("Cantidad de ciudades que va a ingresar: ");
							cant = leer.nextInt();
							int i = 0;
							while(i < cant) {
								leer = new Scanner(System.in);
								System.out.print("Ciudad: ");
								canton = leer.nextLine();
								ciudad = new Ciudad(canton);
								ciudadSierra.add(ciudad);
								consCiudadesSinc.put(ciudadSierra.get(i).getNombre(), sinclair);
								i++;
							}
							sierra.setCiudad(ciudadSierra);
							sinclair.setRegion(sierra);
						}
						if(region.toLowerCase().equals("oriente")) {
							oriente = new Region(region);
							leer = new Scanner(System.in);
							System.out.print("Cantidad de ciudades que va a ingresar: ");
							cant = leer.nextInt();
							int i = 0;
							while(i < cant) {
								leer = new Scanner(System.in);
								System.out.print("Ciudad: ");
								canton = leer.nextLine();
								ciudad = new Ciudad(canton);
								ciudadOriente.add(ciudad);
								consCiudadesSinc.put(ciudadOriente.get(i).getNombre(), sinclair);
								
								i++;
							}
							oriente.setCiudad(ciudadOriente);
							sinclair.setRegion(oriente);
						}
						consumosPlantas.put(sinclair.getNombre(), consCiudadesSinc);
						consumosRegiones.put(sinclair.getRegion().getNombre() , sinclair.getRegion());
						
						
					}
					ciudadCosta = new ArrayList<>();
					ciudadSierra = new ArrayList<Ciudad>();
					ciudadOriente = new ArrayList<Ciudad>();
					
					if(planta.toLowerCase().equals("sopladora")) {
						sopladora = new Planta_electrica(planta);
						if(region.toLowerCase().equals("costa")) {
							costa = new Region(region);
							leer = new Scanner(System.in);
							System.out.print("Cantidad de ciudades que va a ingresar: ");
							cant = leer.nextInt();
							int i = 0;
							while(i < cant) {
								leer = new Scanner(System.in);
								System.out.print("Ciudad: ");
								canton = leer.nextLine();
								ciudad = new Ciudad(canton);
								ciudadCosta.add(ciudad);
								consCiudadesSopl.put(ciudadCosta.get(i).getNombre(), sopladora);
								i++;
							}
							costa.setCiudad(ciudadCosta);
							sopladora.setRegion(costa);
						}
						if(region.toLowerCase().equals("sierra")) {
							sierra = new Region(region);
							leer = new Scanner(System.in);
							System.out.print("Cantidad de ciudades que va a ingresar: ");
							cant = leer.nextInt();
							int i = 0;
							while(i < cant) {
								leer = new Scanner(System.in);
								System.out.print("Ciudad: ");
								canton = leer.nextLine();
								ciudad = new Ciudad(canton);
								ciudadSierra.add(ciudad);
								consCiudadesSopl.put(ciudadSierra.get(i).getNombre(), sopladora);
								i++;
							}
							sierra.setCiudad(ciudadSierra);
							sopladora.setRegion(sierra);
						}
						if(region.toLowerCase().equals("oriente")) {
							oriente = new Region(region);
							leer = new Scanner(System.in);
							System.out.print("Cantidad de ciudades que va a ingresar: ");
							cant = leer.nextInt();
							int i = 0;
							while(i < cant) {
								leer = new Scanner(System.in);
								System.out.print("Ciudad: ");
								canton = leer.nextLine();
								ciudad = new Ciudad(canton);
								ciudadOriente.add(ciudad);
								consCiudadesSopl.put(ciudadOriente.get(i).getNombre(), sopladora);
								i++;
							}
							oriente.setCiudad(ciudadOriente);
							sopladora.setRegion(oriente);
						}
						consumosPlantas.put(sopladora.getNombre(), consCiudadesSopl);
						consumosRegiones.put(sopladora.getRegion().getNombre(), sopladora.getRegion());
					}
				}
		
						