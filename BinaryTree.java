import java.io.BufferedReader;
import java.io.*;

/**
 * Created by user on 04.05.2016.
 */


public class BinaryTree {

    static class Node {
        Node st;
        Node dr;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    /*public static void addNode(Node nod, int value) {
       if(nod != null)
           if(nod.value > value)
               addNode(nod.st,value);
            else
               addNode(nod.dr,value);
        else{
           nod = new Node(value);
           nod.st = nod.dr = null;
       }
    }
*/
    public static void addNode(Node node, int value) {
        if (value > node.value) {
            if (node.dr != null)
                addNode(node.dr, value);
            else {
                node.dr = new Node(value);
            }
        }
        else {
            if (node.st != null)
                addNode(node.st, value);
            else {
                node.st = new Node(value);
            }
        }
    }
    //Binary Tree traversal : In Order
    public static void showInOrder(Node nod) {
        //System.out.print("ok");
        if (nod.st != null)
            showInOrder(nod.st);
        System.out.println(nod.value);
        if (nod.dr != null)
            showInOrder(nod.dr);
    }

    public static void main(String[] args) throws IOException {
       /*
        Node root = new Node(5);
        addNode(root, 9);
        addNode(root, 8);
        addNode(root, 6);
        addNode(root, 10);
        addNode(root, 4);
        showInOrder(root);
    }
        */
        int n;
        System.out.print ("Introduceti numarul de noduri = ");
        BufferedReader stdin = new BufferedReader(new
                InputStreamReader(System.in));
        n = Integer.parseInt(stdin.readLine());
        Node root = new Node(n);
        int V[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Nodul "+i+ " = ");
            switch (V[i] = Integer.parseInt(stdin.readLine())) {
            }
            //addNode(root,V[i]);
        }
        System.out.println ("Nodurile introduse sunt: ");
        for(i=0;i<n;i++) {
            //System.out.print("\t\t\t\t\t\t");
            System.out.println(V[i]);
            addNode(root,V[i]);
        }
        System.out.println ("Binary Tree: ");
        showInOrder(root);
    }

}
