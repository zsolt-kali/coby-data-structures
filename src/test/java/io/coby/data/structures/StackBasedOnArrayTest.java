package io.coby.data.structures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class StackBasedOnArrayTest {

    private StackBasedOnArray stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackBasedOnArray();
    }

    @Test
    public void testStackShouldEmptyWhenEmptyDefault() throws Exception {
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testTopShouldReturnPushedElement() throws Exception {
        stack.push(5);
        assertEquals(5, stack.top());
    }

    @Test
    public void testTopShouldReturnOneWhenTwoAndFiVePushedAfterTwoPopOperation() throws Exception {
        stack.push(1);
        stack.push(5);
        stack.pop();
        assertEquals(1, stack.top());
    }
}
