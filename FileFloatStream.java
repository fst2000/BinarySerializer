import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileFloatStream implements FloatStream
{
    Scanner s;
    public FileFloatStream(File file)
    {
        try
        {
            s = new Scanner(new FileInputStream(file));
        }
        catch (Throwable e){System.out.println(e);}
    }
    @Override
    public void read(FloatReader reader)
    {
        try
        {
            while(s.hasNextFloat()) reader.read(s.nextFloat());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
