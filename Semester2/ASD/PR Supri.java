import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    Object data;
    Node next;
    Node prev;

    Node(Object data) {
        this.data = data;
    }

    Node(Object data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

class DoubleLinkedList {
    Node head;
    Node tail;
    int size = 0;

    void inisialisasiNull() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (size == 0);
    }

    int getsize() {
        return size;
    }

    void addLast(Node input) {
        if (isEmpty()){
            head=tail=input;
        }else {
            tail.next = input;
            input.prev = tail;
            tail = input;
        }
        size++;
    }

//    public String read() {
//        // Tuliskan kodemu di sini
//    }
//
//    public String reverse() {
//        // Tuliskan kodemu di sini
//    }

    public boolean isPalindrome() {
        Node p = head;
        Node c = tail;
        int temp = 0;
        for (int i = 0;i<getsize();i++){
            if (p.data.equals(c.data)){
                temp++;
            }
            p=p.next;
            c=c.prev;
        }
        return temp==getsize();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        String kata = input.nextLine();

        for (int i = 0; i < kata.length(); i++) {
            dll.addLast(new Node(kata.charAt(i) + ""));
        }
        if (dll.isPalindrome()){
            System.out.println("Palindrome Bosque!");
        }else {
            System.out.println("Bukan Palindrome Boi!");
        }
    }
}
