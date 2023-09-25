public class FloatVector2Stream implements Stream<Vector2>
{
    FloatStream floatStream;
    public FloatVector2Stream(FloatStream floatStream) 
    {
        this.floatStream = floatStream;
    }
    @Override
    public void read(StreamReader<Vector2> reader)
    {
        floatStream.read(x ->
            floatStream.read(y ->
                reader.read(c -> c.consume(x, y))));
    }    
}
