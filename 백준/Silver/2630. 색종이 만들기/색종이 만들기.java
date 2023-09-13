import java.io.*;
import java.util.*;

public class Main{
    static char[][] arr;
    static int white=0;
    static int blue=0;


    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
     
       int N = Integer.parseInt(br.readLine());
       arr = new char[N][N];

       for(int i =0;i<N;i++){
            String str = br.readLine();
            arr[i] = str.replaceAll(" ", "").toCharArray();

       }

       partition(0, 0, N);

       System.out.println(white);
       System.out.println(blue);
      
       br.close();
        
    }

    public static void partition(int row, int col, int size){
        if(check(row, col, size)){
            if(arr[row][col]=='0')
                white++;
            else
                blue++;

            return;
        }

        
        int newSize = size/2;

        partition(row, col+newSize, newSize);
        partition(row, col, newSize);
        partition(row+newSize, col, newSize);
        partition(row+newSize, col+newSize, newSize);
       

    }

    static boolean check(int row, int col, int size){

		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
			
				if(arr[i][j] != arr[row][col]) {
					return false;
				}
			}
		}

        return true;
    }
    
    
}

