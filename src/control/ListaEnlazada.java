package control;

public class ListaEnlazada<P> {
    private Nodo<P> inicio, fin;

    public ListaEnlazada(){
        inicio = null;
        fin = null;
    }

    public void agregarInicio(P dato){
        inicio = new Nodo<>(dato,inicio);
        if(fin==null){
            fin=inicio;
        }
    }

    public void agregarFinal(P dato){
        if(estaVacio()){
            inicio=fin= new Nodo<>(dato);
        }else{
            fin.setSiguienteNodo(new Nodo<>(dato));
            fin = fin.getSiguienteNodo();
        }
    }

    public void mostrarElementos(){
        Nodo<P> elemento = inicio;
        System.out.println();
        while(elemento!=null){
            System.out.print(elemento.getDato()+"-->");
            elemento=elemento.getSiguienteNodo();
        }
        System.out.println();
    }

    public boolean estaVacio(){
        return (inicio==null);
    }
}
