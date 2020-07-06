public class List {
  private Node head = null;

  void add(Object obj) {
    this.head = new Node(obj, head);
  }

  public void traverseAndApply(ActionObject p) {
    for (Node cursor = head; cursor != null; cursor = cursor.next) {
      p.action(cursor);
    }
  }

  void print() {
    for (Node cursor = head; cursor != null; cursor = cursor.next) {
      System.out.println(cursor.data.toString());
    }
  }
}
