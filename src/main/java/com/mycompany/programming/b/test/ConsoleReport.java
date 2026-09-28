/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programming.b.test;


public class ConsoleReport{

            String[] cities = {"Cape Town","Port Elizabeth", "Pretoria"};
    int[][] sales = {{1000,2000,3000},
                         {2000,3000,4000},
                           {1500,1100,1200}};
    int[] cityTotals = new int[3];
    


    public void main(String[] args){
        ConsoleReport report = new ConsoleReport();
        report.consoleReport();
        report.salesReport();
        report.totalSales();
        report.mostSales();
    }
    
    public void consoleReport() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------");
         System.out.printf("%-18s %-s %-9s %-9s%n","", "PS5", "XBOX", "SWITCH");
         for (int i = 0; i < sales.length; i++){
              System.out.printf("%-9s%n", cities[i]);
              for(int x = 0; x < sales[i].length; x++){
             System.out.printf("%-10d", sales[i][x]);
              }
              System.out.println();
         }
        
    }
           
             //CONSOLE TOTALS
    public void salesReport(){
         System.out.print("\n--------------------------------");
        System.out.print("\nGAMING CONSOLE REPORT");
        System.out.print("\n--------------------------------");
       System.out.print("\nTotal sales: " + totalSales());
        System.out.print("\n--------------------------------");

    }
    
    public int totalSales(){
        int total = 0;
        for(int i = 0; i < sales.length; i++){
            for( int x = 0; x < sales[i].length; x++){
                total += sales[i][x]; 
            }
        }
        return total;
    }
    
    public void  mostSales(){

        // Start with the first city's total
        int maxSales = cityTotals[0];

        // Store the index of the city with the most accidents
        int maxCityIndex = 0;

        // Loop through all cities
        for (int i = 0; i < sales.length; i++) {

            if (cityTotals[i] > maxSales) {

                // Update the highest accident total
                maxSales = cityTotals[i];

                // Update the index of the city
                maxCityIndex = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxCityIndex]); //now we display the max cities in city index

    }
}
   

