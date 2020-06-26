public class App {
  public static void main(String[] args) {
    System.out.println(new Roman(4).equals(new Roman("IV"))); // true
    System.out.println(new Roman(72).equals(new Roman("LXXII"))); // true
    System.out.println(new Roman("DCCCXLV").equals(new Roman(845))); // true
    System.out.println(new Roman("MMXXII").equals(new Roman(2022))); // true

    System.out.println(new Roman("XIV").equals(new Roman(104))); // false
    System.out.println(new Roman(104).equals(new Roman("XIV"))); // false
  }
}
