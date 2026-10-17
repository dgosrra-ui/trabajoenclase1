public class PruebaFactura {
    public static void main(String[] args) {
        Factura miFactura = new Factura("A1", "Martillo", 3, 10.50);

        System.out.println("Número de pieza: " + miFactura.getNumeroPieza());
        System.out.println("Descripción: " + miFactura.getDescripcionPieza());
        System.out.println("Cantidad: " + miFactura.getCantidad());
        System.out.println("Precio unitario: " + miFactura.getPrecioPorArticulo());
        System.out.println("Monto total: " + miFactura.obtenerMontoFactura());
    }
}
