package Daa;
import java.util.Scanner;
public class Warshal {
static int a[][];
static int n;
public static void main(String args[])
{
System.out.println("Enter the number of vertices\n");
Scanner scanner = new Scanner(System.in);
n = scanner.nextInt();
a = new int[n][n];
System.out.println("Enter the Cost Matrix (0's and 1's) \n");
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
a[i][j] = scanner.nextInt();
}
}
getClosure();
PrintMatrix();
scanner.close();
}
public static void getClosure()
{
for (int k = 0; k < n; k++)
{
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
if(a[i][j]==1 || (a[i][k]==1 && a[k][j]==1))
a[i][j]=1;
}
}
public static void PrintMatrix()
{
System.out.println("Transitive Closure:\n");
for(int i=0; i<n; i++)
{
for(int j=0; j<n; j++)
System.out.print(a[i][j] +" ");
System.out.println();
}
}
}
