package Ch10_ElementaryDataStructures.Tests;

import Ch10_ElementaryDataStructures.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class ForwardListTests {
    @Test
    public void insert__addSingleElement__Test() {
        String value = "Ivan";
        ForwardList<String> forwardList = new ForwardList<String>();

        forwardList.insert(value);

        assertEquals("forwardList.getHeadValue() must be equal to " + value, 
            forwardList.getHeadValue(), value);
    }

    @Test 
    public void insert__addThreeElements__Test() {
        String value1 = "abc", value2 = "def", value3 = "ghi";
        ForwardList<String> forwardList = new ForwardList<String>();

        forwardList.insert(value1);
        forwardList.insert(value2);
        forwardList.insert(value3);

        Iterator<String> it = forwardList.getIterator();
        assertEquals(it.next(), value1);
        assertEquals(it.next(), value2);
        assertEquals(it.next(), value3);
        Assert.assertFalse(it.hasNext());
    }
}