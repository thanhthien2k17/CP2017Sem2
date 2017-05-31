
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
public class Numbercal {

    int number, choice, sum, countPositive = 0, negative, positive;

    void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen bat ki,nhap 0 de dung viec nhap:");
        do {
            number = nhap.nextInt();
            sum += number;
            if (number < 0) {
                negative += number;
            } else {
                positive += number;
                countPositive++;
            }
        } while (number != 0);
    }

    void menu() {
        int pMenu;
        System.out.println("nhap tu 1 den 4 de duoc :\n"
                + "+ 1: tổng số các số duong\n"
                + "+ 2: tổng các số âm\n"
                + "+ 3: tổng của tất cả các số\n"
                + "+ 4: đếm tất cả số dương");
        Scanner nhap = new Scanner(System.in);
        pMenu=nhap.nextInt();
        switch (pMenu) {
            case 1:
                System.out.println("tong cac so duong la:" + positive);
                break;
            case 2:
                System.out.println("tong cac so am la:" + negative);
                break;
            case 3:
                System.out.println("tong tat ca cac so la:" + sum);
                break;
            case 4:
                System.out.println("so luong cac so duong la:" + countPositive);
                break;
        }
    }

    public static void main(String[] args) {
        Numbercal h = new Numbercal();
        h.input();
        h.menu();
    }
}
