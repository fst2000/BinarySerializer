import java.io.File;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        new FileFloatStream(inputFile).read(f -> System.out.println(f));
    }   
}
