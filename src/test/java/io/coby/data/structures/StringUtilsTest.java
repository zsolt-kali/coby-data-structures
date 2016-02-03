package io.coby.data.structures;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class StringUtilsTest {
    @Test
    public void testReverseStringShouldReturnABWhenInputIsBA() throws Exception {
        assertEquals("BA", StringUtils.reverseString("AB"));
    }

    @Test
    public void testReverseStringShouldReturnABCWhenInputIsCBA() throws Exception {
        assertEquals("CBA", StringUtils.reverseString("ABC"));
    }
}
