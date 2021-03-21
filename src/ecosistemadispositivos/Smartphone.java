package ecosistemadispositivos;

//import static ecosistemadispositivos.Tablet.tablet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeronimo
 */
public class Smartphone extends Computadora {

    public static ArrayList<Dispositivos> smartphone = new ArrayList<>();
    private int numtel;

    public Smartphone(int numtel, String correo, String nombre, boolean estado, boolean visible) {
        super(correo, nombre, estado, visible);
        this.numtel = numtel;
    }

    public Smartphone() {
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    @Override
    public void agregardispositivo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("       --- AGREGAR SMARTPHONE ---");
        System.out.println("--------------------------------------");
        System.out.println("Ingrese Correo");
        String correo = entrada.nextLine();
        setCorreo(correo);
        System.out.println("Ingrese Nombre");
        String nombre = entrada.nextLine();
        setNombre(nombre);
        System.out.println("Ingrese numero");
        numtel = entrada.nextInt();
        System.out.println("Sera visible para otros dispositivos");
        System.out.println("1.Si 2.No");
        int op1 = entrada.nextInt();
        if (op1 == 1) {
            Dispositivos smartphone1 = new Smartphone(numtel, correo, nombre, false, false);
            smartphone.add(smartphone1);
        } else {
            Dispositivos smartphone1 = new Smartphone(numtel, correo, nombre, false, true);
            smartphone.add(smartphone1);
        }
    }
    
     @Override
    public void administarDis() {
        Scanner a = new Scanner(System.in);
        int op;
        String dato, dato1;
        System.out.println("--------------------------------------");
        System.out.println("    --- SMARTPHONE CREADAS ---");
        System.out.println("--------------------------------------");
        for (int i = 0; i < Smartphone.smartphone.size(); i++) {
            System.out.println("Nombre: " + Smartphone.smartphone.get(i).getNombre() + "     " + Smartphone.smartphone.get(i).mostrarEstado());
        }
        System.out.println();
        System.out.println("Ingrese nombre del dispositivo para administrar");
        dato = a.nextLine();
        System.out.println("--------------------------------------");
        System.out.println("      -- ADMINISTRAR TABLET --");
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
        for (int i = 0; i < smartphone.size(); i++) {
            if (dato.equals(smartphone.get(i).getNombre())) {
                busqueda = smartphone.get(i);
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
        return "SmartPhone / Numero: "+numtel+ " - correo: " + getCorreo() + " - Nombre: " + getNombre() + " - Estado: " + estado1 + " - Visible para otros dispositivos: " + visible1;
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
