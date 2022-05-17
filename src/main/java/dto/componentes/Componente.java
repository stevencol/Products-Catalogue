package dto.componentes;

import Herrramientas.GetCodes;
import java.util.*;

public class Componente {

    private String id;
    private String marca;
    private String nombre;
    private String descripcion;
    private String valor;
    private Date fehaIngreso;

    public Componente() {
    }

    ///Crear 
    public Componente(String marca, String nombre, String descripcion, String valor, Date fehaIngreso) {
        this.marca = marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fehaIngreso = fehaIngreso;
        this.id = GetCodes.getNewId("PROD");
    }

    //Listar
    public Componente(String id, String marca, String nombre, String descripcion, String valor, Date fehaIngreso) {
        this.id = id;
        this.marca = marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fehaIngreso = fehaIngreso;
    }

    //Eliminar/update/select
     public Componente(String id){
         this.id = id;
     }

    public String getId() {
        return id;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getFehaIngreso() {
        return fehaIngreso;
    }

    public void setFehaIngreso(Date fehaIngreso) {
        this.fehaIngreso = fehaIngreso;
    }

    @Override
    public String toString() {
        return "Componente{" + "id=" + id + ", marca=" + marca + ", nombre=" + nombre + ", descripcion=" + descripcion + ", valor=" + valor + ", fehaIngreso=" + fehaIngreso + '}';
    }
     
     
     
}
