public class OneB {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };

    /**
     * A
     * 
     * Fehler in Zeile #9: `i <= a.length`
     * 
     * Richtig: `for (int i = 0; i < a.length; i++)`
     * 
     * Feld-Indezies fangen bei 0 an zu zählen. Somit existiert `a[a.length]` nicht!
     */
    int sum = 0;
    for (int i = 0; i < a.length; i++)
      sum += a[i];
    System.out.println("Ausgabe von A:");
    System.out.println("A sum: " + sum);

    /**
     * B sieht gut aus
     */
    System.out.println("\nAusgabe von B:");
    int k = 0;
    for (int i = 1; i <= a.length; i++)
      System.out.println(i + ": " + a[k++]);

    /**
     * C
     * 
     * Fehler in Zeile #23: `m[i]`
     * 
     * Richtig: `m[i - 1] = val / 3;`
     * 
     * Der erste Eintrag eines Feldes ist der Index 0. Weil `i = 1` initialisiert
     * ist würde in der ersten Iteration der Schleife `m[1]` zugewiesen werden. Wir
     * wollen aber `m[0]`.
     */
    System.out.println("\nAusgabe von C:");
    int[] m = new int[a.length - 2];
    for (int i = 1; i < a.length - 1; i++) {
      int val = (a[i - 1] + a[i] + a[i + 1]);
      m[i - 1] = val / 3;
    }
    System.out.println("m" + java.util.Arrays.toString(m));

    /**
     * D
     * 
     * Fehler in Zeile #27: `max = 0`
     * 
     * Richtig: `int max = Integer.MIN_VALUE;`
     * 
     * Was ist wenn das Maxiumum kleiner als 0 ist? Also initialisieren wir max mit
     * dem kleinstmöglichen Integer.
     */
    System.out.println("\nAusgabe von D:");
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max)
        max = a[i];
    }
    System.out.println(max);

    /**
     * E
     * 
     * Fehler in Zeile #36: `a[i] != 0`
     * 
     * Richtig: `while (i < a.length && a[i] == 0) i++;`
     * 
     * Die Schleife soll abbrechen wenn wir ein Element finden welches 0 ist.
     * 
     */
    System.out.println("\nAusgabe von E:");

    int i = 0;
    while (i < a.length && a[i] == 0)
      i++;

    System.out.println(i);
  }
}
