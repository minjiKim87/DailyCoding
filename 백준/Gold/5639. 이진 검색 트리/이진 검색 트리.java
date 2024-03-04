import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node node, int data) {
        if(node==null){
            return new Node(data);
        }
        if(data<node.data){
            node.left = insert(node.left, data);
        }else if(data>node.data){
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) throws IOException {
   // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = null;
        String input;

        while((input = br.readLine()) != null && !input.isEmpty()){
            int data = Integer.parseInt(input);
            root = insert(root, data);
        }


        postOrder(root);
    }
}
