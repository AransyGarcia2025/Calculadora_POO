package src.operaciones;

public class Potencia implements Operacion {
    @Override
    public double calcular(double base, double exponente) {
        return calcularPotencia(base, (int) exponente);
    }

    private double calcularPotencia(double base, int exponente) {
        if (exponente == 0) return 1;
        if (exponente == 1) return base;
        return base * calcularPotencia(base, exponente - 1);
    }

    @Override
    public String getNombre() {
        return "Potencia";
    }
}
