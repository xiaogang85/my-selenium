package org.example;

import java.util.Scanner;

public class Test {
	
    public static void main(String[] args) {	 
    Scanner scan = new Scanner(System.in);
	 
	 String str2 = scan.nextLine();
	 String[] words= str2.split(" ");
	 
	 System.out.println("输入的数据为：" + words[0]);
	 System.out.println("输入的数据为：" + words[1]);
	 
	 scan.close();
	 }

}
