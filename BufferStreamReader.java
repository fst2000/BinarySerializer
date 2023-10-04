public interface BufferStreamReader<T>
{
    void read(Buffer<T> buffer, InputStream<T> stream);    
}
