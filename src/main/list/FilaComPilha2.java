package list;

public class FilaComPilha2 implements FilaComPilha{
    private Pilha2 pilha1;
    private Pilha2 pilha2;

    public FilaComPilha2(){
        this.pilha1 = new Pilha2();
        this.pilha2 = new Pilha2();
    }

    @Override
    public void enqueue(int item) {
        pilha1.push(item);
    }

    @Override
    public int dequeue() {
        if (pilha2.isEmpty()){
            while (pilha1.isEmpty() == false){
                int valor = pilha1.pop();
                pilha2.push(valor);
            }
        }
        return pilha2.pop();
    }

    @Override
    public boolean isEmpty() {
        if(pilha1.isEmpty() && pilha2.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        
    }
    
}
