public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", "García", 2500.00);
        Empleado empleado2 = new Empleado("Luis", "Pérez", 3200.50);

        System.out.println("Salario anual inicial:");
        System.out.printf("%s %s: %.2f%n", empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());
        System.out.printf("%s %s: %.2f%n", empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());

        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        System.out.println();
        System.out.println("Salario anual después del aumento del 10%:");
        System.out.printf("%s %s: %.2f%n", empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());
        System.out.printf("%s %s: %.2f%n", empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());
    }
}
