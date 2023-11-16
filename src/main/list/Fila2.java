package list;
public class Fila2 implements Fila {

    private ListaArray f;

    public Fila2(){
        f = new ListaArray();
    }


    @Override
    public void enqueue(int item) {
        f.insereFim(item);
    }

    @Override
    public int dequeue() {
        int valor = f.buscaIndice(0);
        f.removeInicio();
        return valor;
    }

    @Override
    public boolean isEmpty() {
        int[] array = f.getArray();
        if(array.length <= 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int indicefim = f.getIndiceFim();
        int contador = 0;
        for (int i=0; i < indicefim; i++){
            contador++;
        }
        return contador;
    }
    
}
