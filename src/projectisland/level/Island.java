/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectisland.level;

import projectisland.Configuration;

/**
 *
 * @author subzeros
 */
public class Island {
    private Tile[][] level = null;
    
    public Island()
    {
        level = generateLevel();
    }
    
    public static Tile[][] generateLevel()
    {
        //initial instantiation
        Tile[][] creator = new Tile[Configuration.TILE_SIZE][];
        for(int i = 0; i < Configuration.TILE_SIZE; i++) {
            creator[i] = new Tile[Configuration.TILE_SIZE];
        }
        
        //create island
        
        
        return creator;
    }
}
