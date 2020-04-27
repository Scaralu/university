package Program;

import java.awt.*;
import java.util.Scanner;

class Level1Exception extends Exception { }
class Level2Exception extends Level1Exception { }
class Level3Exception extends Level2Exception { }

class Test {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int A, b, c, d, f, g, x;
        for (int i = 0; i < 5 ; i++) {
            A = b = c = d = f = g = 0;
            System.out.println("input");
            x = sc.nextInt();
            try {
                try {
                    switch (x) {
                        case 0:
                            throw new Level1Exception();
                        case 1:
                            throw new Level2Exception();
                        case 2:
                            throw new Level3Exception();
                        case 3:
                            throw new Exception();
                    }
                    A++;
                } catch (Level2Exception e) {
                    b++;
                } finally {
                    c++;
                }
            } catch (Level1Exception e) {
                d++;
            } catch (Exception e) {
                f++;
            } finally {
                g++;
            }

            System.out.println(A + "," + b + "," + c + "," + d + "," + f + "," + g);
            System.out.println();
        }
        sc.close();
    }
}