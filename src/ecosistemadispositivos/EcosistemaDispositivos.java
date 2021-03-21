package ecosistemadispositivos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeronimo
 */
public class EcosistemaDispositivos {

    public static void main(String[] args) {

        Dispositivos comp = new Computadora();
        Dispositivos tab = new Tablet();
        Dispositivos smartW = new SmartWatch();
        Dispositivos smartP = new Smartphone();
        Dispositivos auri = new AuricularesInalambricos();
        Scanner a = new Scanner(System.in);
        int op, op1;
        String dato, dato1;

        do {
            System.out.println("--------------------------------------");
            System.out.println("   ---ECOSISTEMA DE DISPOSITIVOS---");
            System.out.println("--------------------------------------");
            System.out.println("1.Crear Dispositivo\n2.Administrar Dispositivo\n3.Acciones con dispositivos"
                    + "\n4.Acciones externas de dispositivos\n5.Cargas masivas\n6.Logs\n7.Salir");
            System.out.println();
            System.out.println("Seleccione la opcion a ejecutar: ");
            op = a.nextInt();
            a.nextLine();
            switch (op) {
                case 1:
                    do {
                        System.out.println("--------------------------------------");
                        System.out.println("       ---CREAR DISPOSITIVOS---");
                        System.out.println("--------------------------------------");
                        System.out.println("1.Computadora portatil\n2.Tablet\n3.SmartWatch"
                                + "\n4.Smartphone\n5.Auriculares inalámbricos \n6.Pagina Principal");
                        System.out.println();
                        System.out.println("Seleccione tipo de dispositivo a crear: ");
                        op = a.nextInt();
                        switch (op) {
                            case 1:
                                comp.agregardispositivo();
                                break;
                            case 2:
                                tab.agregardispositivo();
                                break;
                            case 3:
                                smartW.agregardispositivo();
                                break;
                            case 4:
                                smartP.agregardispositivo();
                                break;
                            case 5:
                                auri.agregardispositivo();
                                break;
                            case 6:
                                System.out.println("PAGINA PRINCIPAL");
                                System.out.println();
                                break;
                            default:
                                System.out.println("OPCION INCORRECTA");
                                System.out.println("INGRESE UNA OPCION DE LA LISTA");
                        }
                    } while (op != 6);
                    break;
                case 2:
                    do {
                        System.out.println("--------------------------------------");
                        System.out.println("   --- ADMINISTRAR DISPOSITIVOS ---");
                        System.out.println("--------------------------------------");
                        System.out.println("1.Computadora portatil\n2.Tablet\n3.SmartWatch"
                                + "\n4.Smartphone\n5.Auriculares inalámbricos \n6.Pagina Principal");
                        System.out.println();
                        System.out.println("Seleccione tipo de dispositivo a administrar: ");
                        op1 = a.nextInt();
                        a.nextLine();
                        switch (op1) {
                            case 1:
                                comp.administarDis();
                                break;
                            case 2:
                                tab.administarDis();
                                break;
                            case 3:
                                smartW.administarDis();
                                break;
                            case 4:
                                smartP.administarDis();
                                break;
                            case 5:
                                auri.administarDis();
                                break;
                            case 6:
                                System.out.println("PAGINA PRINCIPAL");
                                System.out.println();
                                break;
                            default:
                                System.out.println("OPCION INCORRECTA");
                                System.out.println("INGRESE UNA OPCION DE LA LISTA");
                        }
                    } while (op1 != 6);
                    break;
                case 3:
                    System.out.println("--- ACCIONES CON DISPOSITIVOS ---");
                    break;
                case 4:
                    System.out.println("--- ACCIONES EXTERNAS DE DISPOSITIVOS ---");
                    break;
                case 5:
                    System.out.println("--- CARGA MASIVA ---");
                    break;
                case 6:
                    System.out.println("--- LONG ---");
                    break;
                case 7:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");

            }

        } while (op != 7);
    }

}
