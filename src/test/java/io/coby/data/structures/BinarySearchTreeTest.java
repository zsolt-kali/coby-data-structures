package io.coby.data.structures;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by kalizsolt on 01/02/16.
 */
public class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @Before
    public void setUp() throws Exception {
        bst = new BinarySearchTree();
    }

    @Test
    public void testSearchForNonExistingElementShouldReturnFalse() throws Exception {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(6);

        assertFalse(bst.search(11));
    }

    @Test
    public void testSearchForExistingElementShouldReturnTrue() throws Exception {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(6);
        bst.insert(11);

        assertTrue(bst.search(11));
    }

    @Test
    public void testFindMinReturnsTheSmallestNumberFromTheNodes() throws Exception {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(1);
        bst.insert(6);
        bst.insert(11);

        assertEquals(1, bst.findMin());
    }

    @Test
    public void testFindMaxReturnsTheLargesttNumberFromTheNodes() throws Exception {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(1);
        bst.insert(6);
        bst.insert(11);

        assertEquals(15, bst.findMax());
    }

    @Test
    public void testFindHeightReturns3() throws Exception {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(1);
        bst.insert(6);
        bst.insert(11);

        assertEquals(2, bst.findHeight());
    }
}
