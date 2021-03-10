import java.util.*;
//https://www.hackerrank.com/contests/lc-single-ll-tif-e/challenges/singly-linked-list-5/submissions/code/1331318893
class Node {
  //Atribut
  Object data;//sebagai isi dari node
  Node pointer;//sebagai tangan dari node

  //Konstruktor
  public Node() { 
  
  }

  public Node(Object data) {
    this.data = data;
  }

  public Node(Object data, Node pointer) {
    this.data = data;
    this.pointer = pointer;
  }
}

class LinkedList1 {
  //Atribut
  Node head,tail;//head menandakan node paling depan dan tail menandakan paling belakang
  int size=0;

  //Konstruktor singly linked list
  public LinkedList1(){
    isEmpty();
  }

  //Method mengecek apakah singly linked list kosong atau tidak
  boolean isEmpty(){
    return size == 0;
  }
 
  //Method mengecek ukuran singly linked list
  int size(){
    return size;
  }
 
  //Method menambahkan node ke paling depan
  void addFirst(Node input){
        if (isEmpty()){
            head=tail=input;
        }else {
            input.pointer = head;
            head = input;
        }
        size++;
  }

  //Method menambahkan node ke paling belakang
  void addLast(Node input){
        if (isEmpty()){
            head=tail=input;
        }else {
            tail.pointer = input;
            tail = input;
        }
        size++;
  }

  //Method menambahkan node setelah key
  void insert(Object key, Node input){
        Node p = head;
        while (p!=null){
            if (p.data.equals(key)){
                if(p==tail){
                    addLast(input);
                }else{
                    input.pointer = p.pointer; //A B C D  F (D,E)
                    p.pointer = input;
                    size++;
                }
                break;
            }
            p=p.pointer;
        }
  }

  //Method menghapus node sesuai isinya
void remove(Object key){
            Node p = head;
            int numb=1;
            if(isEmpty()){
                return;
            }
            if(p.data.equals(key)){
                head=p.pointer;
                p.data = null;
                size--;
            }else if(tail.data.equals(key)){
                while (p != null) {
                    if (p.pointer.pointer == null) {
                        p.pointer = null;
                        tail = p;
                        size--;
                        break;
                    }
                    p=p.pointer;
                }
            }else {
                while (p!=null){
                    if (p.data.equals(key)){

                        break;
                    }
                    numb++;
                    p=p.pointer;
                }
                if (numb>this.size){
                    return;
                }
                p=head;
                while (p!=null){
                    if (p.pointer.data.equals(key)) {
                        p.pointer = p.pointer.pointer;
                        size--;
                        break;
                    }
                    p=p.pointer;
                }
            }
        }

  //Method mencetak seluruh isi linked list dari head
  public void print(){
        Node x = head;
        while (x!=null){
            System.out.print(x.data+" ");
            x=x.pointer;
        }
        System.out.println();
  }
}

public class Solution {

  public static void main(String[] args) {
    //Disarankan untuk tidak mengubah main method
    Scanner input = new Scanner(System.in);
    LinkedList1 list =new LinkedList1();
    int n = input.nextInt();
    for(int i = 0;i<n;i++){
      String s = input.next();
      int a;
      switch(s){
        case "isEmpty":
          System.out.println(list.isEmpty());
          break;
        case "size":
          System.out.println(list.size());
          break;
        case "addFirst":
          a = input.nextInt();
          list.addFirst(new Node(a));
          break;
        case "addLast":
          a = input.nextInt();
          list.addLast(new Node(a));
          break;
        case "insert":
          a = input.nextInt();
          int b = input.nextInt();
          list.insert(a,new Node(b));
          break;
        case "remove":
          a = input.nextInt();
          list.remove(a);
          break;
        case "print":
          list.print();
      }
    }
  }   
}
