/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan33.login;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang login pengguna kedalam suatu aplikasi
 *                      berbasis OO
 */
public class Latihan33Login {

   private String usName;
    private String passWord;

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        Latihan33Login user1 = new Latihan33Login();
        System.out.print("Masukkan Username = " );
        user1.usName = read.next();
        System.out.print("Masukkan Password = " );
         user1.passWord = read.next();
        
        User login = new User();
        login.pengecekanLogin(user1.usName, user1.passWord);
        System.out.println("");
    }
    
}
