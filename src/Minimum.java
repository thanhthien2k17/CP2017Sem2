
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
public class Minimum {
    int number,n,min;
    void input(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap so luong:");
        n=nhap.nextInt();
        System.out.println("nhap gia tri dau tien:");
        number=nhap.nextInt();
        min=number;
        for(int i=1;i<n;i++){
            System.out.println("gia tri thu "+(i+1)+":");
            number=nhap.nextInt();
            if(min>number){
                min=number;
            }
        }
        System.out.println("gia tri nho nhat la:"+min);
    }
    public static void main(String[] args) {
        Minimum h=new Minimum();
        h.input();
    }
}
