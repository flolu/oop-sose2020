public class CountStringAction2 implements ActionObject {
  private int counter = 0;
  private String search;

  CountStringAction2(String str) {
    search = str;
  }

  public void action(Node n) {
    if (n.data instanceof String && n.data == search) {
      counter++;
      if (counter >= 5)
        n.data = "XXX";
    }
  }

  public int getCounter() {
    return counter;
  }
}