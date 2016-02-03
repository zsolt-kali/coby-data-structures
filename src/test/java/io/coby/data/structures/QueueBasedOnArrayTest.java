package io.coby.data.structures;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class QueueBasedOnArrayTest {

    private QueueBasedOnArray queue;

    @Before
    public void setUp() throws Exception {
        queue = new QueueBasedOnArray();
    }

    @Test
    public void testIsEmptyShouldReturnTrueWhenCreatingAQueue() throws Exception {
        QueueBasedOnArray queue = new QueueBasedOnArray();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyShouldReturnFalseWhenAfterPushingAnElementIntoAQueue() throws Exception {
        queue.push(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testAfterPushZeroIntoPopShouldReturnZero() throws Exception {
        queue.push(0);
        assertEquals(0, queue.pop());
    }

    @Test
    public void testAfterPushZeroAndThreeIntoPopTwiceShouldReturnZeroAndThree() throws Exception {
        queue.push(0);
        queue.push(3);
        assertEquals(0, queue.pop());
        assertEquals(3, queue.pop());
    }
}
