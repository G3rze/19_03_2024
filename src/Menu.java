package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    Calculator calculator = new Calculator();


    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Bienvenido a la calculadora UCA");
        System.out.println("Que acción desea realizar?");
        System.out.println("1- SUMA");
        System.out.println("2- RESTA");
        System.out.println("3- MULTIPLICACION");
        System.out.println("4- DIVISION");
        System.out.println("5- SALIR");

        int option = scanner.nextInt();

        double num1 = 0, num2 = 0;

        if (option != 5){
            System.out.println("Ingrese el primer numero");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo numero");
            num2 = scanner.nextDouble();
        }

        optionSelector(option, num1, num2);

    }

    public void optionSelector(int option, double num1, double num2){
        switch (option){
            case 1:
                System.out.println("El resultado de la suma es "+calculator.sum(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es "+calculator.minus(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es "+calculator.multiply(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la division es "+calculator.divide(num1, num2));
                break;
            case 5:
                System.out.println("Gracias por usar, feliz dia");
            default:
                System.out.println("ERROR: opcion invalida");
                break;
        }
        if(option != 5){
            showMenu();
        }
    }

}
