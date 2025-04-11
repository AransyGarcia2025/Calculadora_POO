package src.operaciones;

public class Resultado {
    private String operacion;
    private double numero1;
    private double numero2;
    private double resultado;

    public Resultado(String operacion, double numero1, double numero2, double resultado) {
        this.operacion = operacion;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return operacion + ": " + numero1 + " y " + numero2 + " = " + resultado;
    }
}
