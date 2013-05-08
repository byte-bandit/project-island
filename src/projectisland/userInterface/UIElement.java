/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectisland.userInterface;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import projectisland.rendering.DrawableGameComponent;

/**
 *
 * @author Luke
 */
public class UIElement implements DrawableGameComponent {
    protected int posX = 0;
    protected int posY =0;
    protected int elementWidth = 0;
    protected int elementHeight = 0;
    private Color _backgroundColor = Color.black;
    private int _id = -1;
    
    
    public UIElement(int px, int py, int width, int height)
    {
        posX = px;
        posY = py;
        elementWidth = width;
        elementHeight = height;

    }
    

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
