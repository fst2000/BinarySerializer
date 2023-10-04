import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Program
{
    public static void main(String[] args)
    {
        File inputFile = new File("input.txt");
        //File outputFile = new File("output.txt");
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FileFloatStream fileStream = new FileFloatStream(inputFile);
        frame.setVisible(true);
        // JPanel panel = new PolygonPanel(new FloatVector2Stream(fileStream));
        // frame.add(panel);
    }   
}
