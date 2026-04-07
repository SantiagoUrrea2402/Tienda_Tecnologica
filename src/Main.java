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
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    sc.nextLine();
                    String nom = sc.nextLine();

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Valor compra: ");
                    double val = sc.nextDouble();

                    lista.add(new ClienteRegular(nom, id, val));
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    sc.nextLine();
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
                    System.out.print("Nombre: ");
                    sc.nextLine();
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
            }

        } while (opcion != 6);

        sc.close();
    }
}