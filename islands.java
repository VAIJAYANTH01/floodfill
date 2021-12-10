import java.util.*;
class main
{
    public static int islands(int[][] arr)
    {
        int noi=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    noi++;
                    dfs(arr,i,j);
                }
            }
        }
        return noi;
    }
    
    public static void dfs(int[][] arr,int i,int j)
    {
        if(i>=0 && j>=0 && i<arr.length && j<arr[0].length && arr[i][j]==1)
        {
            arr[i][j]=0;
            dfs(arr,i+1,j);
            dfs(arr,i-1,j);
            dfs(arr,i,j+1);
            dfs(arr,i,j-1);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int r=sc.nextInt();
        System.out.println("Enter column:");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Number of islands:");
        Object obj=new Object();
        //int m=obj.islands(arr);
        int m=islands(arr);
        System.out.print(m);
    }
}
