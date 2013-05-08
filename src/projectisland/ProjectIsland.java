package projectisland;

import org.newdawn.slick.*;


public class ProjectIsland extends BasicGame
{
 
  public ProjectIsland()
  {
     super("Hello World");
  }
 
  @Override
  public void init(GameContainer gc) throws SlickException
  {
	  
  }
 
  @Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  projectisland.update.UpdateManager.Update();
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
	  projectisland.rendering.GraphicsManager.draw(g);
	  g.drawString("Hello World", 100, 100);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new ProjectIsland());
 
     app.setDisplayMode(800, 600, false);
     app.start();
  }
}