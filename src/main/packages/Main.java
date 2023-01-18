package primernumber.packag;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        boolean istPrimer = false;

        System.out.println("welcome the primer number find program");
        System.out.println(" please enter a positive number: ");

        int number = scanner.nextInt();

        for(int i=2; i< (number/2)+1; i++){
            if(number%i==0){
                istPrimer=false;
                break;
            }else{
                istPrimer=true;
            }
        }
        if(istPrimer){
            System.out.println(number+" is Primer");
        }else{
            System.out.println(number+" is not Primer");
        }
    }
}
