package autolavado;
import javax.swing.SwingUtilities;
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroModel modelo = new RegistroModel();
            RegistroView vista = new RegistroView();
            new RegistroController(modelo, vista);
            vista.setVisible(true);
        });
    }
}