package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

//    int speed;
//    int direction;

    public Vehicle(String name) {
        this.name = name;
        // initialize speed and direction as 0.
        this.currentSpeed = 0;
        this.currentDirection = 0;
        // initialize speed and direction as 0.
//        speed = 0;
//        direction = 0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
//         Add direction to the currentDirection
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " +
                currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        //set the current speed and direction
        this.currentSpeed = speed;
        this.currentDirection = direction;

        System.out.println("move method called - The speed is changed to: " +
                currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

//        Stop the car by setting current speed to 0
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

//    GETTER's and SETTER's
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
