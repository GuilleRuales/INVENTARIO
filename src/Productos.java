import java.util.Scanner;

public class Productos {

    private String nombre;
    private String codigo;
    private int precio;
    private int stock;
    private Proveedor proveedor;


    public Productos() {

    }


    public Productos(String nombre, String codigo, int precio, int stock, Proveedor proveedor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }



    public void ingresarDatosProducto(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo del producto: ");
        this.codigo = sc.next();
        System.out.println("Ingrese el precio del producto");
        this.codigo = sc.next();
        System.out.println("Ingrese el stock del producto");
        this.stock = sc.nextInt();

        proveedor = new Proveedor();
        proveedor.ingresarDatosProveedor();

    }

}
