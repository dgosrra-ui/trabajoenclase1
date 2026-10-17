import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese la descripción de la pieza: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio por artículo: ");
        double precio = entrada.nextDouble();

        Factura miFactura = new Factura(numero, descripcion, cantidad, precio);


        String mensaje = " DATOS DE LA FACTURA \n" +
                "Número de pieza: " + miFactura.getNumeroPieza() + "\n" +
                "Descripción: " + miFactura.getDescripcionPieza() + "\n" +
                "Cantidad: " + miFactura.getCantidad() + "\n" +
                "Precio unitario: $" + miFactura.getPrecioPorArticulo() + "\n" +
                "Monto total: $" + miFactura.obtenerMontoFactura();
        JOptionPane.showMessageDialog(null, mensaje);

        entrada.close();
    }
}
