import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileFloatStream implements InputStream<Float>
{
    Buffer<Float> buffer;
    public FileFloatStream(File file)
    {
        try
        {
            ArrayList<Float> floats = new ArrayList<>(); 
            Scanner s = new Scanner(new FileInputStream(file));
            s.useLocale(Locale.US);
            while(s.hasNextFloat()) floats.add(s.nextFloat());
            s.close();
            buffer = new ArrayBuffer<>(floats);
        }
        catch (Throwable e){System.out.println(e);}
    }
    @Override
    public void read(BufferStreamReader<Float> reader)
    {
        reader.read(buffer, new BufferStream<>(buffer, 0));
    }
}
