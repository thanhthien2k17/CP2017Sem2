
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
public class CountVowel {

    char ch = 't';
    int count = 0;

    void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap 1 ki tu , neu nhap tren 1 ki tu se tinh ki tu dau tien:");
        do {
            String s = nhap.nextLine();
            ch = s.charAt(0);
            switch (ch) {
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                case 'A':
                case 'O':
                case 'U':
                case 'E':
                case 'I':
                    count++;
                    break;
            }
        } while (!((ch < 'a' || ch > 'z') && (  ch <'A' || ch > 'Z')));
        System.out.println("So luong nguyen am da nhap la :" + count);
    }

    public static void main(String[] args) {
        CountVowel h = new CountVowel();
        h.input();
    }
}
