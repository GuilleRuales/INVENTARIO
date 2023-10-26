import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Productos> listaProductos =new ArrayList<>();
    private Archivo archivo = new Archivo();
    public void imprimirMenu() {

        int opcion = 0;
        archivo.cargarProductos(listaProductos);

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("=========================================================");
            System.out.println("INGRESAR PRODUCTO (1)");
            System.out.println("ELIMINAR PRODUCTO (2)");
            System.out.println("VER TODOS LOS PRODUCTO(3)");
            System.out.println("VER INFORMACIÓN DE UN PRODUCTO(4)");
            System.out.println("SALIR (0)");
            System.out.println("=========================================================");

            do {

                System.out.println("\nINGRESE UNA OPCIÓN");
                opcion = sc.nextInt();
                Inventario inventario= new Inventario();

                switch (opcion) {
                    case 1:

                        inventario.agregarProducto(listaProductos);
                        archivo.guardarProductos(listaProductos);

                        break;
                    case 2:

                        inventario.eliminarProducto(listaProductos);
                        archivo.guardarProductos(listaProductos);

                        break;
                    case 3:

                        inventario.imprimirTodosProductos(listaProductos);

                        break;
                    case 4:

                        inventario.imprimirProducto(listaProductos);

                        break;
                    case 0:

                        System.out.println("GRACIAS POR PREFERIRNOS");

                        break;

                    default:

                        System.out.println("OPCION NO VALIDA");

                        break;
                }
            } while ((opcion < 0) || (opcion > 4));

        }while (opcion != 0);
    }
}