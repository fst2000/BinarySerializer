import java.io.File;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        new FloatVector3Stream(new FileFloatStream(inputFile)).read(v3 ->
            v3.accept((x, y, z) ->
                System.out.println(x + ", " + y + ", " + z)));
    }   
}
