package autolavado;

import javax.swing.DefaultComboBoxModel;

public class RegistroController {

    private final RegistroModel modelo;
    private final RegistroView vista;

    public RegistroController(RegistroModel modelo, RegistroView vista) {
        this.modelo = modelo;
        this.vista = vista;

        iniciarControlador();
    }

    private void iniciarControlador() {
        cargarDatosIniciales();
        this.vista.getBotonRegistrar().addActionListener(e -> registrarServicio());
    }

    private void cargarDatosIniciales() {
        String[] funcionarios = modelo.getFuncionarios();
        String[] tiposVehiculo = modelo.getTiposVehiculo();
        String[] servicios = modelo.getServicios();

        vista.getComboBoxFuncionarios().setModel(new DefaultComboBoxModel<>(funcionarios));
        vista.getComboBoxTiposVehiculo().setModel(new DefaultComboBoxModel<>(tiposVehiculo));
        vista.getComboBoxServicios().setModel(new DefaultComboBoxModel<>(servicios));
    }

    private void registrarServicio() {
        String funcionarioSeleccionado = (String) vista.getComboBoxFuncionarios().getSelectedItem();
        String vehiculoSeleccionado = (String) vista.getComboBoxTiposVehiculo().getSelectedItem();
        String servicioSeleccionado = (String) vista.getComboBoxServicios().getSelectedItem();

        modelo.guardarRegistro(funcionarioSeleccionado, vehiculoSeleccionado, servicioSeleccionado);

        vista.mostrarMensaje("¡Servicio registrado exitosamente!");
    }
}
