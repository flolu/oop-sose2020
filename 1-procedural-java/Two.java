public class Two {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    if (n == 0)
      System.out.println(0);

    if (n <= 0)
      System.exit(1);

    int previous = 0;
    int current = 1;

    for (int i = 0; i < n; i++) {
      int newPrevious = current;
      current += previous;
      previous = newPrevious;
    }

    System.out.println(current);
  }
}