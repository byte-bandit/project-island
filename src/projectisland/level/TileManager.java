/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectisland.level;

/**
 *
 * @author subzeros
 */
public enum TileManager {
    GRASS(GrassTile.class);
    
    
    private Class<? extends Tile> tile;
    private TileManager(Class<? extends Tile> t) {
        tile = t;
    }
}
