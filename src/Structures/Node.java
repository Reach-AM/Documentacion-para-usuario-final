package src.Structures;

public class Node {
  //Serialización de los nodos
  private static long folio = -1L;

  //Valores del nodo
  private long id;
  private boolean solution;
  private Node[][] children = new Node[0][0];
  private Object value;
  private boolean assigned = false;

  //Constructor del Nodo
  public Node(Object value) {
      folio++;
      id = folio;
      this.value = value;
  }
  public Node(Object value, boolean solution) {
      folio++;
      id = folio;
      this.value = value;
      this.solution = solution;
      assigned = true;
  }
  public Node(Object value, Node[][] children) {
    folio++;
    id = folio;
    this.value = value;
    this.children = children;
  }

  //Ver ID del nodo
  public long getID() {
    return id;
  }

  //Ver si el nodo es parte de la solución
  public void setSolution(boolean solution) {
    this.solution = solution;
    assigned = true;
  }
  public boolean getSolution() {
    return solution;
  }
  public boolean checkSolution() {
    return !assigned;
  }

  //Ver los hijos del nodo
  public Node[][] getChildrens() {
    return children;
  }
  public Node getChildren(int i, int j) {
    return children[i][j];
  }
  public void setChildrens(Node[][] children) {
    this.children = children;
  }

  //Ver el valor real del nodo
  public Object getValue() {
    return value;
  }
}
