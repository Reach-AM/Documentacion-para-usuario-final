package src.Structures;

public class solver {
  // Valores del nodo
  private Node root;
  private boolean solved = false, result = false;

  // Constructor del Nodo
  public solver(Node root) {
    this.root = root;
  }

  // Esta funcion comeinza a revisar el árbol
  public boolean solve() {
    solved = true;
    result = findSolution(root);
    return result;
  }

  /* ------------------------------------------------ *
  *  FUNCION RECURSIVA QUE REVISA LOS NODOS DEL ARBOL *
  *  ------------------------------------------------ */
  private static boolean findSolution(Node n) {
    // Muestra que nodo se encuentra
    System.out.print("\n" + n.getValue() + " ");

    // Si tiene hijos y no ha sido evaluado con anterioridad lo evalua
    if (n.getChildrens().length > 0 && n.checkSolution()) {

      // for para los casos OR
      for (int i = 0; i < n.getChildrens().length; i++) {

        // Si esta rama es AND con otras
        if (n.getChildrens()[i].length > 1) {
          boolean and = true;

          // for para los casos AND
          for (int j = 0; j < n.getChildrens()[i].length; j++) {

            // Si alguno de los and no tiene solución dejo de evaluar y
            // regreso FALSE
            if(! findSolution(n.getChildren(i,j))) {
              and = false;
              break;
            }
          }

          // Si termina el for AND y llega a este punto, entonces todas
          // las ramas del AND fueron TRUE
          if(and) {
            n.setSolution(true);
            return true;
          }

        // Si la rama solo tiene un nodo descendeinte entonces revisa
        // si es FALSE
        }else if (findSolution(n.getChildren(i,0))) {
          n.setSolution(true);
          return true;
        }
      }

      // Si termina el for de OR y llega a este punto, entonces todas
      // las soluciones fueron FALSE
      n.setSolution(false);
      return false;

    // Si ya fue evaluado regresa el su valor
    } else {
      System.out.println(n.getSolution());
      return n.getSolution();
    }
  }


  // Esta función cambia el arbol y resetea los valores
  public void changeRoot(Node root) {
    this.root = root;
    solved = false;
    result = false;
  }

  public void printSolution() {
    if (solved) {
      showSolution(root);
    }else {
      System.out.println("Aun no ha sido resuelto");
    }
  }

  private static void showSolution(Node n) {
    if(n.getSolution()) {
      System.out.print(n.getValue() + " ");
      if (n.getChildrens().length > 0) {
        for (int i = 0; i < n.getChildrens().length; i++) {
          if(n.getChildrens()[i][0].getSolution()) {
            for (int j = 0; j < n.getChildrens()[i].length; j++) {
              showSolution(n.getChildrens()[i][j]);
            }
          }
        }
      }
    }
  }
}
