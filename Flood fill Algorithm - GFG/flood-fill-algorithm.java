//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
     public  static int[][] floodFill(int [][] image,int sr,int sc,int newColor){
        int initial_color = image[sr][sc];
        
        int ans[][] = image;
        
        int delRow[] = {-1,0,+1,0};
        int delCol[] = {0,+1,0,-1};
        
        dfs(sr,sc,ans,image,newColor,delRow,delCol,initial_color);
        return ans;
    }
    
    static void dfs(int row,int col,int ans[][],int[][]image,int newColor,int delRow[],int delCol[],
                    int initial_color){
        ans[row][col] = newColor;
        
        int n = image.length;
        int m = image[0].length;
        
        for(int i = 0;i<4;i++){
            int new_row = row+delRow[i];
            int new_col = col+delCol[i];
            
            if(new_row>=0 && new_row<n && new_col>=0 && new_col<m && image[new_row][new_col]==initial_color
            && ans[new_row][new_col] != newColor){
                dfs(new_row,new_col,ans,image,newColor,delRow,delCol,initial_color);
            }
        }
    }
}