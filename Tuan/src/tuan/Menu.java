/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tuan;

import java.util.Scanner;

/**
 *
 * @author let73
 */
public class Menu {
    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }

        System.out.println("Choice 1 .." + options.length + ": ");

        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
