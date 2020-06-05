import javax.swing.*;

public class Menus {

    private JMenuBar menubar;
    private JMenu menu;
    private JMenuItem item;

    public void draw(JFrame frame, JMenuBar menuBar){
        this.menubar = menuBar;
        frame.setJMenuBar(menubar);
    }

    public void drawMenu(JMenu menu, JMenuBar menubar){
        menubar.add(menu);

    }

    public void drawItem(JMenuItem item, JMenu menu){
        menu.add(item);
    }

}
