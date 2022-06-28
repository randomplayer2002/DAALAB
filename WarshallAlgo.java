package Daa;
import java.util.Scanner;

/** Class Warshall **/
public class Warshall
{
private int V;
private boolean[][] tc;
  
/** Function to make the transitiveclosure **/

public void getTC(int[][] graph)
{
this.V = graph.length;
tc = new boolean[V][V];
for (int i = 0; i < V; i++)
{
for (int j = 0; j< V; j++)
if (graph[i][j] != 0)
tc[i][j] = true;
// tc[i][i] = true;
}
for (int i = 0; i < V; i++)
{
for (int j = 0; j < V; j++)
{
if (tc[j][i])
for (int k = 0; k < V;k++)
if (tc[j][i] && tc[i][k])
tc[j][k] = true;
    }
  }

}
/** Funtion to display the trasitiveclosure **/
  
public void displayTC()
{
System.out.println("\nTransitive closure :\n");
//System.out.print(&quot; &quot;);
//for (int v = 0; v &lt; V; v++)
//System.out.print(&quot; &quot; + v );
System.out.println();
  
for (int v = 0; v < V; v++)
{
//System.out.print(v +" ");
for (int w = 0; w < V; w++)
{
  if (tc[v][w])
    System.out.print(" 1 ");
  else
    System.out.print(" 0 ");
}
  System.out.println();
  }
}
/** Main function **/
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("WarshallAlgorithm Test\n");

/** Make an object of Warshall class**/
Warshall w = new Warshall();
  
/** Accept number of vertices **/
System.out.println("Enter number ofvertices\n");
int V = scan.nextInt();
  
/** get graph **/
System.out.println("\nEntermatrix\n");
  
int[][] graph = new int[V][V];
for (int i = 0; i < V; i++)
for (int j = 0; j < V; j++)
graph[i][j] = scan.nextInt();
w.getTC(graph);
w.displayTC();
  }
}
