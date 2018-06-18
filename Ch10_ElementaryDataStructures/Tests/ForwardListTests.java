package Ch10_ElementaryDataStructures.Tests;

import Ch10_ElementaryDataStructures.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForwardListTests {
    @Test
    public void insert__addSingleElement__Test() {
        String value = "Ivan";
        ForwardList<String> forwardList = new ForwardList<String>();

        forwardList.insert(value);

        assertEquals("forwardList.getHeadValue() must be equal to " + value, 
            forwardList.getHeadValue(), value);
    }
}