package src.TestTrees;

import src.Structures.*;

public class treeC {
  //Nodos del árbol
  //Nodos terminales
  private Node G = new Node("G",true);
  private Node F = new Node("F",true);
  private Node J = new Node("J",true);
  private Node I = new Node("I",true);
  private Node H = new Node("H",true);

  //Relaciones de nodos
  private Node[][] DC = {{H},{I}};
  private Node[][] CC = {{F,G}};

  //Segundo set de Nodos
  private Node D = new Node("D",DC);
  private Node C = new Node("C",CC);

  //Relaciones de nodos
  private Node[][] KC = {{C}};

  //Tercero set de Nodos
  private Node K = new Node("K",KC);

  //Relaciones de nodos
  private Node[][] EC = {{J,K}};

  //Cuarto set de Nodos
  private Node E = new Node("E",EC);

  //Relaciones de nodos
  private Node[][] BC = {{D,E}};

  //Quinto set de Nodos
  private Node B = new Node("B",BC);

  //Nodo padre
  private Node[][] AC = {{B},{C}};
  private Node A;
  //Inicializadores del arbol
  public treeC() {
    A = new Node("A",AC);
  }

  public Node getRoot() {
    return A;
  }
}
