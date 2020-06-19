public class App {
  public static void main(String[] args) throws Exception {
    Rectangle r = new Rectangle(2.5, 2.5, 4, 4);
    r.getLocationRelation(new Rectangle(3.6, 2.5, 1, 1));
    Rectangle r = new Rectangle(2, -2.1, 2, 2);
    r.getLocationRelation(new Rectangle(2, -2.1, 2, 2));
  }
}
