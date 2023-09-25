import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FileFloatStream implements FloatStream, Closeable
{
    Scanner s;
    public FileFloatStream(File file)
    {
        try
        {
            s = new Scanner(new FileInputStream(file));
            s.useLocale(Locale.US);
        }
        catch (Throwable e){System.out.println(e);}
    }
    @Override
    public void read(FloatReader reader)
    {
        try
        {
            if(s.hasNextFloat()) reader.read(s.nextFloat());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    @Override
    public void close() throws IOException {
        s.close();
    }
    
}
