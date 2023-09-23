public class FloatVector3 implements Vector3
{
    float x, y, z;
    public FloatVector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public void accept(Vector3Consumer consumer)
    {
        consumer.consume(x, y, z);
    }
    
}
