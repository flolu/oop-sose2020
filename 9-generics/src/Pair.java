class Pair<T, U> {
  private final T first;
  private final U second;

  Pair(T fst, U snd) {
    first = fst;
    second = snd;
  }

  T getFirst() {
    return first;
  }

  U getSecond() {
    return second;
  }

  public boolean equals(Pair<T, U> other) {
    return other.getFirst().equals(getFirst()) && other.getSecond().equals(getSecond());
  }
}