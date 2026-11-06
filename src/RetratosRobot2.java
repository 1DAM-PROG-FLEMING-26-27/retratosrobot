
public class RetratosRobot2 {

	public static void main(String[] args) {
		String crearRetrato = IO.readln("Crear Retrato? (s/n): ");
		while (crearRetrato.equalsIgnoreCase("s")) {
			String pelo = elegirOpcion("el pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||");
			String ojos = elegirOpcion("los ojos", "|  o o  |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |");
			String orejas = elegirOpcion("las orejas y la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >");
			String boca = elegirOpcion("la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |");
			String barbilla = elegirOpcion("la barbilla", "\\_______/", "\\,,,,,,,/", "\\......./");
			System.out.printf("%s%n%s%n%s%n%s%n%s%n", pelo, ojos, orejas, boca, barbilla);
			crearRetrato = IO.readln("Crear Retrato? (s/n): ");
		}

	}
	
	static String elegirOpcion(String rasgo, String ... opciones) {
		IO.println("Elige una opción para " + rasgo);
		for (int i=0; i<opciones.length; i++)
			IO.println((i + 1) + ": " + opciones[i]);
		int op;
		do {
			op = Integer.parseInt(IO.readln("Opción: "));
		} while (op < 1 || op > opciones.length);
		return opciones[op - 1];
	}

}
