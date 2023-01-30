/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ArrayMain {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
    
        int k = sc.nextInt();
        int[] arr = new int[k];
        
        for(int i=0;i<k;i++){
        System.out.println("Enter arr["+i+"]:");
        arr[i]=sc.nextInt();
        }
        
        System.out.println("Array:"+Arrays.toString(arr));
        for(int i=0;i<k;i++){
        if(i%2 == 0){
            arr[i]= arr[i]*2;
        }
        else{
        arr[i]=arr[i]*3;
        }
        }
        System.out.println("Modified Array :"+Arrays.toString(arr));
    }
    
}
