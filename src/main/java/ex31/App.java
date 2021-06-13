package ex31;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

public class App {
    public static int calulateHeartRate(int intensity, int restingHR, int age){
        double heartRate = (((220 - age) - restingHR) * (intensity / 100.0)) + restingHR;


        return (int) heartRate;

    }
    // concat
    public static  void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Resting Pulse: ");
        int restingHR = inputScanner.nextInt();
        System.out.print("Age: ");
        int age = inputScanner.nextInt();


        // println to tuser
        System.out.println("Intensity | Rate");
        System.out.println("_________ |_______");
        for(int intensity = 55; intensity <=95; intensity += 5){
            int heartRate = calulateHeartRate(intensity, restingHR, age);
            System.out.println(intensity +"%\t  | " +heartRate+ "bpm");

        }
        // must close 
        inputScanner.close();


    }
}
