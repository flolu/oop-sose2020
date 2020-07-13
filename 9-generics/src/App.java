public class App {
  public static void main(String[] args) throws Exception {
    Relation<Integer> r = new Relation<>();
    r.add(1);
    r.add(2);
    r.add(3);
    r.add(4);

    r.addRelation(new Pair<>(1, 2));
    r.addRelation(new Pair<>(1, 1));
    r.addRelation(new Pair<>(2, 2));
    r.addRelation(new Pair<>(3, 3));
    r.addRelation(new Pair<>(4, 4));
    r.addRelation(new Pair<>(2, 4));
    r.addRelation(new Pair<>(1, 4));

    System.out.println("Ist reflexiv: " + (r.isReflexive() ? "true" : "false"));
    System.out.println("Ist symmetrisch: " + (r.isSymmetric() ? "true" : "false"));
    System.out.println("Ist transitiv: " + (r.isTransitive() ? "true" : "false"));
    System.out.println("Ist Aequivalenzrelation: " + (r.isEquivalent() ? "true" : "false"));
    System.out.println("Matrixdarstellung:\n" + r.toString());
  }
}
