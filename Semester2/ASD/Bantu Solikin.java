import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/contests/live-coding-asd-c-p2/challenges/bantu-solikin/submissions/code/1331369187
class Node {

    
    public Node(int data) {
        this.data = data;
    }

    int data;
    Node next;
    

}

class SingleLinkedList {

    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return size;
    }

    public void insertAfter (Node input, int key){
        // Tuliskan kodemu di sini
        Node p = head;
        while (p!=null){
            if (p.data==(key)){
                if(p==tail){
                    tail.next = input;
                    input = tail;
                }else
                {
                    input.next = p.next; //A B C D  F (D,E)
                    p.next = input;
                    size++;
                }
                break;
            }
            p=p.next;
        }
    }

    public void insertBefore (Node input, int key){
        Node p = head;
        Node temp = null;

        if (key == head.data){
            input.next = head;
            head = input;
            temp = input;
            size++;
            return;
        }

        while (p != null && p.data != key) {
            temp = p;
            p = p.next;
        }

        temp.next = input;
        input.next = p;

        size++;

    }

    public void removeFirst(){
        Node p = head;
        if (head==tail){
            head=tail=null;
            size--;
        }else {
            head = p.next;
            p.data=0;
            size--;
        }

    }

    public void removeLast() {
        // Tuliskan kodemu di sini
            Node p = head;
        if (head==tail){
            head=tail=null;
            size--;
         }else {
            while (p != null) {
                if (p.next.next == null) {
                    p.next = null;
                    tail = p;
                    size--;
                    break;
                    //1 2 3 null
                }
                p = p.next;
            }
        }
    }

    public void addFirst(Node input) {
        // Tuliskan kodemu di sini
        if(isEmpty()){
            head=tail=input;
        }else{
            input.next = head;
            head = input;
        }
        size++;
    }

    public void addLast(Node input) {
        // Tuliskan kodemu di sini
            if(isEmpty()){
            head=tail=input;
        }else{
            tail.next = input;
            tail = input;
        }
        size++;
    }


    public void print() {
        // Tuliskan kodemu di sini
        Node p = head;
        while(p!=null){
            System.out.print(p.data +" ");
            p=p.next;
        }
    }
}

public class Solution {
	// Main method tidak boleh dirubah
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        SingleLinkedList sll = new SingleLinkedList();

        int jumlah = Integer.parseInt(input.readLine());
        String[] perintah = input.readLine().split(" ");
        String[] data = input.readLine().split(" ");
        int dataKe = 0;

        for (int i = 0; i < jumlah; i++) {
            if (perintah[i].equalsIgnoreCase("addFirst")) {
                sll.addFirst(new Node(Integer.parseInt(data[dataKe])));
                dataKe++;
            } else if (perintah[i].equalsIgnoreCase("addLast")) {
                sll.addLast(new Node(Integer.parseInt(data[dataKe])));
                dataKe++;
            } else if (perintah[i].equalsIgnoreCase("removeFirst")) {
                sll.removeFirst();
            } else if (perintah[i].equalsIgnoreCase("removeLast")) {
                sll.removeLast();
            } else if (perintah[i].equalsIgnoreCase("insertAfter")) {
                sll.insertAfter(new Node(Integer.parseInt(data[dataKe])),Integer.parseInt(data[dataKe + 1]));
                dataKe++;
                dataKe++;
            } else {
                sll.insertBefore(new Node(Integer.parseInt(data[dataKe])),Integer.parseInt(data[dataKe + 1]));
                dataKe++;
                dataKe++;
            }
        }
        sll.print();
        System.out.println("");
    }
}
