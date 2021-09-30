package ru.botgaydev;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void helloMessage() {
        Main bot1 = new Main();
        String expected = "Wassup. I'm bot. I can sell some useful info. For details, use \"/help\"";
        assertEquals(expected, bot1.helloMessage);
    }

}