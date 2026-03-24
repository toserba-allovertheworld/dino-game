package com.example.dinogame;
import javafx.scene.image.Image;

import java.util.Objects;

public class Sprite{
    int x, y, width, height, vx, vy;
    Image img;

    public Sprite(int x, int y, int width, int height, int vx, int vy, Image img) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.vx = vx;
        this.vy = vy;
        this.img = img;
    }

    public void update(){
        if(Objects.equals(img.getUrl(), "/assets/rocks.png")){
            x += vx;
            y += vy;
        } else {

        }
    }

    public void render(){

    }
}
