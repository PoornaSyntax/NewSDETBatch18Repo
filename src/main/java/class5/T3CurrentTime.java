package class5;

/*
Write a program that will ask user to input inputs
the current time(use 24 hour format),
Based on the given time define:
if hour is between 1-11 -->Morning
if hour is between12-15 -->Afternoon
if hour is between 16-20 -->Evening
if hour is between 21-24 -->Night

 */
import java.util.Scanner;

public class T3CurrentTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the current time using24 hour format");
        int hourNumber = sc.nextInt();
        if(hourNumber>=1 && hourNumber<=11){
            System.out.println("Morning");
        }else if(hourNumber>=12 && hourNumber<=15){
            System.out.println("Afternoon");
        }else if(hourNumber>=16 && hourNumber<=20){
            System.out.println("Evening");
        }else if (hourNumber>=21 && hourNumber<=24){
            System.out.println("Night");
    }else{
        System.out.println("Invalid");
    }
        sc.close();
}}
