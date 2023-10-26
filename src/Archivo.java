import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Archivo {

    public void guardarProductos(List<Productos> listaProductos){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Productos.txt"))){
            for (Productos producto : listaProductos){
                writer.write(producto.getNombre()+";"+producto.getCodigo()+";"+producto.getPrecio()+";"+producto.getStock()+";"+producto.getProveedor().getNombreP());
                writer.newLine();
            }

        }catch (IOException e){
            System.out.println("Error al guardar los productos en el archivo "+e);
        }
    }

    public void cargarProductos(List<Productos> listaProductos){

        try(BufferedReader reader = new BufferedReader(new FileReader("Productos.txt") )) {
            String linea;
            while((linea=reader.readLine())!=null){
                String[] partes= linea.split(";");
                if (partes.length==5){
                    String nombre = partes[0];
                    String codigo = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    int stock = Integer.parseInt(partes[3]);
                    String nombreP = partes[4];
                    Proveedor proveedor = new Proveedor(nombreP,codigo,precio);
                    Productos producto = new Productos(nombre, codigo, precio, stock, proveedor);
                    listaProductos.add(producto);
                }
            }

        }catch (IOException e){
            System.out.println("Error al cargar los productos en el archivo");
        }
    }

}