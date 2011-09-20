package ojug;

import java.util.ArrayList;
import java.util.List;

public class Scala7Java {
  public static void main(String[] args) {
    {
      // Object[] oos = new String[] { "one" };
      // oos[0] = new Integer(1);
    }

    {
      List<String> strings = new ArrayList<String>();
      strings.add("one");
      // List<Object> oos = strings;
      // oos.add(new Integer(1));
      // String s = strings.get(1);
      // printAll(strings);
    }

    {
      List<Object> oos = new ArrayList<Object>();
      oos.add("string");
      oos.add(new Integer(1));
      printAll(oos);
    }
  }

  private static void printAll(List<Object> list) {
    for (Object each : list) {
      System.out.println(each);
    }
  }
}
