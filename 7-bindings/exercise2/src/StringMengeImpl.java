import java.util.Iterator;

public class StringMengeImpl extends AbstrakteStringMenge {
  public void add(String s) {
    if (!contains(s)) list.add(s);
  }

  public void remove(String s) {
    list.remove(list.indexOf(s));
  }

  public boolean contains(String s) {
    return list.indexOf(s) >= 0;
  }

  public int getSize() {
    return list.size();
  }

  public String[] getElements() {
    String[] array = new String[getSize()];
    int i = 0;
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
			array[i] = iterator.next();
      i++;
    }
    return array;
  }
}