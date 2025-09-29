package autolavado;

public class RegistroModel {

    private final String[] funcionarios = {"Pedro", "María", "Carlos", "Ana"};
    private final String[] tiposVehiculo = {"Automóvil", "Camioneta"};
    private final String[] servicios = {
            "Lavado Básico",
            "Lavado Especial",
            "Desinfección Básica",
            "Desinfección Avanzada",
            "Combo 1",
            "Combo 2",
            "Combo 3"
    };

    public String[] getFuncionarios() {
        return funcionarios;
    }

    public String[] getTiposVehiculo() {
        return tiposVehiculo;
    }

    public String[] getServicios() {
        return servicios;
    }

    public void guardarRegistro(String funcionario, String vehiculo, String servicio) {
        System.out.println("Registro Guardado:");
        System.out.println("  - Funcionario: " + funcionario);
        System.out.println("  - Vehículo: " + vehiculo);
        System.out.println("  - Servicio: " + servicio);
    }
}