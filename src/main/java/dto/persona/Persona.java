package dto.persona;

import java.io.File;
import java.util.*;

public class Persona {

    protected String id;
    protected String rolId;
    protected String nombre1;
    protected String nombre2;
    protected String apellido1;
    protected String apellido2;
    protected String telefono;
    protected String correo;
    protected String documento;
    protected Date fechaNa;
    protected Date fechaRE;
    protected String contrasena;
    protected File foto;

    public Persona() {
    }

    //Constructo crear 

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, String documento, Date fechaNa, Date fechaRE, String contrasena, File foto) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
        this.documento = documento;
        this.fechaNa = fechaNa;
        this.fechaRE = fechaRE;
        this.contrasena = contrasena;
        this.foto = foto;
    }
   
    //listar 

    public Persona(String id, String rolId, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, String documento, Date fechaNa, Date fechaRE, String contrasena, File foto) {
        this.id = id;
        this.rolId = rolId;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
        this.documento = documento;
        this.fechaNa = fechaNa;
        this.fechaRE = fechaRE;
        this.contrasena = contrasena;
        this.foto = foto;
    }


    
    
    
    
    

    ///Construtor listar/editar/eliminar
    public Persona(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", rolId=" + rolId + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", telefono=" + telefono + ", correo=" + correo + ", documento=" + documento + ", fechaNa=" + fechaNa + ", fechaRE=" + fechaRE + '}';
    }
}
