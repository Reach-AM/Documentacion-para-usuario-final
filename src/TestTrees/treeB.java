package src.TestTrees;

import src.Structures.*;

public class treeB {
  //Nodos del árbol
  //Nodos terminales
  private Node G = new Node("G",true);
  private Node O = new Node("O",true);
  private Node N = new Node("N",false);
  private Node M = new Node("M",true);
  private Node J = new Node("J",false);
  private Node I = new Node("I",false);
  private Node H = new Node("H",true);
  private Node D = new Node("D",false);

  //Relaciones de nodos
  private Node[][] LC = {{N},{O}};
  private Node[][] KC = {{M}};
  private Node[][] EC = {{H},{I}};

  //Segundo set de Nodos
  private Node L = new Node("L",LC);
  private Node K = new Node("K",KC);
  private Node E = new Node("E",EC);

  //Relaciones de nodos
  private Node[][] FC = {{J},{K,L}};
  private Node[][] BC = {{D},{E}};

  //Tercero set de Nodos
  private Node F = new Node("F",FC);
  private Node B = new Node("B",BC);

  //Relaciones de nodos
  private Node[][] CC = {{F,G}};

  //Cuarto set de Nodos
  private Node C = new Node("C",CC);

  //Nodo padre
  private Node[][] AC = {{B,C}};
  private Node A;
  //Inicializadores del arbol
  public treeB() {
    A = new Node("A",AC);
  }

  public Node getRoot() {
    return A;
  }
}
