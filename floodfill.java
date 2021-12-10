import java.util.*;
class main
{
    public static int[][] floodfill(int[][] a,int c1,int c2,int nc)
    {
         int v=a[c1][c2];
         if(v!=nc)
         {
             dfs(a,c1,c2,v,nc);
         }
         return a;
    }
    public static void dfs(int[][] a,int c1,int c2,int v,int nc)
    {
        if(a[c1][c2]==v)
        {
            a[c1][c2]=nc;
            if(c1>=1)
            dfs(a,c1-1,c2,v,nc);
            if(c2>=1)
            dfs(a,c1,c2-1,v,nc);
            if(c1+1<a.length)
            dfs(a,c1+1,c2,v,nc);
            if(c2+1<a[0].length)
            dfs(a,c1,c2+1,v,nc);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int r=sc.nextInt();
        System.out.println("Enter column:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter FloodFill cordinates:");
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println("OldColor:");
        int oc=sc.nextInt();
        System.out.println("NewColor:");
        int nc=sc.nextInt();
        System.out.println("After FloodFill:");
        floodfill(a,c1,c2,nc);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
