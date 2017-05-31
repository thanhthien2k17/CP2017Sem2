
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vtson
 */
public class Test {
    public static void main(String[] args) {
        String name;
        int choice=0;
        
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        System.out.println("Nhap thong tin sinh vien");
        System.out.println("Nhap so sinh vien:");        
        int n = sc.nextInt();
        Student st = new Student();
        
        for(int i = 0; i<n ; i++){
            System.out.println("Nhap ten: ");            
            sc = new Scanner(System.in);
            st.setName(sc.nextLine());
            System.out.println("Nhap tuoi: ");
            st.setAge(sc.nextInt());
            
            dao.create(st);
        }        
                
        while(choice!=7){
            do{
                System.out.println("CHUONG TRINH QUAN LY SINH VIEN."
                + "\n1-Them sinh vien moi."
                + "\n2-Hien thi danh sach sinh vien."
                + "\n3-Chinh sua tuoi sinh vien."
                + "\n4-Sap xep danh sach sinh vien theo ten."
                + "\n5-Tim kiem sinh vien theo ten."
                + "\n6-Xoa sinh vien."
                + "\n7-Thoat chuong trinh."); 
                System.out.println("Nhap lua chon tu 1 den 7:");
                choice = sc.nextInt();
            }while(1>choice && choice>7);
            
            switch (choice){
                case 1:
                    System.out.println("Nhap them sinh vien moi:");
                    Student stAdd= new Student();
                    System.out.println("name: ");
                    sc= new Scanner(System.in);
                    stAdd.setName(sc.nextLine());
                    System.out.println("age: ");
                    stAdd.setAge(sc.nextInt());
                    dao.addSt(stAdd);
                    break;
                case 2:
                    for(Student s: (dao.readAll())){
                        System.out.println(s.toString());
                    }
                    break;
                case 3:
                    System.out.println("Chinh sua tuoi sinh vien:");
                    Student stUp=new Student();
                    System.out.println("nhap ten:");
                    sc = new Scanner(System.in);
                    stUp.setName(sc.nextLine());
                    System.out.println("nhap tuoi moi:");
                    stUp.setAge(sc.nextInt());
                    dao.updateAgeByName(stUp);
                    for(Student s: (dao.readAll())){
                        System.out.println(s.toString());
                    }
                    break;
                case 4:
                    System.out.println("Sap xep danh sach sinh vien theo ten:");
                    dao.sortByName(dao.listSt, dao.count);
                    for(Student s: (dao.readAll())){
                        System.out.println(s.toString());
                    }
                    break;
                case 5:
                    System.out.println("Tim kiem sinh vien theo ten: ");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();
                    for(Student s: (dao.readByName(name))){
                        System.out.println(s.toString());
                    }
                    break;
                case 6:
                    System.out.println("Xoa sinh vien.");
                    System.out.println("Nhap ten sinh vien muon xoa:");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();
                    dao.deleteByName(name);
                    break;
                default:
                    break;
            }
        }
    }
}
