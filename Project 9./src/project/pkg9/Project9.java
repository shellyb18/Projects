/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shelbaltz
 */
public class Project9 {

    
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner reader = new Scanner(System.in);
        double n = reader.nextInt();
        System.out.println("The square root is " + Math.sqrt(n));
        
        //project 10
        
        System.out.println("Enter a double: ");
        double x = reader.nextInt();
        double areaOfCircle;
        areaOfCircle = 2 * Math.PI * x;
        System.out.println("Area of circle with that radius is " + areaOfCircle);
        
        //project 11
        int[] intArray = new int[] {1, 5, 4, 3, 7};
        Arrays.toString(intArray);
        Arrays.stream(intArray).forEach(System.out::println);
        
        //project 12
        int[] numbers = new int[] {1, 5, 4, 3, 7};
        
        public class Project13 {

    //13
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[] {1,5,4,3,8,9,10,21,72,-12};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
        list.add(numbers[i]);        
        }
        int sum = 0;
        for(Integer i : list){
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is " + sum);
        
        
    }
    
}

    }
    
}
