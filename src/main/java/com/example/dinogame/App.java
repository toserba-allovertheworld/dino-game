package com.example.dinogame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;
import java.util.Objects;

public class App extends Application {
    final int CANVAS_WIDTH = 800;
    final int CANVAS_HEIGHT = 600;
    final int GROUND = 500;

    List<Rock> rock;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        StackPane root = new StackPane(canvas);

        for (int i = 0; i < 100; i++) {
            rock.add(new Rock(0,0,0,0,0,0, new Image(Objects.requireNonNull(getClass().getResourceAsStream("/assets/rocks.png")))));
        }

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.setFill(Color.rgb(20, 20, 35));
                gc.fillRect(0, 0, 800, 600); // Cancella tutto

                //gc.drawImage(img,24,24,24,24,0,0,100,100);
            }
        };
        timer.start();

        stage.setScene(new Scene(root, 800, 600));
        stage.setTitle("Immagini");
        stage.show();
    }

    static void main() {
        new App();
    }
}