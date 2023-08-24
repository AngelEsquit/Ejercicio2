/*
Universidad del Valle de Guatemala
Angel Esteban Esquit Hernández - 23221
Ejercicio 1 - Eras Tour
*/

import java.util.Scanner;
import java.util.Random;

/**
 * Esta clase representa un programa para la reservación de habitaciones en un hotel.
 */

public class Hotel {
    
    public static void main(String[] args) {
        // Creación de instancias de objetos
        Huesped[] esperaEstandar = new Huesped[3]; //Se agregó para registrar la lista de espera de habitaciones estandar
        Huesped[] esperaDeluxe = new Huesped[3]; //Se agregó para registrar la lista de espera de habitaciones deluxe
        Huesped[] esperaSuite = new Huesped[3]; //Se agregó para registrar la lista de espera de habitaciones suite
        Habitacion[] estandar = new Habitacion[3];
        Habitacion[] deluxe = new Habitacion[3];
        Habitacion[] suite = new Habitacion[3];
        Empleado empleado1 = new Empleado();
        empleado1.setNombreEmpleado("Pepito");
        Huesped huesped1 = new Huesped();
        Habitacion habitacion1 = new Habitacion();
        Habitacion habitacion2 = new Habitacion();
        Habitacion habitacion3 = new Habitacion();
        Habitacion habitacion4 = new Habitacion();
        Habitacion habitacion5 = new Habitacion();
        Habitacion habitacion6 = new Habitacion();
        Habitacion habitacion7 = new Habitacion();
        Habitacion habitacion8 = new Habitacion();
        Habitacion habitacion9 = new Habitacion();
        Scanner scanner = new Scanner(System.in);
        int asignada;
        
        // Configuración de habitaciones
        habitacion1.setCapacidad(6);
        habitacion2.setCapacidad(6);
        habitacion3.setCapacidad(6);
        habitacion4.setCapacidad(6);
        habitacion5.setCapacidad(6);
        habitacion6.setCapacidad(6);
        habitacion7.setCapacidad(6);
        habitacion8.setCapacidad(6);
        habitacion9.setCapacidad(6);
        habitacion1.setNivelHabitacion(1);
        habitacion2.setNivelHabitacion(1);
        habitacion3.setNivelHabitacion(1);
        habitacion4.setNivelHabitacion(2);
        habitacion5.setNivelHabitacion(2);
        habitacion6.setNivelHabitacion(2);
        habitacion7.setNivelHabitacion(3);
        habitacion8.setNivelHabitacion(3);
        habitacion9.setNivelHabitacion(3);
        habitacion1.setNumHabitacion(101);
        habitacion2.setNumHabitacion(102);
        habitacion3.setNumHabitacion(103);
        habitacion4.setNumHabitacion(104);
        habitacion5.setNumHabitacion(105);
        habitacion6.setNumHabitacion(106);
        habitacion7.setNumHabitacion(107);
        habitacion8.setNumHabitacion(108);
        habitacion9.setNumHabitacion(109);
        habitacion1.setPrecioNoche(150);
        habitacion2.setPrecioNoche(150);
        habitacion3.setPrecioNoche(150);
        habitacion4.setPrecioNoche(300);
        habitacion5.setPrecioNoche(300);
        habitacion6.setPrecioNoche(300);
        habitacion7.setPrecioNoche(500);
        habitacion8.setPrecioNoche(500);
        habitacion9.setPrecioNoche(500);
        estandar[0] = habitacion1;
        estandar[1] = habitacion2;
        estandar[2] = habitacion3;
        deluxe[0] = habitacion4;
        deluxe[1] = habitacion5;
        deluxe[2] = habitacion6;
        suite[0] = habitacion7;
        suite[1] = habitacion8;
        suite[2] = habitacion9;

        while (true) {
            asignada = 0;
            System.out.println("");
            System.out.println("***************************************");
            System.out.println("              Grand Hotel");
            System.out.println("***************************************");
            System.out.println("Ingrese la opción que desee. \n 1: Empleado \n 2: Huesped \n 3: Salir");
            System.out.println("");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("");
                System.out.println("Ingrese la opción que desee. \n 1: Asignar huesped \n 2: Salir");
                System.out.println("");
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1) {
                    System.out.println("");
                    System.out.println("Ingrese la opción que desee. \n 1: Estandar \n 2: Deluxe \n 3: Suite \n 4: Salir");
                    System.out.println("");
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    if (opcion == 1) {
                        asignada = 0;
                        for (int i = 0; i < 3; i += 1) {
                            if (estandar[i].getAsignada() == true) {
                                continue;
                            }

                            else {
                                estandar[i].setAsignada(true);
                                asignada = 1;
                                System.out.println("\nReservó su habitación de manera exitosa");
                                break;
                            }
                        }
                    }

                    else if (opcion == 2) {

                    }

                    else if (opcion == 3) {

                    }

                    else {
                        break;
                    }
                }

                else if (opcion == 2) {
                    break;
                }

                else {
                    System.out.println("Ingrese una opción válida.");
                }
            }

