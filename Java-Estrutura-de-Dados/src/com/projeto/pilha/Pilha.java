package com.projeto.pilha;


public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){ // empilhar
        No refAuxiliar = refNoEntradaPilha; //guardo a minha referencia de topo na variavel aux
        refNoEntradaPilha = novoNo; // pego minha referencia de topo e vou apontar para um novo nó
        refNoEntradaPilha.setRefNo(refAuxiliar); //e essa a referencia de proximo nó, é minha antiga referencia de topo
    }
    public No top(){
        return refNoEntradaPilha;
    }
    public No pop(){ //remove o ultimo elemento que entrou na pilha
        if (!this.isEmpty()) { // primeiro verificar se a pilha não está vazia
            No noPoped = refNoEntradaPilha; //guardo o nó que estou retirando
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //digo que a nova referencia de entrada é o nó está imeditamente abaixo dele
            return noPoped; //dou return no noPoped
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "\n-------------\n";
        stringRetorno+= "    Pilha\n";
        stringRetorno+= "-------------\n";

        No noAuxiliar = refNoEntradaPilha;
        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }

        }
        stringRetorno += "=============\n";
        return stringRetorno;

    }
}
