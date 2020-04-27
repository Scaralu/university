package Program;

import Entities.Beer;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String cerealType = "malte";
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the name of your beer?");
        String beerName = sc.nextLine();
        Beer beer = new Beer(cerealType, beerName);

        beer.alcohol();
        System.out.println(beer.toString());
    }
}
