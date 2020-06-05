import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static Menus menu = new Menus();
    public static TextArea text = new TextArea();
    public static Methods func = new Methods();

    public static JFrame frame = new JFrame();
    public static int WIDTH = 1280;
    public static int HEIGHT = 720;
    public static String TITLE = "Notepad";
    public static boolean drawForm = true;

    public static JMenuBar menubar = new JMenuBar();

    //File Menu And Items
    public static JMenu file = new JMenu("File");
    public static JMenuItem open = new JMenuItem("Open");
    public static JMenuItem new_file = new JMenuItem("New File");
    public static JMenuItem save = new JMenuItem("Save");
    public static JMenuItem saveAs = new JMenuItem("Save As");
    public static JMenuItem exit = new JMenuItem("Exit");

    //View Menu and Items
    public static JMenu view = new JMenu("View");
    public static JMenuItem time_date = new JMenuItem("Time/Date");

    //Window Menu and Item
    public static JMenu window = new JMenu("Window");
    public static JMenuItem fontStyle = new JMenuItem("Font Style");
    public static JMenuItem fontColor = new JMenuItem("Font Color");

    public static void main(String[] args){
        Board board = new Board(frame, WIDTH, HEIGHT, TITLE, drawForm);
        board.draw();

        text.draw(frame);
        board.drawStatus(frame);

        menu.draw(frame, menubar);
        menu.drawMenu(file, menubar);
        menu.drawItem(open, file);
        menu.drawItem(new_file, file);
        file.addSeparator();
        menu.drawItem(save, file);
        menu.drawItem(saveAs, file);
        file.addSeparator();
        menu.drawItem(exit, file);

        menu.drawMenu(view, menubar);
        menu.drawItem(time_date, view);

        menu.drawMenu(window, menubar);
        menu.drawItem(fontStyle, window);
        menu.drawItem(fontColor, window);

        open.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.openFile(text.text, frame);
                    }
                }
        );

        new_file.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.newFile(text.text);
                    }
                }
        );

        save.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.saveFile(text.text);
                    }
                }
        );

        saveAs.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.saveAsFile(text.text);
                    }
                }
        );

        exit.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.ExitProcess(0);
                    }
                }
        );


        time_date.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
                        Date date = new Date();
                        text.text.setText(dtf.format(date));
                    }
                }
        );

        fontColor.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.fontColor(text.text);
                    }
                }
        );

        fontStyle.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        func.fontStyle(text.text);
                    }
                }
        );

    }
}
