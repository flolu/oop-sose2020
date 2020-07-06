public class App {
  public static void main(String[] args) throws Exception {
    List list = new List();
    list.add("string");
    list.add(42);
    list.add("string");
    list.add("something else");
    list.add("string");
    countOccurences1(list, "string");
    countOccurences2(list, "string");
  }

  public static void countOccurences1(List list, String str) {
    CountStringAction1 cs1 = new CountStringAction1(str);
    list.traverseAndApply(cs1);
    System.out.println(str + " kommt " + cs1.getCounter() + " mal in der Liste vor");
  }

  public static void countOccurences2(List list, String str) {
    CountStringAction2 cs2 = new CountStringAction2(str);
    list.traverseAndApply(cs2);
    System.out.println(str + " kommt " + cs2.getCounter() + " mal in der Liste vor");
  }

}