package com.java.customarraylisttest;

import static org.junit.jupiter.api.Assertions.*;

import com.java.customarraylist.MyList;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import com.java.customarraylist.MyArrayList;

class CustomArrayListTest {
    
    @Rule
    private MyList<String> list;

    @Test
    void methodAdd_addElementToList_returnTrue() {
        Given:
        list = getList();

        When:
        list.add("four");

        Then:
        assertEquals(true, list.add("four"));
    }
    
    @Test
    void methodSize_getSizeMyArrayList_returnThree() {
        Given:
        list = getList();

        When:
        list.size();

        Then:
        assertEquals(3, list.size());
    }

    @Test
    void methodGet_getElementFromMyArrayList_returnElementIsTwo() {
        Given:
        list = getList();

        When:
        list.get(1);

        Then:
        assertEquals("two", list.get(1));
    }
    
    @Test
    void methodClear_shouldDeletedAllElementsFromMyArrayList_returnTrue() {
        Given:
        list = getList();

        When:
        list.clear();

        Then:
        assertEquals(true, list.isEmpty());
    }

    @Test
    void methodIsEmpty_addElementAndGetFalseIfNotEmpty_returnFalse() {
        Given:
        list = getList();

        When:
        list.add("new");

        Then:
        assertEquals(false, list.isEmpty());
    }
    
    @Test
    void methodRemove_removeElementFromMyArrayList_returnElementThreeAndSizeIsTwo() {
        Given:
        list = getList();

        When:
        list.remove(1);

        Then:
        assertEquals("three", list.get(1));
        assertEquals(2, list.size());
    }
    
    @Test
    void methodRemove_deleteElementByIndex_returnSizeIsTwo() {
        Given:
        list = getList();

        When:
        list.remove(1);

        Then:
        assertEquals(2, list.size());
    }
    
    @Test
    void methodRemove_deleteByElementFromMyArrayList_returnSizeIsTwo() {
        Given:
        list = getList();

        When:
        list.remove("one");

        Then:
        assertEquals(2, list.size());
    }
    
    @Test
    void methodRemove_deleteElementByIndex_returnElementIsThree() {
        Given:
        list = getList();

        When:
        list.remove(1);

        Then:
        assertEquals("three", list.get(1));
    }
    
    @Test
    void methodRemove_deleteByElement_returnElementIsTwo() {
        Given:
        list = getList();

        When:
        list.remove("one");

        Then:
        assertEquals("two", list.get(0));
    }
    
    @Test
    void methodRemove_deleteByElement_returnTrue() {
        Given:
        list = getList();

        When:
        list.remove("one");

        Then:
        assertEquals(true, list.remove("one"));
    }
    
    @Test
    void methodContains_verifyMyArrayListContainsElement_returnTrue() {
        Given:
        list = getList();

        When:
        list.contains("one");

        Then:
        assertEquals(true, list.contains("one"));
    }
    
    @Test
    void methodContains_verifyMyArrayListContainsElement_returnFalse() {
        Given:
        list = getList();

        When:
        list.contains("nine");

        Then:
        assertEquals(false, list.contains("nine"));
    }
    
    @Test
    void methodAdd_addElementByIndex_returnElementIsTwoByIndexTwo() {
        Given:
        list = getList();

        When:
        list.add(1, "newTwo");

        Then:
        assertEquals("two", list.get(2));
    }
    
    @Test
    void methodAdd_addElementByIndex_returnMyArrayListSize() {
        Given:
        list = getList();

        When:
        list.add(1, "newTwo");

        Then:
        assertEquals(4, list.size());
    }
    
    @Test
    void methodSet_replacesElementByIndex_returnElementIsNewTwoByIndexOne() {
        Given:
        list = getList();

        When:
        list.set(1, "newTwo");

        Then:
        assertEquals("newTwo", list.get(1));
    }
    
    @Test
    void methodSet_replacesElementByIndex_returnElementIsThreeByIndexTwo() {
        Given:
        list = getList();

        When:
        list.set(1, "newTwo");

        Then:
        assertEquals("three", list.get(2));
    }
    
    @Test
    void methodSet_replacesElementByIndex_returnMyArrayListSize() {
        Given:
        list = getList();

        When:
        list.set(1, "newTwo");

        Then:
        assertEquals(3, list.size());
    }
    
    @Test
    void methodIndexOf_getIndexByElement_returnIndexZeroByElementIsOne() {
        Given:
        list = getList();

        When:
        list.add("one");

        Then:
        assertEquals(0, list.indexOf("one"));
    }
    
    @Test
    void methodIndexOf_getIndexFromEndByElement_returnIndexThreeByElementIsOne() {
        Given:
        list = getList();

        When:
        list.add("one");

        Then:
        assertEquals(3, list.lastIndexOf("one"));
    }
    
    @Test
    void methodToArray_transformMyArrayListToArray_returnTrueIfListIsArray() {
        Given:
        list = getList();

        When:
        list.toArray();

        Then:
        assertEquals(true, list.toArray().getClass().isArray());
    }
    
    @Test
    void methodToArray_transformMyArrayListToArray_returnTrueIfObjIsArrayOfObject() {
        Given:
        list = getList();
        Object[] obj = list.toArray();

        When:
        list.toArray();

        Then:
        assertEquals(true, obj instanceof Object[]);
    }
    
    private MyList<String> getList() {
        MyList<String> list = new MyArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        return list;
    }

}
