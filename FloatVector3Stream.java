public class FloatVector3Stream implements Vector3Stream
{
    FloatStream floatStream;
    public FloatVector3Stream(FloatStream floatStream) 
    {
        this.floatStream = floatStream;
    }
    @Override
    public void read(Vector3StreamReader reader)
    {
        floatStream.read(x ->
            floatStream.read(y ->
                floatStream.read(z ->
                    reader.rear(new FloatVector3(x, y, z)))));
    }
    
}
