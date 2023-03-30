package com.projeto.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

      Set<Carro> hashsetCarros = new HashSet<>();

      hashsetCarros.add(new Carro("Ford"));
      hashsetCarros.add(new Carro("Chevrolet"));
      hashsetCarros.add(new Carro("Fiat"));
      hashsetCarros.add(new Carro("Peugeot"));
      hashsetCarros.add(new Carro("Zip"));
      hashsetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashsetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);
    }
}
