import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FileFloatStream implements FloatStream
{
    Scanner s;
    boolean isEnded;
    File file;
    public FileFloatStream(File file)
    {
        this.file = file;
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
            if(isEnded)
            {
                s = new Scanner(file);
                isEnded = false;
            }
            if(s.hasNextFloat())
            {
                reader.read(s.nextFloat());
            }
            else
            {
                s.close();
                isEnded = true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
