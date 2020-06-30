import java.util.LinkedList;
import java.util.Iterator;

public abstract class AbstrakteStringMenge implements StringMenge {
  protected LinkedList<String> list = new LinkedList<String>();

	public int getCharCount() {
		int count = 0;
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      count += iterator.next().length();
    }
		return count;
	}

	public boolean isEmpty() {
		return list.size() <= 0;
	}

	public void print() {
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
			System.out.printf(iterator.next());
    }
	}
}