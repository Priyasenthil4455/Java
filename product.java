import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        Scanner sc = new Scanner(System.in);
8
        int n = sc.nextInt();
9
        int a[] = new int[n];
10
        for(int i=0;i<n;i++)
11
        {
12
            a[i] = sc.nextInt();
13
        }
14
        int final1[] = new int[n];
15
        for(int i=0;i<n;i++)
16
        {
17
            final1[i] = 1;
18
        }
19
        int pre = 1;
20
        for(int i=0;i<n;i++)
21
        {
22
            final1[i] = pre;
23
            pre=pre*a[i];
24
        }
25
        int suf = 1;
26
        for(int i=n-1;i>=0;i--)
27
        {
28
            final1[i] = final1[i]*suf;
29
            suf = suf*a[i];
30
        }
31
        for(int i=0;i<n;i++)
32
        {
33
            System.out.print(final1[i]+" ");
34
        }
35
    }
36
}