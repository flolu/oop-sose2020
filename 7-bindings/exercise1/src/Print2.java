public class Print2 extends Print1 {
  int x = 3;

  public void print(A a) {
    System.out.println(x);
  }

  public void print(B b) {
    System.out.println(x + 1);
  }

  public void print(C c) {
    System.out.println(x + 2);
  }
}