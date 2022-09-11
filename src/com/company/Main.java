package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i=0;i<testCase;i++){
            int subs = scan.nextInt();
            if (subs > 30){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
