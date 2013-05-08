package projectisland.rendering;

import java.util.LinkedList;

public class GraphicsManager
{
	private static LinkedList<DrawableGameComponent> children = new LinkedList<DrawableGameComponent> ();;
	
	public static void draw()
	{
		for(DrawableGameComponent c : children)
		{
			c.draw();
		}
	}
}
