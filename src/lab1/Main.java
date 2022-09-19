package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть рядок: ");
        Scanner a= new Scanner (System.in);
        String txt;
        txt=a.nextLine();
        StringCalculator ad=new StringCalculator();
        System.out.println("Сума: "+ad.add(txt));
    }
}