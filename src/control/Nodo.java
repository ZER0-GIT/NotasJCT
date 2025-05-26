package control;

public class Nodo <P>{
    private P dato;
    private Nodo<P> siguienteNodo;

    public Nodo(P dato) {
        this.dato = dato;
        this.siguienteNodo = null;
    }

    public Nodo(P dato, Nodo puntero) {
        this.dato = dato;
        this.siguienteNodo = puntero;
    }

    public P getDato() {
        return dato;
    }

    public void setDato(P dato) {
        this.dato = dato;
    }

    public Nodo<P> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo<P> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
}
