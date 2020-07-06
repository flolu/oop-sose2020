public class Node {
  public Object data;
  public Node next;

  Node(Object obj, Node node) {
    data = obj;
    next = node;
  }
}