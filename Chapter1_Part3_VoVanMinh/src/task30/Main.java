/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class Main {

    public static void main(String[] args)throws IOException{
       
        BufferedReader  input = new BufferedReader(new InputStreamReader(System.in));
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("Input type circle/rectangle/square: ");
        String type = input.readLine();
        Shape shape = shapeFactory.getShape(type);
        if(shape == null)
        	System.out.println("not exist");
        else 
        	shape.draw();
    }
    
}
