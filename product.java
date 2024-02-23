import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int final1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            final1[i] = 1;
        }
        int pre = 1;
        for(int i=0;i<n;i++)
        {
            final1[i] = pre;
            pre=pre*a[i];
        }
        int suf = 1;
        for(int i=n-1;i>=0;i--)
        {
            final1[i] = final1[i]*suf;
            suf = suf-a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(final1[i]+" ");
        }
    }
}
