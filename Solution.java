import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    Node<String> temp = head;
    List<String> linkedList = new ArrayList<>();

    while(temp != null){
      linkedList.add(temp.val);
      System.out.println(temp.val);
      System.out.println(temp.next);
      temp = temp.next;
    }

    return linkedList;
  }

  public static void main(String[] linkedList) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a); 
    // -> [ "a", "b", "c", "d" ]
  }
}
