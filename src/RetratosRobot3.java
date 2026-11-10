
public class RetratosRobot3 {

	static String [][] opciones = {
			{"el pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||"},
			{"los ojos", "|  o o  |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |"},
			{"las orejas y la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
			{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
			{"la barbilla", "\\_______/", "\\,,,,,,,/", "\\......./"}
	};
	
	public static void main(String[] args) {
		String crearRetrato = IO.readln("Crear Retrato? (s/n): ");
		while (crearRetrato.equalsIgnoreCase("s")) {
			String [] retrato = new String[5];
			for (int i=0; i<opciones.length; i++)
				retrato[i] = elegirOpcion(i);
			for (int i=0; i<retrato.length; i++)
				IO.println(retrato[i]);
			crearRetrato = IO.readln("Crear Retrato? (s/n): ");
		}

	}
	
	static String elegirOpcion(int rasgo) {
		IO.println("Elige una opción para " + opciones[rasgo][0]);
		for (int i=1; i<opciones[rasgo].length; i++)
			IO.println(i + ": " + opciones[rasgo][i]);
		int op;
		do {
			op = Integer.parseInt(IO.readln("Opción: "));
		} while (op < 1 || op > opciones.length);
		return opciones[rasgo][op];
	}

}
