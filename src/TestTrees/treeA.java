package src.TestTrees;

import src.Structures.*;

public class treeA {
  //Nodos del árbol
  //Nodos terminales
  private Node J = new Node("J",true);
  private Node I = new Node("I",true);
  private Node H = new Node("H",true);
  private Node E = new Node("E",false);
  private Node D = new Node("D",true);

  //Relaciones de nodos
  private Node[][] GC = {{I,J}};
  private Node[][] FC = {{H}};
  private Node[][] BC = {{D,E}};

  //Segundo set de Nodos
  private Node G = new Node("G",GC);
  private Node F = new Node("F",FC);
  private Node B = new Node("B",BC);

  //Relaciones de nodos
  private Node[][] CC = {{F,G}};

  //Tercero set de Nodos
  private Node C = new Node("C",CC);

  //Nodo padre
  private Node[][] AC = {{B},{C}};
  private Node A;
  //Inicializadores del arbol
  public treeA() {
    A = new Node("A",AC);
  }

  public Node getRoot() {
    return A;
  }
}
