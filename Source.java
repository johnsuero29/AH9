import java.util.ArrayList;
import java.util.List;

class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) 
    {

      List<Node<T>> nodes = new ArrayList<Node<T>>();
 
      while (head != null) 
      {
        nodes.add(head);
        head = head.next;
      }

      int count = nodes.size()-1;
      for(int i = count; i> 0; i--)
      {
        nodes.get(i).next = nodes.get(i-1);
      }
      
      
      nodes.get(0).next = null;
      head = nodes.get(nodes.size()-1);

      return head;
    }
    
    public static void main(String[] args) {
      Node<String> a = new Node<>("a");
      Node<String> b = new Node<>("b");
      Node<String> c = new Node<>("c");
      Node<String> d = new Node<>("d");
      Node<String> e = new Node<>("e");
      Node<String> f = new Node<>("f");
      
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      e.next = f;

        // Printing solution
        Node<String> head = Source.reverseList(a);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
  }