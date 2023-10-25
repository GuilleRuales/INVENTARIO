import java.util.Scanner;

public class Proveedor {

    private String nombre;
    private String codigo;
    private double precio;

    public Proveedor() {

    }

    public Proveedor(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void ingresarDatosProveedor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del proveedor: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo del proveedor: ");
        this.codigo = sc.next();
        System.out.println("Ingrese el precio del producto del proveedor: ");
        this.precio = sc.nextDouble();
    }

}
