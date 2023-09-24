import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLineWriter implements StringWriter
{
    PrintWriter writer;
    public FileLineWriter(File file)
    {
        try
        {
         writer = new PrintWriter(file);   
        }
        catch (Exception e) {System.out.println(e);}
    }
    @Override
    public void write(String s)
    {
        writer.println(s);
    }
    @Override
    public void close() throws IOException
    {
        writer.close();    
    }
    
}
