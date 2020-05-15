public class OneD {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };

    int oddCount = 0, evenCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0)
        evenCount++;
      else
        oddCount++;
    }

    int b1[] = new int[evenCount], b2[] = new int[oddCount];
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0)
        b1[i / 2] = a[i];
      else
        b2[i / 2] = a[i];
    }

    System.out.println("b1: " + java.util.Arrays.toString(b1));
    System.out.println("b2: " + java.util.Arrays.toString(b2));
  }
}
