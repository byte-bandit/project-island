package projectisland.rendering;

import java.util.LinkedList;
import org.newdawn.slick.Graphics;

public class GraphicsManager
{
	private static LinkedList<DrawableGameComponent> children = new LinkedList<DrawableGameComponent> ();
	
	public static void draw(Graphics g)
	{
		for(DrawableGameComponent c : children)
		{
			c.draw(g);
		}
	}
}
