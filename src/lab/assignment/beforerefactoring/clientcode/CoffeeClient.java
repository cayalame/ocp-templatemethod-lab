package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.Cappucino;
import lab.assignment.afterrefactoring.Americano;

public class CoffeeClient {


    public static void main(String[] args) {

        CoffeeMaker m = new Mocha();
        CoffeeMaker c = new Cappucino();
        CoffeeMaker a = new Americano();


        m.prepareCoffee();
        
        System.out.println("********************");

        c.prepareCoffee();

        System.out.println("********************");

        a.prepareCoffee();


    }

}
