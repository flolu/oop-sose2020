public class App {
  public static void main(String[] args) {
    testNode();
    testSimpleList();
  }

  public static void testNode() {
    Node n1 = new Node(1, null);
    Node n2 = new Node(2, n1);
    Node n3 = new Node(3, n2);
    Node n3Clone = n3.clone();

    System.out.println("\nn3");
    n3.print();
    System.out.println("\nn3Clone");
    n3Clone.print();

    n3Clone.value = 42;

    System.out.println("\nn3 after change");
    n3.print();
    System.out.println("\nn3Clone after change");
    n3Clone.print();
  }

  public static void testSimpleList() {
    SimpleList s = new SimpleList();
    s.add(1);
    s.add(2);
    s.add(3);
    System.out.println("\ns");
    s.print();
    SimpleList sClone = s.clone();
    System.out.println("\nsClone");
    sClone.print();

    sClone.add(42);

    System.out.println("\ns after change");
    s.print();
    System.out.println("\nnsClone after change");
    sClone.print();
  }
}
