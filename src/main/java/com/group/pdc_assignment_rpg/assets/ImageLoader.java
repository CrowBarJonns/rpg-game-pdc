/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.pdc_assignment_rpg.assets;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Vinson Beduya - 19089783 <vinsonemb.151994@gmail.com>
 */
public class ImageLoader {

    private static final String WALL_TILE_PATH = "./resources/images/cave_wall_tile.png";
    private static final String CHARACTER_PATH = "./resources/images/character.png";
    private static final String OPEN_TREASURE_PATH = "./resources/images/open_treasure.png";
    private static final String CLOSED_TREASURE_PATH = "./resources/images/closed_treasure.png";
    private static final String LOADING_BG_PATH = "./resources/images/loading_screen_bg.png";
    private static ImageLoader instance = null;
    private Image wallTile, character, openTreasure, closedTreasure, loadingBG;

    private ImageLoader() {
        setWallTile();
        setCharacter();
        setTreasure();
        setLoadingBG();
    }

    private void setWallTile() {
        ImageIcon icon = new ImageIcon(WALL_TILE_PATH);
        wallTile = icon.getImage();
    }

    private void setCharacter() {
        ImageIcon icon = new ImageIcon(CHARACTER_PATH);
        character = icon.getImage();
    }
    
    private void setTreasure() {
        ImageIcon open = new ImageIcon(OPEN_TREASURE_PATH);
        openTreasure = open.getImage();
        
        ImageIcon closed = new ImageIcon(CLOSED_TREASURE_PATH);
        closedTreasure = closed.getImage();
    }

    private void setLoadingBG() {
        ImageIcon bg = new ImageIcon(LOADING_BG_PATH);
        loadingBG = bg.getImage();
    }
    
    public Image getWallTile() {
        return wallTile;
    }

    public Image getCharacter() {
        return character;
    }

    public Image getOpenTreasure() {
        return openTreasure;
    }
    
    public Image getClosedTreasure() {
        return closedTreasure;
    }    
    
    public Image getLoadingBG() {
        return loadingBG;
    }
    
    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }

        return instance;
    }

}
