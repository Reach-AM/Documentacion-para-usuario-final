package src.TestTrees;

import src.Structures.*;

public class treeD {
  //Nodos del árbol
  //Nodos terminales
  private Node G = new Node("G",true);
  private Node H = new Node("H",true);
  private Node F = new Node("F",true);
  private Node B = new Node("B");


  //Relaciones de nodos
  private Node[][] CC = {{B,F}};
  private Node[][] DC = {{G},{H}};

  //Segundo set de Nodos
  private Node C = new Node("C",CC);
  private Node D = new Node("D",DC);

  //Relaciones de nodos
  private Node[][] EC = {{H},{C}};

  //Tercer set de Nodos
  private Node E = new Node("E",EC);

  //Relaciones de nodos
  private Node[][] BC = {{D},{E}};

  //Nodo padre
  private Node[][] AC = {{B,C}};
  private Node A;
  //Inicializadores del arbol
  public treeD() {
    A = new Node("A",AC);
    B.setChildrens(BC);
  }

  public Node getRoot() {
    return A;
  }
}
