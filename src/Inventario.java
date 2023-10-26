import java.util.List;
import java.util.Scanner;

public class Inventario {


    public void agregarProducto(List<Productos> listaProductos){

        String opcion ;
        Scanner sc = new Scanner(System.in);
        do {

            Productos producto = new Productos();
            producto.ingresarDatosProducto();
            listaProductos.add(producto);
            System.out.println("Producto "+producto.getNombre()+" ingresado");
            System.out.println("==================================================================");
            System.out.println("¿Desea agregar otro producto? (si/no)");
            opcion=sc.next().toLowerCase();

        }while(opcion.equals("si"));
    }
    public void eliminarProducto(List<Productos> listaProductos){

        String codigo =" " ;
        Scanner sc = new Scanner(System.in);
        char encontrado = 'F';
        do {
            System.out.println("Ingrese el código del producto que desea eliminar o escriba salir:");
            codigo = sc.next();

            for (Productos producto : listaProductos) {

                if (producto.getCodigo().equals(codigo)) {
                    listaProductos.remove(producto);
                    encontrado= 'T';
                    System.out.println("PRODUCTO ELIMINADO");
                    break;
                }

            }
            if(codigo.equals("salir")){
                encontrado='T';
            }
        } while (encontrado=='F');
    }
    public void imprimirTodosProductos(List<Productos> listaProductos){
        for (Productos producto : listaProductos) {
            System.out.println("Producto: "+producto.getNombre());
            System.out.println("Codigo: "+producto.getCodigo());
            System.out.println("Precio: "+producto.getPrecio());
            System.out.println("Stock: "+producto.getStock());
            System.out.println("Proveedor: "+producto.getProveedor().getNombreP());

        }
    }
    public void imprimirProducto(List<Productos> listaProductos){

        String codigo =" " ;
        Scanner sc = new Scanner(System.in);
        char encontrado = 'F';
        do {
            System.out.println("Ingrese el código del producto que desea ver o escriba salir:");
            codigo = sc.next();

            for (Productos producto : listaProductos) {

                if (producto.getCodigo().equals(codigo)) {

                    System.out.println("Producto: "+producto.getNombre());
                    System.out.println("Codigo: "+producto.getCodigo());
                    System.out.println("Precio: "+producto.getPrecio());
                    System.out.println("Stock: "+producto.getStock());
                    System.out.println("Proveedor: "+producto.getProveedor().getNombreP());
                    encontrado= 'T';

                    break;
                }

            }
            if(codigo.equals("salir")){
                encontrado='T';
            }
        } while (encontrado=='F');
    }

}

