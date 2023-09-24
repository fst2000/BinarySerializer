import java.io.File;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        StringWriter writer = new FileLineWriter(outputFile);
        Stream<Vector3> stream = new FloatVector3Stream(new FileFloatStream(inputFile));
        StreamReader<Vector3> reader = new StreamReader<>()
        {
            public void read(Vector3 v)
            {
                v.accept((x, y, z) ->
                writer.write(x + " " + y + " " + z));
                stream.read(this);
            }    
        };
        stream.read(reader);
        
        try {writer.close();}
        catch (Exception e) {System.out.println(e);}
    }   
}
