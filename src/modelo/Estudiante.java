package modelo;

import control.ListaEnlazada;

public class Estudiante {
    private String codigo;
    private String nombreCompleto;
    private String DNI;
    private ListaEnlazada<NotaObtenida> notaObtenida;


    //GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ListaEnlazada<NotaObtenida> getNotaObtenida() {
        return notaObtenida;
    }

    public void setNotaObtenida(ListaEnlazada<NotaObtenida> notaObtenida) {
        this.notaObtenida = notaObtenida;
    }
}
