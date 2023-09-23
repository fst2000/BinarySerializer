public class FloatVector3Stream implements Vector3Stream
{
    FloatStream floatStream;
    int i;
    float[] floats = new float[3];
    public FloatVector3Stream(FloatStream floatStream) 
    {
        this.floatStream = floatStream;
    }
    @Override
    public void read(Vector3StreamReader reader)
    {
        i = 0;
        floatStream.read(f ->
        {
            floats[i % 3] = f;
            if((i + 1) % 3 == 0 & i != 0) reader.read(new FloatVector3(floats[0], floats[1], floats[2]));
            i++;
        });
    }
    
}
