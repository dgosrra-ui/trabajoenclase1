import javax.swing.JOptionPane;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    // Constructor para inicializar los datos
    public FrecuenciasCardiacas(String nombre, String apellido, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDiaNacimiento() { return diaNacimiento; }
    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }

    public int getMesNacimiento() { return mesNacimiento; }
    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }

    public int getAnioNacimiento() { return anioNacimiento; }
    public void setAnioNacimiento(int anioNacimiento) { this.anioNacimiento = anioNacimiento; }

    // Métodos de cálculo básicos
    public int calcularEdad() {
        int anioActual = 2026;
        return anioActual - anioNacimiento;
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularFrecuenciaMinima() {
        return calcularFrecuenciaCardiacaMaxima() * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaCardiacaMaxima() * 0.85;
    }

    //  Ventanas Emergentes
    public static void main(String[] args) {
        // Solicitar datos mediante cuadros de diálogo emergentes
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Registro", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:", "Registro", JOptionPane.QUESTION_MESSAGE);
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su día de nacimiento:", "Registro", JOptionPane.QUESTION_MESSAGE));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su mes de nacimiento:", "Registro", JOptionPane.QUESTION_MESSAGE));
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento:", "Registro", JOptionPane.QUESTION_MESSAGE));

        // Crear el objeto de la clase
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        // Construir el mensaje con los resultados
        String resultado = "--- RESULTADOS DE FRECUENCIAS CARDÍACAS ---\n\n"
                + "Nombre completo: " + persona.getNombre() + " " + persona.getApellido() + "\n"
                + "Fecha de nacimiento: " + persona.getDiaNacimiento() + "/" + persona.getMesNacimiento() + "/" + persona.getAnioNacimiento() + "\n"
                + "Edad actual: " + persona.calcularEdad() + " años\n"
                + "Frecuencia Cardíaca Máxima: " + persona.calcularFrecuenciaCardiacaMaxima() + " ppm\n"
                + "Rango Esperado (50%-85%): " + persona.calcularFrecuenciaMinima() + " - " + persona.calcularFrecuenciaMaximaEsperada() + " ppm";

        // Mostrar la ventana emergente con el resultado final
        JOptionPane.showMessageDialog(null, resultado, "Informe de Salud", JOptionPane.INFORMATION_MESSAGE);
    }
}