import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        char data;
        Node prev, next;

        Node(char data) {
            this.data = data;
        }
    }

    static class Editor {
        Node head, tail;
        Node cursor;

        Editor() {
            head = new Node('\0');
            tail = new Node('\0');
            head.next = tail;
            tail.prev = head;
            cursor = tail;
        }

        void insert(char c) {
            Node newNode = new Node(c);

            newNode.prev = cursor.prev;
            newNode.next = cursor;

            cursor.prev.next = newNode;
            cursor.prev = newNode;
        }

        void left() {
            if (cursor.prev != head) {
                cursor = cursor.prev;
            }
        }

        void right() {
            if (cursor != tail) {
                cursor = cursor.next;
            }
        }

        void delete() {
            if (cursor.prev != head) {
                Node toRemove = cursor.prev;
                toRemove.prev.next = cursor;
                cursor.prev = toRemove.prev;
            }
        }

        String buildResult() {
            StringBuilder sb = new StringBuilder();
            Node cur = head.next;
            while (cur != tail) {
                sb.append(cur.data);
                cur = cur.next;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            String str = br.readLine();
            Editor editor = new Editor();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '<') {
                    editor.left();
                } else if (c == '>') {
                    editor.right();
                } else if (c == '-') {
                    editor.delete();
                } else {
                    editor.insert(c);
                }
            }

            result.append(editor.buildResult()).append('\n');
        }

        System.out.print(result);
    }
}
