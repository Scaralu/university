package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

class Questao2 {
    public static void main(String[] args) {

        boolean error = true;
        Scanner sc = new Scanner(System.in);
        while (error == true){
            try{

                System.out.println("Eu sei dividir");
                System.out.print("Informe o primeiro valor: ");
                int x = sc.nextInt();

                System.out.print("Informe o segundo valor: ");
                int y = sc.nextInt();

                double r = (double)x/y;
                error = false;
                System.out.println("O resultado da soma e " + r);
            } catch (Exception e){
                System.out.println("Coloque apenas números");
                sc.next();
            }
        }
        sc.close();
    }
}