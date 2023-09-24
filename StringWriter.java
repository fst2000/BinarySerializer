import java.io.Closeable;

public interface StringWriter extends Closeable
{
    void write(String s);
}
