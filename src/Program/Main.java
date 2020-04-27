package Program;

import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

class Main {

    static void primeiro (int x) throws IllegalArgumentException{
        try{
            segundo(x);
            System.out.println("depois segundo");
        } catch (IOException e){
            System.out.println("TRATA segundo");
        }
        System.out.println("Saiu Segundo");
    }

    static void segundo (int x) throws IllegalArgumentException, IOException{
        try{
            switch(x) {
                case 0: throw new IllegalArgumentException();
                case 1: throw new IOException();
                case 2: throw new EOFException();

            }

            System.out.println("depois switch");
        } catch (EOFException e) {
            System.out.println("Trata terceiro");
        }
        System.out.println("Saiu terceiro");
    }

    public static void main(String[] args) {
        int x;
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            try{
                primeiro(x);
                System.out.println("Apos primeiro");
            } catch (IllegalArgumentException e){
                System.out.println("Trata primeiro");
            }
            System.out.println("Saiu primeiro");
            sc.close();
        }
    }

}