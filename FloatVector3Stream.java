public class FloatVector3Stream implements InputStream<Vector3>
{
    FloatStream floatStream;
    public FloatVector3Stream(FloatStream floatStream) 
    {
        this.floatStream = floatStream;
    }
    @Override
    public void read(StreamReader<Vector3> reader)
    {
        floatStream.read(x ->
            floatStream.read(y ->
                floatStream.read(z ->
                    reader.read(new FloatVector3(x, y, z)))));
    }
}
