public class OneC {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };

    boolean evenLength = a.length % 2 == 0;
    int a1[] = new int[evenLength ? a.length / 2 : a.length / 2 + 1], a2[] = new int[a.length / 2];
    for (int i = 0; i < a.length; i++) {
      if (i % 2 == 0)
        a1[i / 2] = a[i];
      else
        a2[i / 2] = a[i];
    }

    System.out.println("a1: " + java.util.Arrays.toString(a1));
    System.out.println("a2: " + java.util.Arrays.toString(a2));
  }
}
