package DSA_Ass2;import java.util.Scanner;public class ques5 {    public static void array(int n,int m)    {        Scanner sc = new Scanner(System.in);        int [][]arr = new int[n][m];        System.out.println("Enter the Element in the 2D array : ");        for(int i =0;i<n;i++)        {            for(int j =0;j<m;j++)            {                arr[i][j] = sc.nextInt();            }        }        for(int i =0;i<n;i++)        {            for(int j=0;j<m;j++)            {                if(i==(n-1)/2 || j == (m-1)/2)                {                    System.out.print(arr[i][j] + " ");                }            }        }    }    public static void main(String[] args) {        array(5, 5);    }}