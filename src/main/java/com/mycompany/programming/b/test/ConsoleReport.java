/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programming.b.test;


public class ConsoleReport{
//CITIES, SALES AND SALES TOTALS ARRAYS
            String[] cities = {"Cape Town","Port Elizabeth", "Pretoria"};
    int[][] sales = {{1000,2000,3000},
                         {2000,3000,4000},
                           {1500,1100,1200}};
    int[] cityTotals = new int[3];
    

//MAIN  CALL METHODS
    public static void main(String[] args){
        ConsoleReport report = new ConsoleReport();
        report.consoleReport();
        report.salesReport();
        report.mostSales();
    }
    
    //DISPLAY REPORT
    public void consoleReport() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------");
         System.out.printf("%-25s %-16s %-15s %-14s%n","", "PS5", "XBOX", "SWITCH");
         for (int i = 0; i < sales.length; i++){
                          System.out.printf("%-25s%-16d%-15d%-14d%n",cities[i], sales[i][0], sales[i][1],sales[i][2]);
            
         }
        
    }
           
             //CALCULATES TOTALS FOR ECAH CITY
    public void salesReport(){
         System.out.print("\n--------------------------------");
        System.out.print("\nGAMING CONSOLESALE REPORT");
        System.out.print("\n--------------------------------");
        System.out.print("\n");
       int total = 0;
        for(int i = 0; i < cities.length; i++){
            
            for( int x = 0; x < sales[i].length; x++){
                total = total + sales[i][x]; 
            }
                    System.out.println(cities[i] + "            " + total);
        }
        System.out.print("\n--------------------------------");

    }
    
    
    //DISPLAYS MOST SALES / MAXX
    public void  mostSales(){

        // Start with the first city's total
        int maxSales = cityTotals[0];

        // Store the index of the city with the most accidents
        int maxCityIndex = 0;

        // Loop through all cities
        for (int i = 0; i < cities.length; i++) {
                        //NOW WE CALCULATE THE TOTAL OF EACH CITY 

        cityTotals[i] = sales[i][0] + sales[i][1];


            if (cityTotals[i] > maxSales) {

                // Update the highest total
                maxSales = cityTotals[i];

                // Update the index of the city
                maxCityIndex = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxCityIndex]); //now we display the max cities in city index

    }
}
   

