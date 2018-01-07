package first;

import javax.swing.*;
import java.util.Scanner;

public class firstMain {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        System.out.println("Wiek: "+wiek);
        switch(wiek){
            case 1:
                System.out.println("rok");
                break;
            default:
                System.out.println("brak danych");
        }

    }
}
