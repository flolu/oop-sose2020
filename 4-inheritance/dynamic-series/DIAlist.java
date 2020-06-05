public class DIAlist extends DynIntArray {
  Node firstNode;

  void add(int e) {
    Node last = this.getLastNode();
    Node inserted = new Node(e);
    if (last == null)
      this.firstNode = inserted;
    else
      last.next = inserted;
  }

  void setElementAt(int i, int e) {
    Node node = this.getNodeAt(i);
    if (node != null)
      node.value = e;
  }

  int getElementAt(int i) {
    Node node = this.getNodeAt(i);
    return node == null ? 0 : node.value;
  }

  int getElementCount() {
    Node temp = this.firstNode;
    int i = 1;
    while (temp.next != null) {
      temp = temp.next;
      i++;
    }
    return i;
  }

  void print() {
    String out = "[";
    Node temp = this.firstNode;
    boolean first = true;
    while (temp != null) {
      if (first) {
        out += temp.value;
        first = false;
      } else
        out += ", " + temp.value;
      temp = temp.next;
    }
    System.out.println(out + "]");
  }

  private Node getNodeAt(int i) {
    Node temp = this.firstNode;
    for (int j = 0; j < i; j++) {
      if (temp.next == null)
        return null;
      temp = temp.next;
    }
    return temp;
  }

  private Node getLastNode() {
    Node temp = this.firstNode;
    if (temp == null)
      return null;
    while (temp.next != null) {
      temp = temp.next;
    }
    return temp;
  }
}