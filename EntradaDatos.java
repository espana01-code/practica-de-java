import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar el salto de línea pendiente

        System.out.print("Dime tu altura (usa punto . como decimal): ");
        String alturaTexto = sc.nextLine();
        double altura = Double.parseDouble(alturaTexto);

        System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");

        sc.close();
    }
}
