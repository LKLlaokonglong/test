package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        JDBC jdbc = new JDBC();
        String str = jdbc.getInfo();
        System.out.println(str);

        int username = in.nextInt(); int password = in.nextInt();
        Result result = jdbc.login(username,password);
        System.out.println(result.toString());
    }
}
