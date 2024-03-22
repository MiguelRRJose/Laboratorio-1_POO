import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opciones;
        float resultado, num1, num2;
        while (true){

            System.out.println("Bienvenido al menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.printf("%nSeleccione una opcion: ");

            opciones = scanner.nextInt();
            if (opciones == 5){
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.println("Ingrese el primer numero: ");
            num1 = scanner.nextFloat();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scanner.nextFloat();

            switch (opciones) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("La suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("La resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("La multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("La división es: " + resultado);
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }


        }


    }
}