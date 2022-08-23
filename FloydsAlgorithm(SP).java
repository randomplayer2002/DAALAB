package Daa;
import java.util.Scanner;
public class Floyds
{
static int a[][];
static int n;
public static void main(String args[])
{
System.out.println("Enter the number of vertices\n");
Scanner scanner = new Scanner(System.in);
n = scanner.nextInt();
a = new int[n][n];
System.out.println("Enter the Cost Matrix (999 for infinity) \n");
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
a[i][j] = scanner.nextInt();
}
}
getPath();
PrintMatrix();
scanner.close();
}
public static void getPath()
{
for (int k = 0; k < n; k++)
{
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
if ((a[i][k] + a[k][j]) < a[i][j])
a[i][j] = a[i][k] + a[k][j];
}
}
public static void PrintMatrix()
{
System.out.println("The All Pair Shortest Path Matrix is:\n");
for(int i=0; i<n; i++)
{
for(int j=0; j<n; j++)
System.out.print(a[i][j] +" ");
System.out.println();
}
}
}
