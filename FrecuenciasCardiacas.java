import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido, int diaNacimiento, int mesNacimiento, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int calcularEdad() {
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
}
