package rvt;

import java.util.Scanner;

public class FromParameterToOne {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ievadi skaitli: ");
int number = scanner.nextInt();
scanner.close();


printFromNumberToOne(number);
}

public static void printFromNumberToOne(int number) {
for (int i = number; i >= 1; i--) {
System.out.println(i);
}
}
}