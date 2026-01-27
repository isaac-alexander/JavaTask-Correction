// 8. Write a Java program to create a class called "TrafficLight" with attributes
// for color and duration, and methods to change the color and check for red or green.

import java.util.Objects;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void checkColor() {
        if (Objects.equals(this.color, "Red")) {
            System.out.println("Stop :" + this.color);
        } else {
            System.out.println("Go: " + this.color);
        }
    }
}