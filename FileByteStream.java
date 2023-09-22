import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileByteStream implements ByteStream
{
    File file;
    FileReader reader;
    public FileByteStream(File file)
    {
        this.file = file;
        try
        {
            reader = new FileReader(file);
        }
        catch (Exception e){System.out.println(e);}
    }
    @Override
    public void read(ByteReader reader)
    {
        read(reader.read());
    }
    
}
