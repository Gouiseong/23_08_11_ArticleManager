package com.KoreaIT.java.AM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("명령어");

        String cmd = scanner.next();


        System.out.printf("입력된 명령어 : %s\n",cmd);

        int num = scanner.nextInt();
        System.out.printf("입력된 정수 : %d\n",num);

        scanner.close();

        System.out.println("== 프로그램 종료 ==");
    }
}