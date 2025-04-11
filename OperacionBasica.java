package src.operaciones;

public class OperacionBasica implements Operacion {
    private String nombre;

    public OperacionBasica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcular(double a, double b) {
        switch (nombre) {
            case "Suma":
                return a + b;
            case "Resta":
                return a - b;
            case "Multiplicación":
                return a * b;
            case "División":
                if (b != 0) return a / b;
                System.out.println("Error: División por cero.");
                return 0;
            default:
                System.out.println("Operación no reconocida.");
                return 0;
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
