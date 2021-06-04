package E_22;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = new int[3];
        int greatest = 0;
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.printf("Please enter number %d: ",i+1);
            array[i] = reader.nextInt();
            if(i == 0){
                greatest = array[i];
            }else{
                for(int j = 0 ; j < i; j++){
                    if(array[j] == array[i]){
                        System.out.println("you cant enter the same numbers");
                        return;
                    }
                }

                if(array[i] > greatest){
                    greatest = array[i];
                }
            }
        }

        System.out.printf("You greatest number is %d", greatest);

    }
}
