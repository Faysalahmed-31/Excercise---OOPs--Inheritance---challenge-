package com.perscholas.java_basics;

public class Cube {
    int length;
    int width;
    int height;

    public int getCubeVol(){
        return (length * width * height);
    }
    Cube(){
        //constructor is used to intialize value to the class
        // intialized value to the class
        length = 20;
        width  = 15;
        height  = 12;
    }
}
