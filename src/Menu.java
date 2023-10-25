import java.util.Scanner;

public class Menu {

    public void imprimirMenu() {

        int opcion = 0;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("=========================================================");
            System.out.println("INGRESAR PRODUCTO (1)");
            System.out.println("ELIMINAR PRODUCTO (2)");
            System.out.println("VER INFORMACIÓN DE UN PRODUCTO(3)");
            System.out.println("SALIR (0)");
            System.out.println("=========================================================");

            do {

                System.out.println("\nINGRESE UNA OPCIÓN");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        Productos producto = new Productos();
                        producto.ingresarDatosProducto();

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 0:
                        System.out.println("GRACIAS POR PREFERIRNOS");
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA");
                        break;
                }

            } while ((opcion < 0) || (opcion > 3));

        }while (opcion != 0);
    }
}
