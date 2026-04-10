import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar Cliente Regular");
            System.out.println("2. Registrar Cliente Frecuente");
            System.out.println("3. Registrar Cliente Mayorista");
            System.out.println("4. Mostrar todos los clientes");
            System.out.println("5. Buscar cliente por ID");
            System.out.println("6. Filtrar clientes por tipo");
            System.out.println("7. Calcular total de compra");
            System.out.println("8. Mostrar compras altas");
            System.out.println("9. Cliente con mayor pago");
            System.out.println("10. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Valor compra: ");
                    double val = sc.nextDouble();

                    lista.add(new ClienteRegular(nom, id, val));
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    nom = sc.nextLine();

                    System.out.print("ID: ");
                    id = sc.nextInt();

                    System.out.print("Valor compra: ");
                    val = sc.nextDouble();

                    System.out.print("Numero de compras: ");
                    int num = sc.nextInt();

                    lista.add(new ClienteFrecuente(nom, id, val, num));
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    nom = sc.nextLine();

                    System.out.print("ID: ");
                    id = sc.nextInt();

                    System.out.print("Valor compra: ");
                    val = sc.nextDouble();

                    System.out.print("Cantidad de productos: ");
                    int cant = sc.nextInt();

                    lista.add(new ClienteMayorista(nom, id, val, cant));
                    break;

                case 4:
                    System.out.println("\n--- LISTA DE CLIENTES ---");
                    for (Cliente c : lista) {
                        System.out.println(c);
                        System.out.println("----------------------");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese ID a buscar: ");
                    int buscarId = sc.nextInt();
                    boolean encontrado = false;

                    for (Cliente c : lista) {
                        if (c.getIdentificacion() == buscarId) {
                            System.out.println("\nCliente encontrado:");
                            System.out.println(c);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("1. Regular  2. Frecuente  3. Mayorista");
                    int tipo = sc.nextInt();

                    for (Cliente c : lista) {
                        if ((tipo == 1 && c instanceof ClienteRegular) ||
                                (tipo == 2 && c instanceof ClienteFrecuente) ||
                                (tipo == 3 && c instanceof ClienteMayorista)) {

                            System.out.println(c);
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 7:
                    System.out.println("\n--- TOTAL DE COMPRAS ---");

                    for (Cliente c : lista) {
                        double total = c.calcularTotalPagar();
                        c.imprimirResumen(total);
                        System.out.println("----------------------");
                    }
                    break;

                case 8:
                    System.out.println("\n--- COMPRAS ALTAS ---");

                    for (Cliente c : lista) {
                        if (c.compraAlta()) {
                            System.out.println(c);
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 9:
                    if (lista.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                        break;
                    }

                    Cliente mayor = lista.get(0);

                    for (Cliente c : lista) {
                        if (c.calcularTotalPagar() > mayor.calcularTotalPagar()) {
                            mayor = c;
                        }
                    }

                    System.out.println("\n--- CLIENTE CON MAYOR PAGO ---");
                    System.out.println(mayor);
                    break;

                case 10:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 10);

        sc.close();
    }
}
