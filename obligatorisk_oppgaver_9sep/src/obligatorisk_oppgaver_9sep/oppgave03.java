package obligatorisk_oppgaver_9sep;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class oppgave03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Velg en n");
         double n = parseInt(input.nextLine());

        double temp = 1;
        while(n>0){
           temp *=n;
           n--;
        }
        System.out.println(temp);


    }

}