
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thien
 */
public class EvenSum {

    int num1, num2;

    void input() {
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.println("Nhap so thu 1:");
            num1 = nhap.nextInt();
            System.out.println("Nhap so thu 2:");
            num2 = nhap.nextInt();
            if(num1 < 5 || num2 < 5)
                System.out.println(" 2 so phai lon hon hoac =5");
        } while (num1 < 5 || num2 < 5);
    }

    void display() {
        System.out.println("tong 2 so la:" + (num1 + num2));
    }

    public static void main(String[] args) {
        EvenSum H1 = new EvenSum();
        H1.input();
        H1.display();
    }
}
