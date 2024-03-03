import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char data;
    Node left, right;

    public Node(char data){
        this.data = data;
    }

}

public class Main {
    static Node[] tree = new Node[26]; 

    public static void preOrder(Node node) {
        if (node == null ) return;
        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
 
    }

    public static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data);
        inOrder(node.right);
     
    }

    public static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
  
    }

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("example.txt")); 

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = new Node((char) ('A' + i)); 
        }

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            char parent = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            if(left != '.'){
                tree[parent-'A'].left = tree[left-'A'];
            }
            if(right!='.'){
                tree[parent-'A'].right = tree[right-'A'];
            }
      
        }

        preOrder(tree[0]);
        System.out.println();
        inOrder(tree[0]);
        System.out.println();
        postOrder(tree[0]);
        System.out.println();

        br.close(); 
    }
}

