/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue(){
        super();
        
    }
    
    public Statue(int value, String creator, int weight, String colour){
        super(value, creator);
        
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void outputStatue(){
        super.output();
        
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
    
    public void inputStatue(){
        super.input();
        Scanner sc = new Scanner(System.in);
        
       try{
           System.out.println("Enter the weight: ");
           this.weight = sc.nextInt();
           if (weight <= 0) {
               throw new IllegalArgumentException("Weight is invalid.");
           }
           
           sc.nextLine();
           
           System.out.println("Enter the colour: ");
           this.colour = sc.nextLine();
           if (colour.isEmpty()) {
               throw new IllegalArgumentException("Colour cannot be empty."); 
           }
           Statue statue = new Statue(value, creator, weight, colour);
       }catch (Exception e){
           System.out.println("Error: " + e.getMessage());
       }
    }
}

