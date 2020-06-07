public class DIAlist2 extends DynIntArray {
  Node firstNode;

  public void add(int e) {
    if (firstNode == null) {
      firstNode = new Node(e);
    } else {
      Node present = firstNode;
      while (present.next != null) {
        present = present.next;
      }
      present.next = new Node(e);
    }
  }

  void setElementAt(int i, int e) {
    Node present = firstNode;
    for (int j = 0; j < i; j++) {
      if (present.next == null)
        return;
      else
        present = present.next;
    }
    present.value = e;
  }

  int getElementAt(int i) {
    Node present = firstNode;
    for (int j = 0; j < i; j++) {
      if (present.next == null)
        return 0;
      else
        present = present.next;
    }
    return present.value;
  }

  int getElementCount() {
    if (firstNode == null)
      return 0;
    Node present = firstNode;
    int counter = 1;
    while (present.next != null) {
      present = present.next;
      counter++;
    }
    return counter;
  }

  void print() {
    String string = "[";
    Node present = firstNode;
    while (present.next != null) {
      string = string + present.value + ", ";
      present = present.next;
    }
    string = string + present.value + "]";
    System.out.println(string);
  }
}