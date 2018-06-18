package Ch10_ElementaryDataStructures.Tests;

import Ch10_ElementaryDataStructures.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForwardListTests {
    @Test
    public void insert__addSingleElement__Test() {
        String value = "Ivan";
        ForwardList<String> fList = new ForwardList<String>();
        ForwardList<String>.Node node = fList.new Node(value);

        fList.insert(node);
        assertEquals("fList.head.value must be equal to " + value, 
            fList.getHead().getValue(), value);
    }
}