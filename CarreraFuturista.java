import java.util.Scanner;

public class CarreraFuturista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el año actual:");
        int añoActual= sc.nextInt();
        System.out.println("introduce el año que va a terminar la carrera:");
        int añoCarrera = sc.nextInt();
        int faltan = añoCarrera - añoActual;

        System.out.println("faltan " + faltan +" años para terminar la carrera");

        sc.close();

    }   
 }      

