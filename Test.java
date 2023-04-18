import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class Test {
    private JFrame ventana;
    private JButton botón;
    private JPanel panel;

    public static void main(String[] args) {
        new Test();
    }
    
    public Test() {
        ventana = new JFrame("Prueba imagen");
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        botón = new JButton("Cargar imagen");
        botón.addActionListener(this::eventos);
        ventana.add(botón, BorderLayout.SOUTH);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setSize(500, 500);
        ventana.add(panel, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
    public void eventos(ActionEvent e) {
        Persona persona = new Persona(300, 500);
        panel.add(persona, BorderLayout.CENTER);
        ventana.pack();
    }
}
