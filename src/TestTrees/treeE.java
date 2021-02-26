package src.TestTrees;

import src.Structures.*;

public class treeE {
  //Nodos del árbol
  //Nodos terminales
  private Node I = new Node("I",true);
  private Node J = new Node("J",true);
  private Node G = new Node("G",true);
  private Node D = new Node("D",false);
  private Node B = new Node("B");


  //Relaciones de nodos
  private Node[][] HC = {{B,J}};

  //Segundo set de Nodos
  private Node H = new Node("H",HC);

  //Relaciones de nodos
  private Node[][] EC = {{G,H}};
  private Node[][] FC = {{H,I}};

  //Tercer set de Nodos
  private Node E = new Node("E",EC);
  private Node F = new Node("F",FC);

  //Relaciones de nodos
  private Node[][] CC = {{E},{F}};
  private Node[][] BC = {{D,E}};

  //Cuarto set de Nodos
  private Node C = new Node("C",CC);

  //Nodo padre
  private Node[][] AC = {{B},{C}};
  private Node A;
  //Inicializadores del arbol
  public treeE() {
    A = new Node("A",AC);
    B.setChildrens(BC);
  }

  public Node getRoot() {
    return A;
  }
}
