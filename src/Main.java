import java.util.Random;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        Scanner valor = new Scanner(System.in);
        do {
        System.out.println("Elige una opcion:  ");
        System.out.println("Opcion 1. Ejercicio teclado y aleatorio");
        System.out.println("Opcion 2. Dados");
        System.out.println("Opcion 3. Indice de masa corporal");
        System.out.println("Opcion 4. Conversor de unidades (Ejercicio Ind)");
        System.out.println("Opcion 5. Ejercicio en clase");
        System.out.println("Opcion 6. Salir");
        opcion = valor.nextInt();
        switch (opcion) {
            case 1:
                ejerciciot_a();
                break;
            case 2:
                dados();
                break;
            case 3:
                System.out.println(IMC());
            case 4:
                conversor();
                break;
            case 5:
                break;
            case 6:
                System.out.println("Gracias por usar");
                break;
            default:
                System.out.println("Opcion no valida, intenta de nuevo");
                break;
        }
        }while (opcion != 6);
    }

    public static String IMC() {

        double peso, estatura, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cual es tu peso en Kg:");
        peso = teclado.nextDouble();
        System.out.println("Cual es tu estatura en metros:");
        estatura = teclado.nextDouble();
        imc = peso / (Math.pow(estatura, 2));

        if (imc < 18.5) {
            System.out.println("Su situación es BAJO PESO ");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Su situación es PESO NORMAL ");
        }
        else if (imc >= 25.0 && imc <= 26.9) {
            System.out.println("Su situación es SOBREPESO GRADO 1 ");
        }
        else if (imc >= 27.0 && imc <= 29.9) {
            System.out.println("Su situación es SOBREPESO GRADO 2 ");
        }
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Su situación es OBESIDAD DE TIPO 1 ");
        }
        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Su situación es OBESIDAD DE TIPO 2 ");
        }
        else if (imc >= 40.0 && imc <= 49.9) {
            System.out.println("Su situación es OBESIDAD DE TIPO 3 MORBIDA ");
        }
        else if (imc >= 50) {
            System.out.println("Su situación es OBESIDAD DE TIPO 4 EXTREMA ");
        }
        return "Su Indice de masa corporal es: " + imc ;
    }

    public static void ejerciciot_a (){
        // Teclado
        Scanner teclado = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Digite el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Digite el segundo numero");
        n2 = teclado.nextInt();
        suma= n1 + n2;
        System.out.println("La suma es: " + suma);

        // Aleatorio
        Random aleatorio = new Random();
        int a, b, z;
        a = aleatorio.nextInt(51);
        System.out.println("Numero generado "+ a);
        b= aleatorio.nextInt((30-5)+1)+5;
        System.out.println("Segundo numero "+ b);

        z = a + b;
        System.out.println("La suma es: " +z);

    }

    public static void dados() {
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        Random aleatorio = new Random();
        for(int i = 1; i <= 20; ++i) {
            int dado1 = aleatorio.nextInt(6) + 1;
            System.out.println("Dado uno: " + dado1);
            int dado2 = aleatorio.nextInt(6) + 1;
            System.out.println("Dado dos: " + dado2);
            int dado3 = aleatorio.nextInt(6) + 1;
            System.out.println("Dado tres: " + dado3);
            suma1 += dado1;
            System.out.println("Resultado de la suma parcial del dado1: " + suma1);
            suma2 += dado2;
            System.out.println("Resultado de la suma parcial del dado2: " + suma2);
            suma3 += dado3;
            System.out.println("Resultado de la suma parcial del dado3: " + suma3);
        }
        System.out.println("----------RESULTADOS FINALES----------");
        System.out.println("Resultado suma de dado1: " + suma1);
        System.out.println("Resultado suma de dado2: " + suma2);
        System.out.println("Resultado suma de dado3: " + suma3);
        if (suma1 > suma2 && suma1 > suma3) {
            System.out.println("Dado 1 gana");
            if (suma2 > suma3){
                System.out.println("Dado 2 es el intermedio");
                System.out.println("Dado 3 es el mas bajo");
            }else {
                System.out.println("Dado 3 es el intermedio");
                System.out.println("Dado 2 es el mas bajo");
            }
        } else if (suma1 < suma2 && suma3 < suma2) {
            System.out.println("Dado 2 gana");
            if (suma1 > suma3){
                System.out.println("Dado 1 es el intermedio");
                System.out.println("Dado 3 es el mas bajo");
            }else {
                System.out.println("Dado 3 es el intermedio");
                System.out.println("Dado 1 es el mas bajo");
            }
        } else if (suma1 < suma3 && suma2 < suma3) {
            System.out.println("Dado 3 gana");
            if (suma1 > suma2){
                System.out.println("Dado 1 es el intermedio");
                System.out.println("Dado 2 es el mas bajo");
            }else {
                System.out.println("Dado 2 es el intermedio");
                System.out.println("Dado 1 es el mas bajo");
            }
        } else{
            System.out.println("la suma de dos o mas dados son iguales");
        }
        System.out.println("Fin");
    }

    public static void conversor(){
        int ind;
        double und, conver;
        Scanner valor = new Scanner(System.in);
        do {
            System.out.println("Elige una opcion de conversion:  ");
            System.out.println("Opcion 1. Metros a Yardas");
            System.out.println("Opcion 2. Yardas a Metros");
            System.out.println("Opcion 3. Metros a Pies");
            System.out.println("Opcion 4. Pies a metros");
            System.out.println("Opcion 5. Metros a Pulgadas");
            System.out.println("Opcion 6. Pulgadas a Metros");
            System.out.println("Opcion 7. Salir");
            ind = valor.nextInt();
            switch (ind) {
                case 1:
                    System.out.println("Ingresa los metros a convertir");
                    und = valor.nextInt();
                    conver = und * 1.093;
                    System.out.println("El resultado es: " + conver + " yardas");
                    System.out.println("---------FIN----------");
                    ind=7;
                    break;
                case 2:
                    System.out.println("Ingresa las yardas a convertir");
                    und = valor.nextInt();
                    conver = und / 1.093;
                    System.out.println("El resultado es: " + conver + " metros");
                    System.out.println("---------FIN----------");
                    ind=7;
                    break;
                case 3:
                    System.out.println("Ingresa los metros a convertir");
                    und = valor.nextInt();
                    conver = und * 3.28;
                    System.out.println("El resultado es: " + conver + " pies");
                    System.out.println("---------FIN----------");
                    ind=7;
                    break;
                case 4:
                    System.out.println("Ingresa los pies a convertir");
                    und = valor.nextInt();
                    conver = und / 3.28;
                    System.out.println("El resultado es: " + conver + " metros");
                    System.out.println("---------FIN----------");
                    ind=7;
                    break;
                case 5:
                    System.out.println("Ingresa los metros a convertir");
                    und = valor.nextInt();
                    conver = und * 39.37;
                    System.out.println("El resultado es: " + conver + " pulgadas");
                    System.out.println("---------FIN----------");
                    ind=7;
                    break;
                case 6:
                    System.out.println("Ingresa las pulgadas a convertir");
                    und = valor.nextInt();
                    conver = (double) (und / 39.37);
                    System.out.println("El resultado es: " + conver + " metros");
                    System.out.println("---------FIN----------");
                    ind=7;
                    break;
                case  7:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo");
                    break;
            }
        }while (ind != 7);
    }

}
