import javax.swing.*;
import java.awt.*;

public class TextArea {

    public JTextArea text = new JTextArea(10, 40);

    public void draw(JFrame frame){
        frame.getContentPane().add(text, BorderLayout.CENTER);
        text.setFont(text.getFont().deriveFont(18f));
    }
}
