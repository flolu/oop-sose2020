import java.util.Random;

class App {
  public static void main(String args[]) {
    Random rand = new Random();
    StringMenge sm = new StringMengeImpl();
    while (sm.getSize() < 5) {
      String r = "Eingabe" + String.valueOf(rand.nextInt(5));
      boolean c = sm.contains(r);
      sm.add(r);

      System.out.printf("\nElement %3s ist %15s, Mengen-Groeße ist %2d, " +
      "mit: \n", r, ((c ? "" : "nicht ") + "vorhanden"), sm.getSize());

      sm.print();
      System.out.print("\nZeichenanzahl= "+sm.getCharCount());
      System.out.println();
    }
  }
}