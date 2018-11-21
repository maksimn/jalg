package io.github.maksimn.jalg.elementarydatastructures;

import org.junit.Test;
import org.junit.Assert;

public class ForwardListTests {
    @Test
    public void insert__addSingleElement__Test() {
        String value = "Ivan";
        ForwardList<String> forwardList = new ForwardList<>();

        forwardList.insert(value);

        Assert.assertEquals("forwardList single element must be equal to " + value,
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
        Assert.assertEquals(it.next(), value1);
        Assert.assertEquals(it.next(), value2);
        Assert.assertEquals(it.next(), value3);
        Object afterNext = it.next();
        Assert.assertNull(afterNext);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void search_forwardListWith4Elements() {
        final int a = 3, b = 1, c = 7, d = 5;
        final ForwardList<Integer> list = new ForwardList<>();

        list.insert(a);
        list.insert(b);
        list.insert(c);
        list.insert(d);

        ForwardList<Integer>.Node node = list.search(c);
        int result = node.getValue().intValue();
        Assert.assertEquals(result, c);
        Assert.assertEquals(node.getNext().getValue().intValue(), d);
    }

    @Test
    public void delete_fromForwardListWith4Elements() {
        final int a = 3, b = 1, c = 7, d = 5;
        final ForwardList<Integer> list = new ForwardList<>();

        list.insert(a);
        list.insert(b);
        list.insert(c);
        list.insert(d);

        ForwardList<Integer>.Node node = list.search(c);
        list.delete(node);

        Iterator<Integer> it = list.getIterator();
        int first = it.next();
        int second = it.next();
        int third = it.next();

        Assert.assertEquals(a, first);
        Assert.assertEquals(b, second);
        Assert.assertEquals(d, third);
    }
}
