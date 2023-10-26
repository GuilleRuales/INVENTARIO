import java.util.Scanner;

public class Proveedor {

    private String nombreP;
    private String codigo;
    private double precio;

    public Proveedor() {

    }

    public Proveedor(String nombreP, String codigo, double precio) {
        this.nombreP = nombreP;
        this.codigo = codigo;
        this.precio = precio;
    }


    public String getNombreP() {
        return nombreP;
    }

    public void setNombre(String nombreP) { this.nombreP = nombreP;
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
        this.nombreP = sc.next();
        System.out.println("Ingrese el codigo del proveedor: ");
        this.codigo = sc.next();
        System.out.println("Ingrese el precio del producto del proveedor: ");
        this.precio = sc.nextDouble();

        if (this.precio < 0){
            System.out.println("====Ingrese un valor valido====");
            this.precio = sc.nextDouble();
        }

    }

}
