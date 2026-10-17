public class PerfilMedico {
    // Variables de instancia
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura; // en centimetros
    private double peso;   // en kilogramos

    // Constructor
    public PerfilMedico(String primerNombre, String apellido, String sexo, 
                        int dia, int mes, int anio, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        setAltura(altura);
        setPeso(peso);
    }

    // Metodos establecer (set) y obtener (get)
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        if (anio > 1900 && anio <= 2026) {
            this.anio = anio;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }

    // Metodos de calculo
    public int calcularEdad() {
        return 2026 - anio;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String calcularFrecuenciaEsperada() {
        int max = calcularFrecuenciaMaxima();
        double minEsperada = max * 0.50;
        double maxEsperada = max * 0.85;
        return String.format("%.1f - %.1f pulsos por minuto", minEsperada, maxEsperada);
    }

    public double calcularBMI() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }
}