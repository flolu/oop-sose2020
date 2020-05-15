public class OneA {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };
    int[] b = a;
    a[2] = 17;

    System.out.println(java.util.Arrays.toString(b));
    /**
     * Output is [1, 2, 17, 4, -1, -2, -3, -4]
     */
  }
}
