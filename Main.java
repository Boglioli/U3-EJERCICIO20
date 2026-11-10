public class Main {
    public static void main(String[] args) {
        ControlAforo control = new ControlAforo(3);
        control.registrarIngresos();
        control.registrarIngresos();
        control.registrarIngresos();
        control.registrarIngresos();
        control.registrarIngresos();

        control.registrarSalida();

        control.registrarIngresos();
        System.out.println("asistentes actuales: " + control.getAsistentesActuales());
    }
}
