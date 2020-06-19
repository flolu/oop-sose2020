public class App {
  public static void main(String[] args) throws Exception {
    // contained
    new Rectangle(2.5, 2.5, 4, 4).getLocationRelation(new Rectangle(1, 2.5, 1, 1));

    // aligned
    new Rectangle(0, 0.5, 3, 2).getLocationRelation(new Rectangle(2, -1, 2, 2));

    // same
    new Rectangle(2, -2.1, 2, 2).getLocationRelation(new Rectangle(2, -2.1, 2, 2));

    // disjoint
    new Rectangle(0, 0, 1, 1).getLocationRelation(new Rectangle(-100, 100, 1, 1));
  }
}
