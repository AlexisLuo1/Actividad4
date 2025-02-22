/*Actividad #4

Actividad: Tomando como base la Actividad #3, elaborar una aplicación de consola que permita almacenar información sobre un visitante 
a un edificio de departamentos utilizando todos los tipos de datos primitivos en Java. Diseña un programa que lea por teclado todas 
las visitas que realice dicha persona durante una semana y que al final calcule la cantidad total de visitas, el tiempo promedio de 
estadía de todas las visitas, y si la persona es mayor o menor de edad. Ya no se admiten valores constantes.*/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int totalVisitas = 0;
        float totalHorasEstadia = 0;
        byte edadVisitante = 0;


        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edadVisitante = sc.nextByte();


        boolean esMayorEdad = edadVisitante >= 18;

        System.out.print("Ingrese su número de teléfono: ");
        long telefono = sc.nextLong();

        System.out.print("Ingrese su altura en metros: ");
        float altura = sc.nextFloat();

        System.out.print("Ingrese su temperatura corporal en grados Celsius: ");
        double temperatura = sc.nextDouble();

        System.out.print("¿Es residente del edificio? (true o false): ");
        boolean esResidente = sc.nextBoolean();

        sc.nextLine();

        System.out.print("Ingrese la inicial de su género (M/F/O): ");
        char genero = sc.next().charAt(0);


        System.out.print("¿Cuántas visitas hizo esta persona durante la semana? ");
        byte numVisitas = sc.nextByte();


        for (int i = 1; i <= numVisitas; i++) {
            sc.nextLine();

            System.out.println("\nVisita #" + i);


            System.out.print("Ingrese la duración de la estadía en horas: ");
            float horasEstadia = sc.nextFloat();


            totalVisitas++;
            totalHorasEstadia += horasEstadia;
        }


        float promedioEstadia = totalVisitas > 0 ? totalHorasEstadia / totalVisitas : 0;


        System.out.println("\n=== Información del Visitante ===");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edadVisitante + " años");
        System.out.println("Número de teléfono: " + telefono);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Temperatura corporal: " + temperatura + " °C");
        System.out.println("Residente del edificio: " + (esResidente ? "Sí" : "No"));
        System.out.println("Género: " + genero);

        System.out.println("\n=== Información Resumida ===");
        System.out.println("Total de visitas realizadas: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + promedioEstadia + " horas");
        System.out.println("El visitante es " + (esMayorEdad ? "mayor" : "menor") + " de edad.");

        sc.close();
    }
}
