public interface Buffer<T>
{
    void GiveElementAt(int index, Consumer<T> consumer);    
}
