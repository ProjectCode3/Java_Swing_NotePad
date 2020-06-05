import javax.swing.*;

public class Main {
    public static Menus menu = new Menus();
    public static TextArea text = new TextArea();

    public static JFrame frame = new JFrame();
    public static int WIDTH = 1280;
    public static int HEIGHT = 720;
    public static String TITLE = "Notepad";
    public static boolean drawForm = true;

    public static JMenuBar menubar = new JMenuBar();


    public static JMenu file = new JMenu("File");
    public static JMenuItem open = new JMenuItem("Open");

    public static void main(String[] args){
        Board board = new Board(frame, WIDTH, HEIGHT, TITLE, drawForm);
        board.draw();

        text.draw(frame);

        menu.draw(frame, menubar);
        menu.drawMenu(file, menubar);
        menu.drawItem(open, file);
    }
}
