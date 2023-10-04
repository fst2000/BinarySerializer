public class BufferStream<T> implements InputStream<T>
{
    Buffer<T> buffer;
    int start;
    public BufferStream(Buffer<T> buffer, int start) {
        this.buffer = buffer;
    }
    @Override
    public void read(BufferStreamReader<T> reader)
    {
        reader.read(buffer, new BufferStream<T>(buffer, start));    
    }
    
}
