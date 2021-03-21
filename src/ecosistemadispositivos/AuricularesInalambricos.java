package ecosistemadispositivos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeronimo
 */
public class AuricularesInalambricos extends Computadora {

    public static ArrayList<Dispositivos> auriculares = new ArrayList<>();
    private String nombre;
    private String conectado;
    private boolean estado;

    public AuricularesInalambricos() {
    }

    public AuricularesInalambricos(String nombre, String conectado, boolean estado) {
        this.nombre = nombre;
        this.conectado = conectado;
        this.estado = estado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getConectado() {
        return conectado;
    }

    public void setConectado(String conectado) {
        this.conectado = conectado;
    }

    @Override
    public void setNombre(String nomb) {
        this.nombre = nomb;
    }

    @Override
    public void agregardispositivo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("     --- AGREGAR AURICULARES ---");
        System.out.println("--------------------------------------");
        System.out.println("Dispositivos Activos");
        System.out.println();
        recoreList();
        System.out.println();
        System.out.println("Enlazar a: (Ingrese nombre) ");
        String dat = entrada.nextLine();
        setConectado(dat);
        System.out.println();
        System.out.println("Nombre del dispositivo");
        String nombre = entrada.nextLine();
        setNombre(nombre);
        Dispositivos auriculares1 = new AuricularesInalambricos(nombre, conectado, false);
        auriculares.add(auriculares1);
        System.out.println();
        for (int i = 0; i < auriculares.size(); i++) {
            System.out.println(auriculares.get(i).mostrarDatos());
        }
    }

    @Override
    public void administarDis() {
        Scanner a = new Scanner(System.in);
        int op;
        String dato, dato1;
        System.out.println("--------------------------------------");
        System.out.println("    --- AURICULARES CREADAS ---");
        System.out.println("--------------------------------------");
        for (int i = 0; i < AuricularesInalambricos.auriculares.size(); i++) {
            System.out.println("Nombre: " + AuricularesInalambricos.auriculares.get(i).getNombre() + "     " + AuricularesInalambricos.auriculares.get(i).mostrarEstado());
        }
        System.out.println();
        System.out.println("Ingrese nombre del dispositivo para administrar");
        dato = a.nextLine();
        System.out.println("--------------------------------------");
        System.out.println("     -- ADMINISTRAR AURICULARES --");
        System.out.println("--------------------------------------");
        System.out.println("dispositivo seleccionado: ");
        System.out.println(busquedaOb(dato).mostrarDatos());
        System.out.println("\n1.Editar Nombre" + "\n2.Eliminar Sincronización");
        if (busquedaOb(dato).isEstado() == false) {
            System.out.println("3.Apagar Dispositivo");
        } else {
            System.out.println("3.Encender Dispositivo");
        }
        op = a.nextInt();
        a.nextLine();
        switch (op) {
            case 1:
                System.out.println();
                System.out.println("Ingrese Nombre");
                dato1 = a.nextLine();
                busquedaOb(dato).setNombre(dato1);
                System.out.println("Se actualizao el nombre");
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("Eliminar sincronización");
                System.out.println("1.Si 2.No");
                op = a.nextInt();
                a.nextLine();
                if (op == 1) {
                    for (int i = 0; i < AuricularesInalambricos.auriculares.size(); i++) {
                    }
                }
                break;
            case 3:
                if (busquedaOb(dato).isEstado() == false) {
                    busquedaOb(dato).setEstado(true);
                    System.out.println("Dispositivo Apagado");
                }else{
                    busquedaOb(dato).setEstado(false);
                    System.out.println("Dispositivo Encendido");
                }

                
                break;
        }

    }

    @Override
    public Dispositivos busquedaOb(String dato) {
        Dispositivos busqueda = null;
        for (int i = 0; i < auriculares.size(); i++) {
            if (dato.equalsIgnoreCase(auriculares.get(i).getNombre())) {
                busqueda = auriculares.get(i);
            }
        }
        return busqueda;

    }

    @Override
    public void recoreList() {
        for (int a = 0; a < Computadora.computadora.size(); a++) {
            if (Computadora.computadora.get(a).isEstado() == false && Computadora.computadora.get(a).isVisible() == false) {
                System.out.println(Computadora.computadora.get(a).getNombre());
            }
        }
        for (int n = 0; n < Tablet.tablet.size(); n++) {
            if (Tablet.tablet.get(n).isEstado() == false && Tablet.tablet.get(n).isVisible() == false) {
                System.out.println("Tablet" + Tablet.tablet.get(n).getNombre());
            }
        }
        for (int n = 0; n < SmartWatch.smartWatch.size(); n++) {
            if (SmartWatch.smartWatch.get(n).isEstado() == false && SmartWatch.smartWatch.get(n).isVisible() == false) {
                System.out.println(SmartWatch.smartWatch.get(n).getNombre());
            }
        }
        for (int n = 0; n < Smartphone.smartphone.size(); n++) {
            if (Smartphone.smartphone.get(n).isEstado() == false && Smartphone.smartphone.get(n).isVisible() == false) {
                System.out.println(Smartphone.smartphone.get(n).getNombre());
            }
        }
    }

    @Override
    public String listas(String dato) {
        String an = "";
        for (int a = 0; a < Computadora.computadora.size(); a++) {
            if (Computadora.computadora.get(a).isEstado() == false && Computadora.computadora.get(a).isVisible() == false) {
                if (dato.equalsIgnoreCase(Computadora.computadora.get(a).getNombre())) {
                    an = Computadora.computadora.get(a).getNombre();
                }
            }
        }

        for (int n = 0; n < Tablet.tablet.size(); n++) {
            if (Tablet.tablet.get(n).isEstado() == false && Tablet.tablet.get(n).isVisible() == false) {
                if (dato.equalsIgnoreCase(Tablet.tablet.get(n).getNombre())) {
                    an = Tablet.tablet.get(n).getNombre();
                }
            }
        }
        for (int g = 0; g < SmartWatch.smartWatch.size(); g++) {
            if (SmartWatch.smartWatch.get(g).isEstado() == false && SmartWatch.smartWatch.get(g).isVisible() == false) {
                if (dato.equalsIgnoreCase(SmartWatch.smartWatch.get(g).getNombre())) {
                    an = SmartWatch.smartWatch.get(g).getNombre();
                }
            }
        }
        for (int e = 0; e < Smartphone.smartphone.size(); e++) {
            if (Smartphone.smartphone.get(e).isEstado() == false && Smartphone.smartphone.get(e).isVisible() == false) {
                if (dato.equalsIgnoreCase(Smartphone.smartphone.get(e).getNombre())) {
                    an = Smartphone.smartphone.get(e).getNombre();
                }
            }
        }
        return an;
    }

    @Override
    public String mostrarDatos() {
        String estado = "Encendido";
        if (this.estado == true) {
            estado = "Apagado";
        }
        return "Nombre del Auricular: " + nombre + " Enlazado a: " + conectado + " Estado: " + estado;
    }

    @Override
    public String mostrarEstado() {
        String es = "ENCENDIDO";
        if (isEstado() == true) {
            es = "APAGADO";
        }
        return es;
    }

}
