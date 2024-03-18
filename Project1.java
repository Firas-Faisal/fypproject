package com.mycompany.project1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Project1 {

    public static void main(String[] args) 
    { 
        double quantity;
        double total= 0.0;
        double pricesfood = 0;
        double pricesdrink = 0;
        double price = 0;
        
        String tmbh ="y";
        
        ArrayList<Double> Quantity = new ArrayList<>();
        ArrayList<String> Cart = new ArrayList<>();
        ArrayList<Double> Prices = new ArrayList<>();
        ArrayList<Double> Total = new ArrayList<>();
        
        String[] drink= {"Teh Panas\t\t","Kopi Panas\t\t","Milo Panas\t\t","Jus Apple Panas\t","Jus Tembikai Panas\t","Jus Oren Panas\t","Teh Ais\t\t","Kopi Ais\t\t","Milo Ais\t\t","Jus Apple Ais\t","Jus Tembikai Ais\t","Jus Oren Ais\t"};
        double[] hargadrink= {2.0,3.0,4.0,5.0,5.0,5.0,2.5,3.5,4.5,5.0,5.0,5.0};
        String[] food= {"Mee Goreng\t\t","Behoon Goreng\t","Nasi Goreng\t\t","Mee Kari\t\t","Nasi Lemak\t\t"};
        double[] hargafood= {5.0,3.0,8.0,8.0,2.0};
        
        System.out.println("Welcome to Gerai Pak Samad");
        System.out.println("\nMenu Minuman\n");
        
         for(int m=0;m<12;m++)
           
            {
                System.out.println((m+1)+". "+drink[m] + "RM "+hargadrink[m]+"0");       
            }
      
        System.out.println("\nMenu Makanan\n");
        
        for(int m=0;m<5;m++)
        {
            System.out.println((m+1)+". "+food[m] + "RM "+hargafood[m]+"0");
        }
       
        Scanner input = new Scanner(System.in);
        System.out.print("\nNo Meja : ");
        int nomeja = input.nextInt();
        
        do{
            System.out.print("\norder minuman :   ");
            int omin = input.nextInt();
            System.out.print("quantity :  ");
            quantity = input.nextInt();
            omin = omin-1;
                switch (omin)
                {
                    case 0,1,2,3,4,5,6,7,8,9,10,11 -> 
                        {
                            Cart.add(drink[omin]);
                            Quantity.add(quantity);
                            Prices.add(hargadrink[omin]);
                            Total.add(quantity * hargadrink[omin]);
                            price = quantity * hargadrink[omin];
                            total += price;
                        }
                }    
                
            System.out.print("tambah ? : y for yes\t");
            tmbh =input.nextLine();
            tmbh =input.nextLine();
                       
          }while ("y".equals(tmbh.toLowerCase()));
        
        do{
            System.out.print("\norder makanan :   ");
            int omak = input.nextInt();
            System.out.print("quantity :  ");
            quantity = input.nextInt();
            omak = omak-1;
                switch (omak)
                {
                    case 0,1,2,3,4 -> 
                        {
                            Cart.add(food[omak]);
                            Quantity.add(quantity);
                            Prices.add(hargafood[omak]);
                            Total.add(quantity * hargafood[omak]);
                            price = quantity * hargafood[omak];
                            total += price;
                        }
                }     
            System.out.print("tambah ? : y for yes\t");
            tmbh =input.nextLine();
            tmbh =input.nextLine();
                        
           }while ("y".equals(tmbh.toLowerCase()));
        
        System.out.println("\n\nBilling for table  "+nomeja);
        System.out.println("No type of food\t\tprice\t\tqty\ttotal");
                
        for (int m =0; m<Cart.size();m++)
        {
            System.out.println((m+1)+". "+Cart.get(m)+"RM "+Prices.get(m)+"0\t\t"+
                    Quantity.get(m)+"\t"+"RM "+Total.get(m)+"0");
        }
        
        
       System.out.println("\nJumlah yang perlu dibayar\t\t\tRM"+total+"0");
       
       System.out.print("\nProcess finished with exit code 0\t");
       int fin = input.nextInt();
    }
} 


