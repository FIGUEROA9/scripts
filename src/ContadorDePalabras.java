import java.util.Scanner;

public class ContadorDePalabras{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();  // lee una línea completa

        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();  // lee un entero

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        scanner.close();
    }
}
