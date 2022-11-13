import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("----------------------MENU VEHICULOS Y SENSORES---------------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Opcion 0: Terminar programa");
            System.out.println("Opcion 1: Ingresar un nuevo vehículo");
            System.out.println("Opcion 2: Ver información de vehículos almacenados");
            System.out.println("Opcion 3: Ver cantidad de vehículos almacenados");
            System.out.println("Opcion 4: Ver información de los vehículos verdes");
            System.out.println("Opcion 5: Ver información de un vehiculo con id");
            System.out.println("Opcion 6: Ingresar un nuevo sensor");
            System.out.println("Opcion 7: Ver información de sensores almacenados");
            System.out.println("Opcion 8: Ver cantidad de sensores almacenados");
            System.out.println("Opcion 9: Ver vehiculo con mas sensores");
            System.out.println("Opcion 10 ");
            System.out.println("Opcion 666: Ver información de sensores temperatura por valor");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            switch (numero) {
                case 1:
                    if (Vehiculo.vehiculos.size() < 10) {
                        System.out.println("Ingrese modelo:");
                        int modelo = sc.nextInt();
                        System.out.println("Ingrese marca:");
                        String marca = sc.next();
                        System.out.println("Ingrese valor comercial");
                        double valorComercial = sc.nextDouble();
                        System.out.println("Ingrese color");
                        String color = sc.next();
                        Vehiculo v1 = new Vehiculo(modelo, marca, valorComercial, color);
                    } else {
                        System.out.println("Error, la base de datos está llena");
                    }
                    break;

                case 2:
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;

                case 3:
                    System.out.println(Vehiculo.cantidadVehiculos());
                    break;

                case 4:
                    System.out.println("La información de los vehículos verdes es:");
                    System.out.println(Vehiculo.toStringVerdes());
                    break;

                case 5:
                    System.out.println("Ingrese el id del vehiculo: ");
                    int id = sc.nextInt();
                    System.out.println(Vehiculo.infoId(id));
                    break;

                case 6:
                    int id2 = sc.nextInt();
                    if (Vehiculo.infoId(id2) != "Esta id no corresponde a ningun vehiculo") {
                        System.out.println("Ingresa el tipo de sensor");
                        String tipo = sc.next();
                        System.out.println("Ingresa valor de sensor");
                        double valor = sc.nextDouble();
                        Vehiculo.obtenerVehiculoPorld(tipo, valor);
                    } else {
                        System.out.println("Este vehiculo no existe");
                    }
                    break;

                case 7:
                    System.out.println("Ingresa el id de un vehiculo existente: ");
                    int id3 = sc.nextInt();
                    System.out.println(Vehiculo.infoSensores(id3));
                    break;

                case 8:
                    System.out.println();
                    break;

                case 9:
                    System.out.println("La información del vehículo con más sensores es: ");
                    System.out.println(Vehiculo.VerMaySensores());
                    break;

                case 10:
                    break;

                case 666:
                    System.out.println();
                    break;
            }
        }
    }
}