import javax.swing.*;
import java.awt.*;

public class Board {

    private JFrame frame;
    private int selfWidth;
    private int selfHeight;
    private String selfTitle;
    private boolean isVisible;

    private JPanel panel = new JPanel();
    public JLabel lblCaption = new JLabel("No Caption");

    public Board(JFrame new_frame, int width, int height, String title, boolean visible){
        this.frame = new_frame;
        this.selfWidth = width;
        this.selfHeight = height;
        this.selfTitle = title;
        this.isVisible = visible;
}

    public void draw(){
        /**
         * Draws board and sets visibility
         */
        frame.setSize(selfWidth, selfHeight);
        frame.setTitle(selfTitle);
        frame.setVisible(isVisible);
    }

    public void drawStatus(JFrame frame){
        /**
         * Draws status bar and sets location
         */
        panel.add(lblCaption);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
    }
}
