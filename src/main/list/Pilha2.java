package list;
public class Pilha2 implements Pilha{
    
    private ListaArray l;

    public Pilha2() {
        l = new ListaArray();

    }
    
    @Override
    public boolean isEmpty() {
        int[] array = l.getArray();
        if(array.length <= 0){
            return true;
        }
        return false;
        
    }

    @Override
    public void push(int item) {
        l.insereFim(item);
    }


    @Override
    public int pop() {
        int indicefim = l.getIndiceFim();
        int memoria = l.buscaIndice(indicefim);
        l.removeFim();
        return memoria;
    }
    
}
