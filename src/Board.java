import javax.swing.*;

public class Board {

    private JFrame frame;
    private int selfWidth;
    private int selfHeight;
    private String selfTitle;
    private boolean isVisible;

    public Board(JFrame new_frame, int width, int height, String title, boolean visible){
        this.frame = new_frame;
        this.selfWidth = width;
        this.selfHeight = height;
        this.selfTitle = title;
        this.isVisible = visible;
    }

    public void draw(){
        frame.setSize(selfWidth, selfHeight);
        frame.setTitle(selfTitle);
        frame.setVisible(isVisible);
    }

}
