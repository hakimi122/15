/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting(){
        super();
    }
    
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed){
        super(value, creator);
        
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void outputPainting(){
        super.output();
        
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Is Watercolour: " + this.isWatercolour);
        System.out.println("Is Framed: " + this.isFramed);
    }
    
    public void inputPainting(){
        super.input();
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter the height: ");
            this.height = sc.nextInt();
            if (height <= 0) {
                throw new IllegalArgumentException("Height is invalid.");
            }
            
            sc.nextLine();
            
            System.out.println("Enter the width: ");
            this.width = sc.nextInt();
            if(width <= 0){
                throw new IllegalArgumentException("Width is invalid.");
            }
             System.out.print("Is it watercolour? (true/false): ");
            isWatercolour = sc.nextBoolean();
            sc.nextLine(); 

            System.out.print("Is it framed? (true/false): ");
            isFramed = sc.nextBoolean();
            sc.nextLine(); 
            
            Painting painting = new Painting(value, creator, height, width, isWatercolour, isFramed);
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
 }
