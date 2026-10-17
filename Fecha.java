public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    // constructor
    public Fecha(int m, int d, int a) {
        mes = m;
        dia = d;
        anio = a;
    }

    public void setMes(int m) { mes = m; }
    public int getMes() { return mes; }

    public void setDia(int d) { dia = d; }
    public int getDia() { return dia; }

    public void setAnio(int a) { anio = a; }
    public int getAnio() { return anio; }

    // mmetodo mostrarFecha
    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }
}
