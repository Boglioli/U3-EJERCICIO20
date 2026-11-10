public class ControlAforo {
    private int capacidadMaxima;
    private int asistentesActuales;
    public ControlAforo(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.asistentesActuales = 0;
    }
    public boolean registrarIngresos() {
        if (asistentesActuales < capacidadMaxima) {
            asistentesActuales++;
            System.out.println("ingreso permitido");
            return true;
        } else {
            System.out.println("ingreso rechazado: aforo completo");
            return false;
        }
    }
    public void registrarSalida() {
        if (asistentesActuales > 0) {
            asistentesActuales--;
            System.out.println("salida registrada");
        } else {
            System.out.println("no hay asistentes para registrar salida");
        }
    }
    public int getAsistentesActuales() {
        return asistentesActuales;
    }
}
