import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class QuickSortComplexity
{
static final int MAX = 10005;
static int[] a = new int[MAX];
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print(&quot;Enter Max array size: &quot;);
int n = input.nextInt();
Random random = new Random();
System.out.println(&quot;Enter the array elements: &quot;);
for (int i = 0; i &lt; n; i++)
a[i] = random.nextInt(1000); // generate random numbers – uniform

// distribution

System.out.println(&quot;Input Array:&quot;);
for (int i = 0; i &lt; n; i++)
System.out.print(a[i] + &quot; &quot;);
// set start time
long startTime = System.nanoTime();
QuickSortAlgorithm(0, n - 1);
long stopTime = System.nanoTime();
long elapsedTime = stopTime - startTime;
System.out.println(&quot;\nSorted Array:&quot;);
for (int i = 0; i &lt; n; i++)
System.out.print(a[i] + &quot; &quot;);
System.out.println();
System.out.println(&quot;Time Complexity in ms for n=&quot; + n + &quot; is: &quot; + (double)

elapsedTime / 1000000);
}
public static void QuickSortAlgorithm(int p, int r)
{
int i, j, temp, pivot;
if (p &lt; r)
{
i = p;

j = r + 1;
pivot = a[p]; // mark first element as pivot
while (true)
{
i++;
while (a[i] &lt; pivot &amp;&amp; i &lt; r)
i++;
j--;
while (a[j] &gt; pivot)
j--;
if (i &lt; j)
{
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
else
break; // partition is over

}
a[p] = a[j];
a[j] = pivot;
QuickSortAlgorithm(p, j - 1);
QuickSortAlgorithm(j + 1, r);
}
}
}
