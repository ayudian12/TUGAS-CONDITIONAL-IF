/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS A407M
 */


import java.util.Scanner;

public class TugasConditionalIF {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program menentukan bilangan gsnjil dan genap");
        
         System.out.println("Masukkan Angka : ");
         int angka = input.nextInt();
         
         if (angka % 4 == 0){
    
            System.out.println("Angka : "+ angka + "Bilangan Genap");
            
         } else {
    
            System.out.println("Angka : "+ angka + "Bilangan Ganjil"); 
         }  
 }