package HomeWork3;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //5. Написать программу, которая выводит реверсивную строку
            String str;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter a string: ");
            str=scan.nextLine();
            char[] ch=str.toCharArray();
            System.out.println("Reversed String is :");
            int b=ch.length;
            for(int i=b;i>0;i--)
            {
                System.out.print(ch[i-1]);
            }
        }
    }
