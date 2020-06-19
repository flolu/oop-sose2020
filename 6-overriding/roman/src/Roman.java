public class Roman {
  private String romanString;
  private int romanValue;

  Roman(String roman) {
    this.romanString = roman;
    romanValue = romanToInt(roman);
  }

  Roman(int value) {
    romanValue = value;
    romanString = intToRoman(value);
  }

  public Roman add(Roman r) {
    return new Roman(getValue() + r.getValue());
  }

  public Roman substract(Roman r) {
    int result = getValue() - r.getValue();
    if (result <= 0)
      throw new Error("negative numbers or zero no allowed");
    return new Roman(result);
  }

  public Roman multiply(Roman r) {
    return new Roman(getValue() * r.getValue());
  }

  public Roman divide(Roman r) {
    return new Roman(getValue() / r.getValue());
  }

  public String toString() {
    return romanString;
  }

  public int hashCode() {
    return getValue();
  }

  public int getValue() {
    return romanValue;
  }

  public boolean equals(Roman r) {
    return r.hashCode() == hashCode();
  }

  private String intToRoman(int value) {
    String roman = "";
    String[] chars = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int[] values = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

    int counter = 0;
    for (int i = values.length - 1; i >= 0; i--) {
      counter = value / values[i];
      value = value % values[i];
      for (int j = 0; j < counter; j++)
        roman += chars[i];
    }
    return roman;
  }

  private int romanToInt(String roman) {
    int value = 0;
    String[] binaries = new String[] { "IV", "IX", "XL", "XC", "CD", "CM" };

    while (roman.length() > 0) {
      if (roman.length() > 1 && stringIncludes(roman.substring(0, 2), binaries)) {
        value += romanCharToValue(roman.substring(0, 2));
        roman = roman.substring(2, roman.length());
      } else {
        value += romanCharToValue(roman.substring(0, 1));
        roman = roman.substring(1, roman.length());
      }
    }

    return value;
  }

  private int romanCharToValue(String romanChar) {
    String[] chars = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int[] values = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    for (int i = 0; i < chars.length; i++) {
      if (romanChar.equals(chars[i]))
        return values[i];
    }
    return 0;
  }

  private boolean stringIncludes(String search, String[] strings) {
    for (String s : strings) {
      if (s.equals(search))
        return true;
    }
    return false;
  }
}