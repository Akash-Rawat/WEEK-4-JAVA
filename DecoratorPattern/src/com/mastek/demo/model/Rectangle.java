package com.mastek.demo.model;

import com.mastek.demo.Shape;

//step2 :Create concrete classes implementing the same interface. 
//Rectangle.java and Circle.java are as follows
public class Rectangle implements Shape {
	@Override public void draw()
    {
        // /Print statement to execute when
        // draw() method of this class is called
        // later on in the main() method
        System.out.println("Shape: MyRectangle");
    }
}
