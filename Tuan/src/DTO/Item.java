/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item(){
    value = 0;
    creator = "";
    }
    
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter the value: ");
            this.value = sc.nextInt();
            if (value <= 0) {
                throw new IllegalArgumentException("Invalid value.");
            }
            
            sc.nextLine();
            
            System.out.println("Enter the creator: ");
            this.creator = sc.nextLine();
            if(creator.isEmpty()){
                throw new IllegalArgumentException("Creator cannot be empty");
            }
            
            Item item = new Item(value, creator);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public void output(){
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
    
}
