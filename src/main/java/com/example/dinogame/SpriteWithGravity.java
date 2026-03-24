package com.example.dinogame;

import javafx.scene.image.Image;

public class SpriteWithGravity extends Sprite{
    final int GRAVITY = 9, JUMP_FORCE = 7;

    public SpriteWithGravity(int x, int y, int width, int height, int vx, int vy, Image img) {
        super(x, y, width, height, vx, vy, img);
    }

    public void jump(){
        if(this.y <= 510) {
            vy = JUMP_FORCE;
        }
    }
}


