import java.util.Arrays;

public class DIAarray extends DynIntArray {
  int array[] = new int[0];

  void add(int e) {
    int newArray[] = new int[this.array.length + 1];
    for (int i = 0; i < this.array.length; i++) {
      newArray[i] = this.array[i];
    }
    newArray[this.array.length] = e;
    this.array = newArray;
  }

  void setElementAt(int i, int e) {
    this.array[i] = e;
  }

  int getElementAt(int i) {
    return this.array.length > i ? this.array[i] : 0;
  }

  int getElementCount() {
    return this.array.length;
  }

  void print() {
    System.out.println(Arrays.toString(this.array));
  }
}