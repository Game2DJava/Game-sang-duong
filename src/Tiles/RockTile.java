package Tiles;


import ImageHelper.Assets;
import Tiles.Tile;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tinhdk
 */
public class RockTile extends Tile{
    
    public RockTile(int id) {
        super(Assets.dirt, id);
    }
//    @Override
//    public boolean isSolid(){
//        return true;
//    }
}
