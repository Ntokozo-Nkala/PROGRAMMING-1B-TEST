/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming.b.test;
import java.util.Scanner;

public class QUESTION2 {
             Scanner scanner = new Scanner(System.in);
             //CITIES, SALES AND SALES TOTALS ARRAYS
    int[] totalSales = new int[3];
    String[] consoleType = new String[3];
    String[] store = new String[3];

    //INTERFACE
    public interface IConsole{
         String getConsoleType();
         String getStore();
         int getTotalSales();
         public void displayReport();
    }
    //
    public abstract class Console implements IConsole{
        private String consoleType;
        private String store;
        private int totalSales;
        
        public Console(String consoleType, String store, int totalSales){
            this.consoleType = consoleType;
            this.store = store;
            this.totalSales = totalSales;
        }
        public String getConsoleType(){
            return consoleType;
        }
        public int getTotalSales(){
            return totalSales;
        }
        public String getStore(){
            return store;
        }
        @Override
        public void displayReport(){
        System.out.println("***********************");
        System.out.println("\n Console Sales Report");
        System.out.println("");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
       System.out.println("STORE : " + getStore());
       System.out.println("TOTAL SALES: " + getTotalSales());
    
    
    }
    }
    
    
    public class ConsoleSales extends Console{
    public ConsoleSales(String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }
       
    
}
    public void main(String[] args){
            System.out.print("Enter console type:");
            System.out.println("\n1. PS5");
            System.out.println("2. XBOX");
            System.out.println("3. SWITCH");
             int choice = scanner.nextInt();
             scanner.nextLine();
             String chosenOption = "";
            switch(choice){
                case 1:
                chosenOption = "PS5";
                    break;
                case 2: 
                chosenOption = "XBOX";
                    break;
                case 3:
                chosenOption = "SWITCH";
                    break;
                    default:
                    System.out.println("Error: Invalid option. Please enter 1, 2, 3 or 4");
                     break;
            }
            System.out.print("ENTER STORE : ");
            String store = scanner.nextLine();
            System.out.print("ENTER TOTAL SALES: ");
                       int totalSales = scanner.nextInt();

                       System.out.println("CONSOLE TYPE: " + chosenOption);
                       System.out.println("STORE : " + store);
                       System.out.println("TOTAL SALES:" + totalSales);


    }        
}

