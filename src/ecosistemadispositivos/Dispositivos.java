package ecosistemadispositivos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeronimo
 */
public class Dispositivos {

    public static ArrayList<Dispositivos> dispositivos = new ArrayList<>();
//public static ArrayList<Computadora> dispositiv = new ArrayList<>();

    private String correo;
    private String nombre;
    private boolean estado;
    private boolean visible;

    public Dispositivos() {
    }

    public Dispositivos(String correo, String nombre, boolean estado, boolean visible) {
        this.correo = correo;
        this.nombre = nombre;
        this.estado = estado;
        this.visible = visible;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isVisible() {

        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void agregardispositivo() {

    }

    public Dispositivos busquedaOb(String dato) {
        return null;

    }

    public void administarDis() {
    }
    public String listas (String dato) {
        return null;
    }

    public String mostrarDatos() {
        String estado1 = "Activo";

        if (this.estado == true) {
            estado1 = "Inactivo";
        }
        String visible1 = "Si";
        if (this.visible == true) {
            visible1 = "No";
        }
        return "correo: " + getCorreo() + " - Nombre: " + getNombre() + " - Estado: " + estado1 + " - Visible para otros dispositivos: " + visible1;
    }

    public String mostrarEstado() {
        
        return null;
    }

    public String mostrarVisible() {
        
        return null;
    }
public void recoreList(){
    
}
    

}
