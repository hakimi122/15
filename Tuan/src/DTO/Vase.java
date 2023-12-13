/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Scanner;

public class Vase extends Item {
    
    private int height;
    private String material;
    
    public Vase(){
        super();
        
    }
    
    public Vase(int value, String creator, int height, String material){
        super(value, creator);
        
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase(){
        super.output(); 
        
        System.out.println("height: " + this.height);
        System.out.println("material: " + this.material);
    }
    
    public void inputVase(){
    super.input();
    Scanner sc = new Scanner(System.in);
    
    try{
        System.out.println("Enter the height: ");
        this.height = sc.nextInt();
        if (height <= 0) {
            throw new IllegalArgumentException("Invalid height.");
        }
        
        sc.nextLine();
        
        System.out.println("Enter the materials: ");
        this.material = sc.nextLine();
        if (material.isEmpty()) {
            throw new IllegalArgumentException("Material cannot be empty.");
        }
        
        Vase vase = new Vase(value, creator, height, material);
    }catch (Exception e){
        System.out.println("Error: " + e.getMessage());
        
    }
        
    }
}

