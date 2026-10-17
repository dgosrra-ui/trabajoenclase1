import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el mes (número): ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el día (número): ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = entrada.nextInt();

        Fecha miFecha = new Fecha(mes, dia, anio);
        JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + miFecha.getMes() + "/" + miFecha.getDia() + "/" + miFecha.getAnio());

        entrada.close();
    }
}