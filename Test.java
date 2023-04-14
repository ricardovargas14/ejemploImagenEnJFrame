import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class Test {
    private JFrame ventana;
    private JButton botón;

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

        ventana.setVisible(true);
    }
    public void eventos(ActionEvent e) {
        Persona persona = new Persona();
        ventana.add(persona, BorderLayout.CENTER);
        ventana.pack();
    }
}
