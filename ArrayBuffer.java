import java.util.ArrayList;

public class ArrayBuffer<T> implements Buffer<T>
{
    ArrayList<T> arrayList;
    public ArrayBuffer(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    @Override
    public void GiveElementAt(int index, Consumer<T> consumer) {
        consumer.consume(arrayList.get(index));
    }
    
}
