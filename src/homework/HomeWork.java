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
        
        int length;
length=5;
        int width;
width=3;
        int hight;
hight=2;



Scanner in = new Scanner(System.in);
System.out.print("Введите длину: ");
length = in.nextInt();

System.out.print("Введите ширину: ");
width = in.nextInt();

System.out.print("Введите высоту: ");
hight = in.nextInt();

int area=length*width*hight;
System.out.println("обьём= "+area+" см3");


        // TODO code application logic here
    }
    
}
