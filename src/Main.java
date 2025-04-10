import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        List<Empleado>lstEmpleados = new ArrayList<>();
        lstEmpleados.add(new EmpleadoDePlanta());


        int opcion;
        int opcion1;
        do {
            System.out.println("--------- EMPRESA ---------");
            System.out.println("1)Registrar Empleado de Planta");
            System.out.println("2)Registrar Empleado por Horas");
            System.out.println("3)Mostrar Informacion");
            System.out.println("4)Salir");
            opcion = t.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese su Nombre: ");
                    String nombre = t.nextLine();
                    System.out.println("Ingrese su Edad: ");
                    String Edad = t.nextLine();
                    System.out.println("Ingrese su Salario: ");
                    double var6 = (double) t.nextInt();
                }case 2 -> {
                    System.out.println("Ingrese su Nombre: ");
                    String nombre = t.nextLine();
                    System.out.println("Ingrese su Edad: ");
                    String Edad = t.nextLine();
                    System.out.println("Ingrese pago por horas: ");
                    int PagoPorHoras = t.nextInt();
                    System.out.println("Ingrese horas trabajadas: ");
                    int HorasTrabajadas = t.nextInt();
                }case 3 -> {
                    System.out.println("1. Mostrar empleados planta");
                    System.out.println("2. Mostrar empleados hora");
                    System.out.println("3. Mostrar todos los empleados);");
                    opcion1 = t.nextInt();

                    for (Empleado e: lstEmpleados){
                        System.out.println(e);
                    }


                }case 4 -> {

                }default -> System.out.println("Ingrese una opcion correcta");
            }
        } while(opcion != 4);

    }
}