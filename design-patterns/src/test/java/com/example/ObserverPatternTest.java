package com.example;

import com.example.obeserver.Mailbox;
import com.example.obeserver.PostOffice;
import org.junit.Test;

/**
 * Created by kalizsolt on 02/02/16.
 */
public class ObserverPatternTest {
    @Test
    public void testName() throws Exception {
        PostOffice po = new PostOffice();
        po.addObserver(new Mailbox("Mailbox a"));
        po.addObserver(new Mailbox("Mailbox b"));
        po.addObserver(new Mailbox("Mailbox c"));

        po.notifyObserver();
    }
}
