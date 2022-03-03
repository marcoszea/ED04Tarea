public class Main {

    public static void main(String[] args) {
        cuenta1 miCuenta;
        double saldoActual;

        miCuenta = new cuenta1("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        operativa_cuenta(miCuenta, 0);
    }

	private static void operativa_cuenta(cuenta1 miCuenta, float cantidad) {
		try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
