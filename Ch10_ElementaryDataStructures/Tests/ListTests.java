package Ch10_ElementaryDataStructures.Tests;

import Ch10_ElementaryDataStructures.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListTests {
  @Test
  public void listValueTest() {
    List list = new List();

    assertEquals("list value must be equal 3", 3, list.value);
  }
}