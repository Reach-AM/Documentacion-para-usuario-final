# **Código para resolver árboles And-Or**

Para correr el código utlice el comando:

```console
C:\Users\usuario\path\AndOr> java -jar AndOr.jar
```

o

```console
usuario:AndOr nombre$ java -jar AndOr.jar
```

En el menú hay 5 opciones de árboles con los que se demuestra el código, estos corresponden a los árboles de la siguiente manera:

### A
![Árboles de ejemplo](./img/a.png)

### B
![Árboles de ejemplo](./img/b.png)

### C
![Árboles de ejemplo](./img/c.png)

### D
![Árboles de ejemplo](./img/d.png)

### E
![Árboles de ejemplo](./img/e.png)

Los nombres de los nodos (e.g.: "A", "H", "G",...) son meramente simbólicos y sirven únicamente para mostrar de una manera gráfica el proceso que siguió el programa.

## Funcionamiento
El código imprime la secuencia en la que visita los nodos y al llegar a un nodo TRUE o FALSE, imprime su valor.


Al pedir al código que resuelva el árbol A muestra la siguiente salida:

```
A
B
D true

E false

C
F
H true

G
I true

J true
```

Al ver la estructura del árbol A, podemos seguir el proceso que siguió para resolverlo, de la siguiente manera:

![Árboles de ejemplo](./img/a.png)

1. Visitó el nodo **A**.
2. Visitó el nodo **B**.
3. Visitó el nodo **D** y es **true**, pero como es **AND**, tiene que revisar el nodo **E**
5. Visitó el nodo **E** y es **false**, por lo que toda la rama de **B** es **false**.
7. Visito el nodo **C**.
8. Visito el nodo **F**.
9. Visito el nodo **H** y es **true**, por lo que **F** es **true**, pero necesita revisar **G**.
11. Visito el nodo **G**.
12. Visito el nodo **I** y es **true**, pero necesita revisar **J**
14. Visito el nodo **J** y es **true**, por lo que **G** es **true**, **C** es **true** y por lo tanto **A** tiene solución.

Adicionalemnte, el código despues imprime los nodos que son parte de la solución.

```
A C F H G I J
```

## Estructura de los nodos
La estructura de los nodos cuenta con los siguientes atributos:

```java
private long id;
private boolean solution;
private Node[][] children = new Node[0][0];
private Object value;
private boolean assigned = false;
```

 * El id sirve unicamente para identificar cada nodo de manera única.
 * Solution es el valor true/false del nodo, mientras que assigned muestra si solution ya tiene valor.
 * Children tiene los nodos que son ramas del nodo en un array doble de tal forma que: [[A],[B]] los nodos A y B forman una relación OR; mientras que [[A,B]] froma una relación AND
 * Value es un Objeto, para poder guardar la información que sea en el Nodo
