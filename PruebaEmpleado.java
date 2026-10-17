import java.awt.GraphicsEnvironment;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre del empleado:");
        String primerNombre = scanner.nextLine();

        System.out.println("Ingrese el apellido paterno:");
        String apellidoPaterno = scanner.nextLine();

        System.out.println("Ingrese el salario mensual:");
        double salarioMensual = scanner.nextDouble();

        Empleado empleado = new Empleado(primerNombre, apellidoPaterno, salarioMensual);

        System.out.println("\nDatos del empleado:");
        System.out.printf("%s %s\nSalario mensual: %.2f\nSalario anual: %.2f%n",
                empleado.getPrimerNombre(),
                empleado.getApellidoPaterno(),
                empleado.getSalarioMensual(),
                empleado.getSalarioAnual());

        double porcentaje;

        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Ingrese el porcentaje de aumento (por ejemplo 10):");
            porcentaje = scanner.nextDouble();
            scanner.nextLine();
        } else {
            String porcentajeTexto = JOptionPane.showInputDialog("Ingrese el porcentaje de aumento (por ejemplo 10):");
            porcentaje = Double.parseDouble(porcentajeTexto);
        }

        empleado.setSalarioMensual(empleado.getSalarioMensual() * (1 + porcentaje / 100));

        if (GraphicsEnvironment.isHeadless()) {
            System.out.printf("Empleado: %s %s\nNuevo salario mensual: %.2f\nNuevo salario anual: %.2f%n",
                    empleado.getPrimerNombre(),
                    empleado.getApellidoPaterno(),
                    empleado.getSalarioMensual(),
                    empleado.getSalarioAnual());
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    String.format("Empleado: %s %s\nNuevo salario mensual: %.2f\nNuevo salario anual: %.2f",
                            empleado.getPrimerNombre(),
                            empleado.getApellidoPaterno(),
                            empleado.getSalarioMensual(),
                            empleado.getSalarioAnual()),
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        scanner.close();
    }
}
