public class Node {
  public int value;
  public Node next;

  public Node(int val, Node next) {
    value = val;
    this.next = next;
  }

  protected Node clone() {
    if (next == null)
      return new Node(value, null);
    return new Node(value, next.clone());
  }

  protected Node __cloneAlternative() {
    Node copy = new Node(value, null);
    Node originalIterator = next;
    Node copyIterator = copy;

    while (originalIterator != null) {
      copyIterator.next = new Node(originalIterator.value, null);
      copyIterator = copyIterator.next;
      originalIterator = originalIterator.next;
    }

    return copy;
  }

  void print() {
    Node temp = this;
    String output = "(";
    while (temp != null) {
      output += temp.next == null ? temp.value : temp.value + ",";
      temp = temp.next;
    }
    System.out.println(output + ")\n");
  }
}