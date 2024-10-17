/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author RC_Student_lab
 */
public class Array {

    public static void main(String[] args) {
        //declaration
        double[] price={200,350,700,400};
       String[] item={"Shirt","Pants","Sneakers","Jacket"};
       
       //calculate sum of elements in price array
       int sum=0;
       for(int i=0;i<price.length;i++){
           sum+=price[i];
       }
       System.out.println("Sum of prices: "+ sum);
       
       //Calculate the average of of the elements in price array.
       double average=sum/price.length;
       System.out.println("Average price: "+ average);
       
       //get the maximum and minimum prices
       int maxPrice=(int) price[0];
       int minPrice=(int) price[0];
       
       for(int i=1;i<price.length;i++){
           if(price[i]>maxPrice){
               maxPrice=(int) price[i];
           }
           if(price[i]<minPrice){
               minPrice=(int) price[i];
           }
       }
       System.out.println("Maximum price: "+ maxPrice);
       System.out.println("Minimum price: "+ minPrice);
       
       //Get the item with the Highest price.
       int maxItem=0;
       for(int i=1;i<price.length;i++){
           if(price[i]>price[maxItem]){
               maxItem=i;
           }
       }
       System.out.println("Item with the highest price: "+ item[maxItem]);
       System.out.println("Price: " + price[maxItem]);
     
    }
}
