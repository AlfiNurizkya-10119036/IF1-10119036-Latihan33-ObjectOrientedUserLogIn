/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33.userlogin.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Program LogIn Berbasis Object Oriented
 */

import java.util.Scanner;
public class User {

 private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Latihan33UserLogInOO user = new Latihan33UserLogInOO();
        System.out.print("Masukkan Username = ");
        usName = scan.next();
        System.out.print("Masukkan Password = ");
        passWord = scan.next();
        user.PengecekanLogin(usName, passWord);
    }
}
