public class SimpleList {
  private Node head = null;

  SimpleList() {
  }

  SimpleList(Node initialHead) {
    head = initialHead;
  }

  public void add(int i) {
    head = new Node(i, head);
  }

  protected SimpleList clone() {
    return new SimpleList(head.clone());
  }

  public void print() {
    head.print();
  }
}