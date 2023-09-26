import java.util.ArrayList;
public class BufferedInputStream<T> implements InputStream<T>
{
    InputStream<T> inputStream;
    ArrayList<T> buffer;
    int index = 0;
    public BufferedInputStream(InputStream<T> inputStream)
    {
        this.inputStream = inputStream;
        buffer = new ArrayList<T>();
        inputStream.read(new StreamReader<T>()
        {
          public void read(T item)
          {
            buffer.add(item);
            inputStream.read(this);
          }  
        });
    }
    @Override
    public void read(StreamReader<T> reader)
    {
        if(index < buffer.size())
        {
            try
            {
                reader.read(buffer.get(index));
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            index++;
        }
        
    }
    
}