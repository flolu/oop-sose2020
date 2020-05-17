public class Three {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int prosts = prost(n);
    System.out.println(prosts);
  }

  public static int prost(int n) {
    if (n == 0 || n == 1)
      return 0;
    if (n == 2)
      return 1;
    return n - 1 + prost(n - 1);
  }
}
