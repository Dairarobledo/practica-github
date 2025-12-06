import java.util.Scanner;

public class SaludGuerrero {
 public static void main(String[] args) {
        int salud = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("golpes recibidos: ");
        int golpes= sc.nextInt();
        System.out.println("Pociones bebidas: ");
        int pociones= sc.nextInt();

        salud = salud - (golpes * 12) + (pociones * 18);
        System.out.println("la salud final del guerrero es: " + salud);
        sc.close();
    }
}
