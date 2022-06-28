package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ListTest {
    List list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList();
    }
    @Test
    public  void newListIsEmptyTest() {
        Assertions.assertTrue(list.isEmpty());
    }
    @Test
    public void addItem_listIsNotEmpty() {
        list.add("G-String");
        assertFalse(list.isEmpty());
    }
    @Test
    public void addItem_removeItem_listIsNotEmpty() {
        list.add("G-String");
        list.remove("E-String");
        Assertions.assertTrue(list.isEmpty());
    }
    @Test
    public void addItem_sizeIncreasesTest() {
        list.add("G-String");
        assertEquals(1,list.size());
    }
    @Test
    public void addX_addY_sizeIsTwoTest() {
        list.add("G-String");
        list.add("A-String");
    }
    @Test
    public void addX_addY_removeX_sizeIsTwoTest() {
        list.add("G-String");
        list.add("A-String");
        list.remove("A-String");
        assertEquals(1,list.size());
    }
    @Test
    public void addX_addY_listIsNotEmptyTest() {
        list.add("G-String");
        list.add("A-String");
        list.remove("A-String");
       assertFalse(list.isEmpty());
    }
}
