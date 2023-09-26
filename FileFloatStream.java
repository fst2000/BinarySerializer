import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FileFloatStream implements FloatStream
{
    File file;
    Scanner s;
    public FileFloatStream(File file)
    {
        this.file = file;
        try
        {
            String buffer = new String(new FileInputStream(file).readAllBytes());
            s = new Scanner(buffer);
            s.useLocale(Locale.US);
        }
        catch (Throwable e){System.out.println("FileFloattream()" + e);}
    }
    @Override
    public void read(FloatReader reader)
    {
        try
        {
            if(s.hasNext()) reader.read(s.nextFloat());
        }
        catch (Exception e)
        {
            System.out.println("FileFloatStream.read()" + e);
        }
    }
}
