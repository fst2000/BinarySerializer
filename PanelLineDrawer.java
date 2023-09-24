import java.awt.Graphics2D;
public class PanelLineDrawer implements LineDrawer
{
    Graphics2D g2d;
    public PanelLineDrawer(Graphics2D g2d)
    {
        this.g2d = g2d;
    }
    @Override
    public void Draw(Vector2 start, Vector2 end)
    {
        start.accept((x1, y1) ->
        {
            end.accept((x2, y2) ->
            {
                g2d.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
            });
        });
    }
    
}
