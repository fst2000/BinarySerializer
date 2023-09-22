import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileByteStream implements ByteStream
{
    File file;
    FileReader fileReader;
    public FileByteStream(File file)
    {
        this.file = file;
        try
        {
            fileReader = new FileReader(file);
        }
        catch (Exception e){System.out.println(e);}
    }
    @Override
    public void read(ByteReader reader)
    {
        try
        {
            byte b = (byte)0;
            if((b = (byte)fileReader.read()) != -1)reader.read(b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
