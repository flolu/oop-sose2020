import javax.swing.Action;

public class CountStringAction1 implements ActionObject {
  private int counter = 0;
  private String search;

  CountStringAction1(String str) {
    search = str;
  }

  public void action(Node n) {
    if (n.data instanceof String && n.data == search)
      counter++;
  }

  public int getCounter() {
    return counter;
  }
}