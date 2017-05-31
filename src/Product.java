
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
public class Product {
    int pID,pQuanty,pPrice;
    String pName="" ;
    void CreateProduct(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("\nNhap Name san pham:");
        pName=nhap.nextLine();
        System.out.println("Nhap ID san pham:");
        pID=nhap.nextInt();
        System.out.println("Nhap Quanty san pham:");
        pQuanty=nhap.nextInt();
        System.out.println("Nhap Price san pham:");
        pPrice=nhap.nextInt();
    }
    void Display(){
        System.out.println("\nId:"+pID+ "\tName:"+pName+ "\tQuanty:"+pQuanty+ "\tPrice:"+pPrice+ "\tCost:"+(pQuanty*pPrice));
    }
    Boolean Check(int Quanty){
        return Quanty>pQuanty;
    }
    public static void main(String[] args) {
        Product sp1=new Product();
        System.out.println("Nhap sp1:");
        sp1.CreateProduct();
        Product sp2=new Product();
        System.out.println("Nhap sp2:");
        sp2.CreateProduct();
        sp1.Display();
        sp2.Display();
        int Quanty;
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap sl cua sp can tim:");
        Quanty=nhap.nextInt();
        System.out.println("San pham can tim la:");
        if(sp1.Check(Quanty))
            sp1.Display();
        else if(sp1.Check(Quanty))
            sp2.Display();
        else
            System.out.println("k co san pham nao co so luong <"+Quanty);
        
        
    }
}