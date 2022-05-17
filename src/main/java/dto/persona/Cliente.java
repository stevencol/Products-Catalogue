package dto.persona;

import java.util.Date;
import static Herrramientas.GetCodes.*;
import java.io.File;

public class Cliente extends Persona {

    //crear
    public Cliente(String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, String documento, Date fechaNa, Date fechaRE, String contrasena, File foto) {
        super(nombre1, nombre2, apellido1, apellido2, telefono, correo, documento, fechaNa, fechaRE, contrasena, foto);
        this.id = getNewId("CL");
        this.rolId = "rol-8e4946ce-fd10-4737-8f2a-594d48cbc5cb";
    }

    public Cliente(String id) {
        super(id);
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public String getRolId() {
        return rolId;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNa() {
        return fechaNa;
    }

    public void setFechaNa(Date fechaNa) {
        this.fechaNa = fechaNa;
    }

    public Date getFechaRE() {
        return fechaRE;
    }

    public void setFechaRE(Date fechaRE) {
        this.fechaRE = fechaRE;
    }

}
