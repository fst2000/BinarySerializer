import java.io.File;
public class Program
{
    public static void main(String[] args)
    {
        File file = new File("testFile.txt");
        new FileByteStream(file).read(b -> System.out.println(b));
    }   
}
