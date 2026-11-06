
public class RetratosRobot1 {

	public static void main(String[] args) {
		String crearRetrato = IO.readln("Crear Retrato? (s/n): ");
		while (crearRetrato.equalsIgnoreCase("s")) {
			String pelo = elegirOpcion("el pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||");
			String ojos = elegirOpcion("los ojos", "|  o o  |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |");
			String orejas = elegirOpcion("las orejas y la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >");
			String boca = elegirOpcion("la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |");
			String barbilla = elegirOpcion("la barbilla", "\\_______/", "\\,,,,,,,/", "\\......./", "\\mmmmmmm/");
			System.out.printf("%s%n%s%n%s%n%s%n%s%n", pelo, ojos, orejas, boca, barbilla);
			crearRetrato = IO.readln("Crear Retrato? (s/n): ");
		}

	}
	
	static String elegirOpcion(String rasgo, String op1, String op2, String op3, String op4) {
		String opcionSeleccionada = null;
		IO.println("Elige una opción para " + rasgo);
		IO.println("1: " + op1);
		IO.println("2: " + op2);
		IO.println("3: " + op3);
		IO.println("4: " + op4);
		int op;
		do {
			op = Integer.parseInt(IO.readln("Opción: "));
		} while (op < 1 || op > 4);
		switch (op) {
		case 1: 
			opcionSeleccionada = op1;
			break;
		case 2:
			opcionSeleccionada = op2;
			break;
		case 3:
			opcionSeleccionada = op3;
			break;
		case 4: 
			opcionSeleccionada = op4;
			break;
		}
		return opcionSeleccionada;
	}

}
