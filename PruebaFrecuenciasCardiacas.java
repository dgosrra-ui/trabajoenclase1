public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        FrecuenciasCardiacas persona =
                new FrecuenciasCardiacas("Ana", "Pérez", 15, 6, 2000);

        comprobar("nombre", "Ana", persona.getNombre());
        comprobar("apellido", "Pérez", persona.getApellido());
        comprobar("edad", 26, persona.calcularEdad());
        comprobar("frecuencia cardíaca máxima", 194,
                persona.calcularFrecuenciaCardiacaMaxima());
        comprobar("frecuencia mínima esperada", 97.0,
                persona.calcularFrecuenciaMinima());
        comprobar("frecuencia máxima esperada", 164.9,
                persona.calcularFrecuenciaMaximaEsperada());

        System.out.println("Prueba de FrecuenciasCardiacas superada.");
    }

    private static void comprobar(String caso, Object esperado, Object obtenido) {
        if (!esperado.equals(obtenido)) {
            throw new AssertionError(
                    caso + ": se esperaba " + esperado + ", pero se obtuvo " + obtenido);
        }
        System.out.println(caso + ": correcto (" + obtenido + ")");
    }
}
