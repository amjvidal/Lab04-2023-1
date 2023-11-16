package list;

import java.util.Arrays;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {
        array = new int[10];
        indice_fim = 0;
    }

    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < indice_fim; i++)
            if (array[i] == valor)
                return true;
        return false;
    }

    @Override
    public int buscaIndice(int valor) {
        if ((valor < 0) || (valor >= indice_fim)){
            return -1;
        }
        return array[valor];
    }

    @Override
    public int minimo() {
        int minimo = array[0];
        for (int i = 1; i < indice_fim; i++)
            if (array[i] < minimo)
                minimo = array[i];
        return minimo;
    }

    @Override
    public int maximo() {
        int maximo = array[0];
        for (int i = 1; i < indice_fim; i++)
            if (array[i] > maximo)
                maximo = array[i];
        return maximo;
    }

    @Override
    public int predecessor(int valor) {
        for (int i = 0; i < indice_fim; i++)
            if (array[i] == valor)
                return array[i-1];
        return -1;
    }

    @Override
    public int sucessor(int valor) {
        for (int i = 0; i < indice_fim; i++)
            if (array[i] == valor)
                return array[i+1];
        return -1;
    }

    @Override
    public void insereElemento(int valor) {
        array[indice_fim] = valor;
        indice_fim++;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
        for (int i = indice_fim; i > buscaIndice; i--) {
            array[i] = array[i - 1];
        }
        array[buscaIndice] = valor;
        indice_fim++;
       
        // A logica tá certa, não sei oq ta dando errado ;(
    }

    @Override
    public void insereInicio(int valor) {
        if ( indice_fim >= array.length - 1) {
            return;
        }

        for (int i = indice_fim; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = valor;
        indice_fim++;
    }

    @Override
    public void insereFim(int valor) {
        array[indice_fim] = valor;
        indice_fim++;
    }

    @Override
    public void remove(int valor) {
        for(int i = 0; i < indice_fim; i++){
            if (array[i] == valor){
                removeIndice(i);
            }
        }
    }

    @Override
    public void removeIndice(int indice) {
        for(int i = indice; i < indice_fim; i++){
            array[i] = array[i++];
            indice_fim--;
        }
    }

    @Override
    public void removeInicio() {
        for (int i = 0; i < indice_fim; i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public void removeFim() {
        if (indice_fim > 0){
            array[indice_fim - 1] = 0;
            indice_fim--;
        }
    }

    public int getIndiceFim(){
        return this.indice_fim;
    }

    public int[] getArray(){
        return this.array;
    }
}