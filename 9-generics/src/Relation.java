import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Relation<T> {
  private Set<T> set = new HashSet<>();
  private Set<Pair<T, T>> relation = new HashSet<>();

  public void add(T item) {
    set.add(item);
  }

  public void addRelation(Pair<T, T> pair) {
    relation.add(pair);
  }

  public boolean isReflexive() {
    for (T item : set) {
      Pair<T, T> search = new Pair<T, T>(item, item);
      if (!containsPair(search))
        return false;
    }
    return true;
  }

  public boolean isSymmetric() {
    for (Pair<T, T> pair : relation) {
      Pair<T, T> search = new Pair<T, T>(pair.getSecond(), pair.getFirst());
      if (!containsPair(search))
        return false;
    }
    return true;
  }

  public boolean isTransitive() {
    for (Pair<Pair<T, T>, Pair<T, T>> candiate : getTransitiveCandidates()) {
      Pair<T, T> search = new Pair<T, T>(candiate.getFirst().getFirst(), candiate.getSecond().getSecond());
      if (!containsPair(search))
        return false;
    }
    return true;
  }

  public boolean isEquivalent() {
    return isReflexive() && isSymmetric() && isTransitive();
  }

  public void reflexiveShell() {
    for (T item : set) {
      Pair<T, T> search = new Pair<T, T>(item, item);
      if (!containsPair(search)) {
        addRelation(search);
      }
    }
  }

  public void symmetricShell() {
    for (Pair<T, T> pair : relation) {
      Pair<T, T> search = new Pair<T, T>(pair.getSecond(), pair.getFirst());
      if (!containsPair(search)) {
        addRelation(search);
      }
    }
  }

  public void transitiveShell() {
    for (Pair<Pair<T, T>, Pair<T, T>> candiate : getTransitiveCandidates()) {
      Pair<T, T> search = new Pair<T, T>(candiate.getFirst().getFirst(), candiate.getSecond().getSecond());
      if (!containsPair(search)) {
        addRelation(search);
      }
    }
  }

  public String toString() {
    String output = "  ";
    for (T item : set) {
      output += " " + item;
    }
    output += "\n";
    for (T item : set) {
      output += item + " ";
      for (T item2 : set) {
        Pair<T, T> search = new Pair<>(item, item2);
        output += containsPair(search) ? " x" : "  ";
      }
      output += "\n";
    }
    return output;
  }

  private ArrayList<Pair<Pair<T, T>, Pair<T, T>>> getTransitiveCandidates() {
    ArrayList<Pair<Pair<T, T>, Pair<T, T>>> candiates = new ArrayList<>();
    for (Pair<T, T> pair : relation) {
      for (Pair<T, T> pair2 : relation) {
        if (pair.getSecond().equals(pair2.getFirst()))
          candiates.add(new Pair<Pair<T, T>, Pair<T, T>>(pair, pair2));
      }
    }
    return candiates;
  }

  private boolean containsPair(Pair<T, T> search) {
    for (Pair<T, T> pair : relation) {
      if (pair.equals(search))
        return true;
    }
    return false;
  }
}