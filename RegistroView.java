package autolavado;

import javax.swing.*;
import java.awt.*;

public class RegistroView extends JFrame {

    private JComboBox<String> comboBoxFuncionarios;
    private JComboBox<String> comboBoxTiposVehiculo;
    private JComboBox<String> comboBoxServicios;
    private JButton botonRegistrar;

    public RegistroView() {
        setTitle("Registro de Servicio - Lavado La Estrella");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();
        organizarComponentes();
    }

    private void inicializarComponentes() {
        comboBoxFuncionarios = new JComboBox<>();
        comboBoxTiposVehiculo = new JComboBox<>();
        comboBoxServicios = new JComboBox<>();
        botonRegistrar = new JButton("Registrar Servicio");
    }

    private void organizarComponentes() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Funcionario Asignado:"));
        panel.add(comboBoxFuncionarios);

        panel.add(new JLabel("Tipo de Vehículo:"));
        panel.add(comboBoxTiposVehiculo);

        panel.add(new JLabel("Servicio a Realizar:"));
        panel.add(comboBoxServicios);

        panel.add(new JLabel());
        panel.add(botonRegistrar);

        this.add(panel);
    }

    public JComboBox<String> getComboBoxFuncionarios() {
        return comboBoxFuncionarios;
    }

    public JComboBox<String> getComboBoxTiposVehiculo() {
        return comboBoxTiposVehiculo;
    }

    public JComboBox<String> getComboBoxServicios() {
        return comboBoxServicios;
    }

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}