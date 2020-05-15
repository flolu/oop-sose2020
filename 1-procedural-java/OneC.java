public class OneC {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };

    boolean evenLength = a.length % 2 == 0;
    int a1[] = new int[evenLength ? a.length / 2 : a.length / 2 + 1], a2[] = new int[a.length / 2];
    for (int j = 0; j < a.length; j++) {
      if (j % 2 == 0)
        a1[j / 2] = a[j];
      else
        a2[j / 2] = a[j];
    }

    System.out.println("a1: " + java.util.Arrays.toString(a1));
    System.out.println("a2: " + java.util.Arrays.toString(a2));
  }
}