            else if (opcion == 2) {
                System.out.println("");
                System.out.println("Ingrese la opción que desee. \n 1: Reservar habitación \n 2: Salir");
                System.out.println("");
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1) {
                    System.out.println("\nIngrese su nombre");
                    huesped1.setNombreHuesped(scanner.nextLine());
                    System.out.println("\nIngrese su email");
                    huesped1.setEmail(scanner.nextLine());
                    System.out.println("\nIngrese el número de personas para las que desea reservar la habitación");
                    huesped1.setNumPersonas(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("\nIngrese cuántas veces nos ha visitado anteriormente");
                    int nivel = scanner.nextInt();
                    scanner.nextLine();
                    asignada = 0;

                    if (nivel < 5) {
                        if (huesped1.getNumPersonas() <= 6) {
                            for (int i = 0; i < 3; i += 1) {
                                if (estandar[i].getAsignada() == true) {
                                    continue;
                                }

                                else {
                                    estandar[i].setAsignada(true);
                                    asignada = 1;
                                    System.out.println("\nReservó su habitación de manera exitosa");
                                    break;
                                }
                            }

                            if (asignada == 0) {
                                for (int i = 0; i < 3; i += 1) {
                                    if (esperaEstandar[i] != null) {
                                        continue;
                                    }

                                    else if (esperaEstandar[i] == null){
                                        esperaEstandar[i] = huesped1;
                                        asignada = 1;
                                        System.out.println("\nFue agregado a la lista de espera");
                                    }
                                }

                                if (asignada == 0) {
                                    System.out.println("No tenemos espacio disponible en la lista de espera");
                                }
                            }
                        }
                        
                        else {
                            System.out.println("Solo tenemos habitaciones para máximo 6 personas");;
                        }
                    }

                    else if (nivel >= 5 && nivel < 10) {
                        if (huesped1.getNumPersonas() <= 6) {
                            for (int i = 0; i < 3; i += 1) {
                                if (deluxe[i].getAsignada() == true) {
                                    continue;
                                }

                                else {
                                    deluxe[i].setAsignada(true);
                                    asignada = 1;
                                    System.out.println("\nReservó su habitación de manera exitosa");
                                    break;
                                }
                            }

                            if (asignada == 0) {
                                for (int i = 0; i < 3; i += 1) {
                                    if (esperaDeluxe[i] != null) {
                                        continue;
                                    }

                                    else if (esperaDeluxe[i] == null){
                                        esperaDeluxe[i] = huesped1;
                                        asignada = 1;
                                        System.out.println("\nFue agregado a la lista de espera");
                                    }
                                }

                                if (asignada == 0) {
                                    System.out.println("No tenemos espacio disponible en la lista de espera");
                                }
                            }
                        }
                        
                        else {
                            System.out.println("Solo tenemos habitaciones para máximo 6 personas");;
                        }
                    }

                    else if (nivel >= 10) {
                        if (huesped1.getNumPersonas() <= 6) {
                            for (int i = 0; i < 3; i += 1) {
                                if (suite[i].getAsignada() == true) {
                                    continue;
                                }

                                else {
                                    suite[i].setAsignada(true);
                                    asignada = 1;
                                    System.out.println("\nReservó su habitación de manera exitosa");
                                    break;
                                }
                            }

                            if (asignada == 0) {
                                for (int i = 0; i < 3; i += 1) {
                                    if (esperaSuite[i] != null) {
                                        continue;
                                    }

                                    else if (esperaSuite[i] == null){
                                        esperaSuite[i] = huesped1;
                                        asignada = 1;
                                        System.out.println("\nFue agregado a la lista de espera");
                                    }
                                }

                                if (asignada == 0) {
                                    System.out.println("No tenemos espacio disponible en la lista de espera");
                                }
                            }
                        }
                        
                        else {
                            System.out.println("Solo tenemos habitaciones para máximo 6 personas");;
                        }
                    }

                }

                else if (opcion == 2) {
                    break;
                }

                else {
                    System.out.println("Ingrese una opción válida.");
                }
            }

            else if (opcion == 3) {
                break;
            }

            else {
                System.out.println("Ingrese una opción válida.");
            }
        }
    }
}
