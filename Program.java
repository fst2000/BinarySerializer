import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.colorchooser.DefaultColorSelectionModel;
public class Program
{
    public static void main(String[] args)
    {
        File inputFile = new File("input.txt");
        //File outputFile = new File("output.txt");
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        FileFloatStream fileStream = new FileFloatStream(inputFile);
        JPanel panel = new PolygonPanel(new FloatVector2Stream(fileStream));
        frame.add(panel);
    }   
}
