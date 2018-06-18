package Ch10_ElementaryDataStructures.Tests;

import Ch10_ElementaryDataStructures.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForwardListTests {
    @Test
    public void insert__addSingleElement__Test() {
        ForwardList fList = new ForwardList();
        ForwardList.Node<String> node = new ForwardList.Node<String>(1, "Ivan");

        fList.insert(node);
        assertEquals("fList.head.key must be equal 1", fList.head.getKey(), 1);
    }
}