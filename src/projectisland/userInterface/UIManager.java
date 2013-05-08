/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectisland.userInterface;

import org.newdawn.slick.Image;
import projectisland.Configuration;

/**
 *
 * @author Luke
 */
public class UIManager extends UIElement {
    private Image _backgroundImage = null;
    
    public UIManager()
    {
        super(0, 0, Configuration.WINDOW_SCREEN_WIDTH, Configuration.WINDOW_SCREEN_HEIGHT);
    }
}
