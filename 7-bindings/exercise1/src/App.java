public class App {
  public static void main(String[] args) throws Exception {
    b();
  }

  public static void a() {
    // A a = new A();
    // B b = new B();
    // C c = new C();
    // add(1.0, 2.0);
    // add(1, 2);
    // add(2, 1L);
    // print(c, c);
    // print(a, c);
    // print(c, b);
    // print(b, a);
  }

  public static void b() {
    A a = new A();
    B b = new B();
    C c = new C();
    Print1 p1 = new Print1();
    Print2 p2 = new Print2();
    p1 = p2;
    System.out.println(p1.x); // Aufruf 1
    p1.print(c); // Aufruf 2
    ((Print2) p1).print(c); // Aufruf 3
    ((Print1) p2).print(b); // Aufruf 4
    ((Print1) p2).print(c); // Aufruf 5
    p2.print(c); // Aufruf 6
    p1 = new Print1();
    ((Print2) p1).print(a); // Aufruf 7
  }

  // static int add(long a, int b) {
  // System.out.println("Methode 1");
  // return a + b;
  // }

  // static int add(double a, float b) {
  // System.out.println("Methode 2");
  // return a + b;
  // }

  // static void print(B b, C c) {
  // System.out.println("Methode 3");
  // }

  // static void print(A a, B b) {
  // System.out.println("Methode 4");
  // }

}
