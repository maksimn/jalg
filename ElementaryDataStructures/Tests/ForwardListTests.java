package ElementaryDataStructures.Tests;

import ElementaryDataStructures.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class ForwardListTests {
    @Test
    public void insert__addSingleElement__Test() {
        String value = "Ivan";
        ForwardList<String> forwardList = new ForwardList<String>();

        forwardList.insert(value);

        assertEquals("forwardList single element must be equal to " + value, 
            forwardList.getIterator().next(), value);
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
        Object afterNext = it.next();
		Assert.assertNull(afterNext);
        Assert.assertFalse(it.hasNext());
    }

    @Test 
    public void delete_fromForwardListWith3Elements() {
        final int a = 3, b = 1, c = 7, d = 5;
        final ForwardList<Integer> list = new ForwardList<>();

        list.insert(a);
        list.insert(b);
        list.insert(c);
        list.insert(d);

        ForwardList<Integer>.Node node = list.search(c);
        list.delete(node);

        final String after = "[3, 1, 5]";
        Assert.assertTrue(list.toString().equals(after));
    }
}