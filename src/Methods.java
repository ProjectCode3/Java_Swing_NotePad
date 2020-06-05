import javax.swing.*;
import javax.swing.colorchooser.ColorSelectionModel;
import java.awt.*;
import java.io.*;

public class Methods {
    public Board board = new Board(null, 0,0,"",false);

    private JFileChooser fc = new JFileChooser();
    private JColorChooser Cc = new JColorChooser();

    public void openFile(JTextArea text, JFrame frame){
        fc.showOpenDialog(frame);
        File file = fc.getSelectedFile();
        String fileName = file.getAbsolutePath();
        try{
            FileReader freader = new FileReader(fileName);
            BufferedReader breader = new BufferedReader(freader);
            text.read(breader, null);
            text.requestFocus();
        }catch(Exception e1){
            System.out.println("Exception: " + e1);
        }
    }

    public void newFile(JTextArea text){
        text.setText(null);
    }

    public void saveFile(JTextArea text){
        File newFile = fc.getSelectedFile();
        String fileName = newFile.getAbsolutePath();
        try{
            File new_File = new File(fileName);
            String path = new_File.getAbsolutePath();
            String str = text.getText();
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(str);
            bw.close();
        }catch (Exception e2){
            System.out.println("Exception: " + e2);
        }
    }

    public void saveAsFile(JTextArea text){
        int returnVal = fc.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            String pathName = file.getAbsolutePath();
            try{
                FileWriter fwriter = new FileWriter(pathName);
                BufferedWriter bwriter = new BufferedWriter(fwriter);
                bwriter.append(text.getText());
                bwriter.close();
            }catch(IOException e3){
                System.out.println("Exception: " + e3);
            }
        }
    }

    public void ExitProcess(int i){
        System.exit(i);
    }

    public void fontColor(JTextArea text){

        Cc.setBorder(BorderFactory.createTitledBorder("Choose Color"));
        Color color = JColorChooser.showDialog(null, "Choose A Color", Color.RED);
        text.setForeground(color);
    }

    public void fontStyle(JTextArea text){
        Font f4 = new Font(Font.SANS_SERIF, Font.BOLD, 20);
        text.setFont(f4);
    }

}
