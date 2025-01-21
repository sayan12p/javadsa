package matrix;

import java.util.ArrayDeque;
import java.util.Arrays;

public class CyclicallyRotatingaGrid {

    public static int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;;
        int n = grid[0].length;
        int x=0,y=0;
        while(m>0 && n>0){
            int[] array = createArray(grid,x,y,m,n);
            int temp = k%(2*(m+n-2));
            int[] rotateArray = rotatearr(array,temp);
            putInTheGrid(grid,x,y,m,n,rotateArray);
            m-=2;
            n-=2;
            x+=1;y+=1;
        }
        return grid;
    }

    public static int[] createArray(int[][] grid,int x,int y ,int m,int n){
        int len =2*(m+n -2);
        int arr[] =new int[len];
        int count=0; int startx=x; int starty=y;
        for(;x<startx+m;x++){
            arr[count++]=grid[x][y];
        }
        x--;
        y++;

        for(;y<starty+n;y++){
            arr[count++]=grid[x][y];
        }
        y--;
        x--;

        for(;x>=startx;x--){
            arr[count++]=grid[x][y];
        }
        x++;
        y--;

        for(;y>starty;y--){
            arr[count++]=grid[x][y];
        }
        return arr;
    }

    public static int[] rotatearr(int[] arr,int k){
        if(k<0) return arr;
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        for(int i=arr.length-k;i<arr.length;i++){
            queue.offer(arr[i]);
        }
        for(int i=arr.length-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<=k-1;i++){
            arr[i]=queue.poll();
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void putInTheGrid(int[][] grid,int x,int y,int m,int n,int[] arr) {
        int len = 2 * (m + n - 2);
        int count = 0, startx = x, starty = y;
        for (; x < startx + m; x++) {
            grid[x][y] = arr[count++];
        }
        x--;
        y++;
        for (; y < starty + n; y++) {
            grid[x][y] = arr[count++];
        }
        y--;
        x--;
        for (; x >= startx; x--) {
            grid[x][y] = arr[count++];
        }
        x++;
        y--;
        for (; y > starty; y--) {
            grid[x][y] = arr[count++];
        }
    }

        public static void main(String[] args) {
        int[][] grids=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(rotateGrid(grids,2)));
    }
}
