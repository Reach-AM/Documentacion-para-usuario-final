package src;

import src.Structures.*;
import src.TestTrees.*;
import java.util.Scanner;

public class test {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    solver s;
    treeA a;

    boolean newTree = true;

    while(newTree) {
      System.out.println("Que arbol quiere resovler? (A, B, C, D o E)");
      char resp = input.next().charAt(0);
      System.out.println("Resolviendo el arbol " + resp + "...\n");
      switch(resp) {
        case 'A':
        case 'a':
          a = new treeA();
          s = new solver(a.getRoot());
          break;
        case 'B':
        case 'b':
          treeB b = new treeB();
          s = new solver(b.getRoot());
          break;
        case 'C':
        case 'c':
          treeC c = new treeC();
          s = new solver(c.getRoot());
          break;
        case 'D':
        case 'd':
          treeD d = new treeD();
          s = new solver(d.getRoot());
          break;
        case 'E':
        case 'e':
          treeE e = new treeE();
          s = new solver(e.getRoot());
          break;
        default:
          System.out.println("Letra incorrecta, se resolvera A\n");
          a = new treeA();
          s = new solver(a.getRoot());
      }

      System.out.println("\nTiene solucion? " + s.solve() + "\n");
      System.out.println("Nodos de la solucion:");
      s.printSolution();
      System.out.println("\n");

      System.out.println("Quiere resolver otro arbol? (Y,N)");
      char cont = input.next().charAt(0);

      if(cont != 'Y' && cont != 'y') {
        newTree = false;
      }
    }
  }
}
