package com.company;


import java.awt.*;

class World {

    void drawAmountFlowers(Graphics2D gr, int amountFlowers) {
        int middleRadius = 8;
        int petalRadius = 10;
        for (int i = 0; i < amountFlowers; i++) {
            int x = Random.interval(0, 800);
            int y = Random.interval(400 + middleRadius + petalRadius, 600);
            Flower flower = new Flower(x, y);
            flower.draw(gr);
        }
    }

    void drawBall(Graphics2D gr, int amountBalls){
        for (int i = 0; i < amountBalls; i++) {
            int x = Random.interval(600, 800);
            int y = Random.interval(100, 200);
            Balls ball = new Balls(x, y);
            ball.draw(gr);
        }
    }

    void drawAmountClouds(Graphics2D gr, int amountClouds) {
        for (int i = 0; i < amountClouds; i++) {
            int x = Random.interval(0, 600);
            int y = Random.interval(0, 200);
            Cloud cloud = new Cloud(x, y);
            cloud.draw(gr);
        }
    }

    void drawBirds(Graphics2D gr, int amountBirds) {
        for (int i = 0; i < amountBirds; i++) {
            int x = Random.interval(50, 800);
            int y = Random.interval(100, 200);
            Bird bird = new Bird(x, y);
            bird.draw(gr);
        }
    }

}
