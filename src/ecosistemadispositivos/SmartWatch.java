package ecosistemadispositivos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeronimo
 */
public class SmartWatch extends Dispositivos {

    public static ArrayList<Dispositivos> smartWatch = new ArrayList<>();

    public SmartWatch(String correo, String nombre, boolean estado, boolean visible) {
        super(correo, nombre, estado, visible);
    }

    public SmartWatch() {
    }

    @Override
    public void agregardispositivo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("     --- AGREGAR SMARTWATCH ---");
        System.out.println("--------------------------------------");
        System.out.println("Ingrese Correo");
        String correo = entrada.nextLine();
        setCorreo(correo);
        System.out.println("Ingrese Nombre");
        String nombre = entrada.nextLine();
        setNombre(nombre);
        System.out.println("Sera visible para otros dispositivos");
        System.out.println("1.Si 2.No");
        int op1 = entrada.nextInt();
        if (op1 == 1) {
            Dispositivos smartWatch1 = new SmartWatch(correo, nombre, false, false);
            smartWatch.add(smartWatch1);
        } else {
            Dispositivos smartWatch1 = new SmartWatch(correo, nombre, false, true);
            smartWatch.add(smartWatch1);
        }

    }

    @Override
    public void administarDis() {
        Scanner a = new Scanner(System.in);
        int op;
        String dato, dato1;
        System.out.println("--------------------------------------");
        System.out.println("     --- COMPUTADORAS CREADAS ---");
        System.out.println("--------------------------------------");
        for (int i = 0; i < SmartWatch.smartWatch.size(); i++) {
            System.out.println("Nombre: " + SmartWatch.smartWatch.get(i).getNombre() + "     " + SmartWatch.smartWatch.get(i).mostrarEstado());
        }
        System.out.println();
        System.out.println("Ingrese nombre del dispositivo para administrar");
        dato = a.nextLine();
        System.out.println("--------------------------------------");
        System.out.println("    -- ADMINISTRAR SMARTWATCH --");
        System.out.println("--------------------------------------");
        System.out.println("Nombre del dispositivo seleccionado: " + busquedaOb(dato).getNombre());
        System.out.println("\n1.Editar Correo" + "\n2.Editar Nombre");
        if (busquedaOb(dato).isVisible() == false) {
            System.out.println("3.Apagar visibilidad");
        } else {
            System.out.println("3.Encender Visibilidad");
        }
        if (busquedaOb(dato).isEstado() == false) {
            System.out.println("4.Apagar Dispositivo");
        } else {
            System.out.println("4.Encender Dispositivo");
        }
        op = a.nextInt();
        a.nextLine();
        switch (op) {
            case 1:
                System.out.println("Ingrese nuevo correo");
                dato1 = a.nextLine();
                busquedaOb(dato).setCorreo(dato1);
                System.out.println("Correo actualizado");
                break;
            case 2:
                System.out.println("Ingrese nuevo nombre");
                dato1 = a.nextLine();
                busquedaOb(dato).setNombre(dato1);
                System.out.println("Nombre Actualizado");
                break;
            case 3:
                if (busquedaOb(dato).isVisible() == false) {
                    busquedaOb(dato).setVisible(true);
                    System.out.println("Dispositivo no visible");
                } else {
                    busquedaOb(dato).setVisible(false);
                    System.out.println("Dispositivo visible");
                }
                break;
            case 4:
                if (busquedaOb(dato).isEstado() == false) {
                    busquedaOb(dato).setEstado(true);
                    System.out.println("Dispositivo apagado");
                } else {
                    busquedaOb(dato).setEstado(false);
                    System.out.println("Dispositivo encendido");
                }
                break;

        }
    }

    @Override
    public Dispositivos busquedaOb(String dato) {
        Dispositivos busqueda = null;
        for (int i = 0; i < smartWatch.size(); i++) {
            if (dato.equals(smartWatch.get(i).getNombre())) {
                busqueda = smartWatch.get(i);
            }
        }
        return busqueda;

    }

    @Override
    public String mostrarDatos() {
        String estado1 = "ENCENDIDO";

        if (isEstado() == true) {
            estado1 = "APAGADO";
        }
        String visible1 = "Si";
        if (isVisible() == true) {
            visible1 = "No";
        }
        return "SmartWatch / correo: " + getCorreo() + " - Nombre: " + getNombre() + " - Estado: " + estado1 + " - Visible para otros dispositivos: " + visible1;
    }

    @Override
    public String mostrarEstado() {
        String es = "ENCENDIDO";
        if (isEstado() == true) {
            es = "APAGADO";
        }
        return es;
    }

    @Override
    public String mostrarVisible() {
        String es = "ENCENDIDO";
        if (isVisible() == true) {
            es = "APAGADO";
        }
        return es;
    }

}
