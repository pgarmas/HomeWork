/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author Polina
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int сторона;
сторона=5;

Scanner in = new Scanner(System.in);
System.out.print("Введите длину: ");
сторона = in.nextInt();

int area=сторона*3;
System.out.println("обьём= "+area+" см3");


        // TODO code application logic here
    }
    
}
