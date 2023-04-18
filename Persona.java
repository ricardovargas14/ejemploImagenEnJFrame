import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Persona extends JLabel {
    
    public Persona() {
        super(new ImageIcon("monito.png"));
    }

    public Persona(int ancho, int alto) {
        Image imagen = new ImageIcon("monito.png").getImage();
        imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_FAST);
        setIcon(new ImageIcon(imagen));
    }
}
