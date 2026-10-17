import javax.swing.JOptionPane;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        // Ingreso de datos con ventanas
        String nombre = JOptionPane.showInputDialog("Ingrese el primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento (1-12):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Anio de nacimiento:"));
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura en cm (ej. 170):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso en kg (ej. 68.5):"));

        // Creacion del objeto
        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Formato de salida
        String reporte = String.format(
            "--- PERFIL MEDICO ---\n" +
            "Nombre completo: %s %s\n" +
            "Sexo: %s\n" +
            "Fecha de nacimiento: %d/%d/%d\n" +
            "Altura: %.1f cm | Peso: %.1f kg\n\n" +
            "--- RESULTADOS ---\n" +
            "Edad: %d anios\n" +
            "BMI (Indice de Masa Corporal): %.2f\n" +
            "Frecuencia cardiaca maxima: %d ppm\n" +
            "Rango de frecuencia esperada: %s\n\n" +
            "--- VALORES DE BMI ---\n" +
            "Bajo peso: menos de 18.5\n" +
            "Normal: entre 18.5 y 24.9\n" +
            "Sobrepeso: entre 25 y 29.9\n" +
            "Obeso: 30 o mas",
            paciente.getPrimerNombre(), paciente.getApellido(),
            paciente.getSexo(),
            paciente.getDia(), paciente.getMes(), paciente.getAnio(),
            paciente.getAltura(), paciente.getPeso(),
            paciente.calcularEdad(),
            paciente.calcularBMI(),
            paciente.calcularFrecuenciaMaxima(),
            paciente.calcularFrecuenciaEsperada()
        );

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, reporte);
    }
}