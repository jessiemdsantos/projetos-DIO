package com.projeto.listaEncadeada;

public class ListaEncadeada <T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indíce " + index + " dessa lista. Essa lista só vai até o índice" +
                    ultimoIndice + ".");
        }
    }

    // método add() para adicionar um novo nó na lista
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for( int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    //método getNo() para retornar o nó
    private No<T> getNo(int index){

        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for( int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    // método get() para retornar o conteúdo
    public T get(int index){
        return getNo(index).getConteudo();
    }

    // método remove() retorna o conteúdo do nó removido
    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }



    //método size() para retornar o tamanho da lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }

            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    //método toString()


    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteúdo =" + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += null;
        return strRetorno;

    }
}


