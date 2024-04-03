import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len) {
    int count = 0;

    for (String word : myList) {
      if (word.length() == len) {
        count++;
      }
    }

    return count;
  }

  public void removeWordsOfLength(int len) {
    Iterator<String> iterator = myList.iterator();

    while (iterator.hasNext()) {
      String word = iterator.next();
      if (word.length() == len) {
       iterator.remove();
      }
    }
}
}
