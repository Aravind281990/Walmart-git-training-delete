package com.aravind;

public class HelloWorld {
        public static void main (String [] args)
             {
               System.out.println("Hello");
               add(10,20);
               sub(20,10);
             }

        public static int add(int num1, int num2) {
              return num1 + num2;
        }

        public static int sub(int num1, int num2) {
              return num1 - num2;
        }

} 

