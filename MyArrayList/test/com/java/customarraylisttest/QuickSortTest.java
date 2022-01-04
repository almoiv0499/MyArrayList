package com.java.customarraylisttest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

import com.java.customarraylist.MyArrayList;
import com.java.customarraylist.MyList;
import com.java.customarraylist.QuickSort;

public class QuickSortTest {

    @Rule
    private MyList<String> listStr;
    private MyList<Double> listDoub;
    private MyList<Integer> listInt;
    private MyList<Character> listChar;
    private MyList<Person> listPerson;

    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByString_returnSortedMyArrayList() {
        Given: listStr = getListString();

        When: QuickSort.quicksort(listStr);

        Then: assertEquals("[abc, bca, cba]", Arrays.toString(listStr.toArray()));

    }
    
    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByDouble_returnSortedMyArrayList() {
        Given: listDoub = getListDouble();
        
        When: QuickSort.quicksort(listDoub);
        
        Then: assertEquals("[2.76, 5.29, 10.09]", Arrays.toString(listDoub.toArray()));
    }
    
    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByInteger_returnSortedMyArrayList() {
        Given: listInt = getListInteger();
        
        When: QuickSort.quicksort(listInt);
        
        Then: assertEquals("[2, 4, 6]", Arrays.toString(listInt.toArray()));
    }
    
    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByCharacter_returnSortedMyArrayList() {
        Given: listChar = getListCharacter();

        When: QuickSort.quicksort(listChar);

        Then: assertEquals("[a, b, c]", Arrays.toString(listChar.toArray()));

    }
    
    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByPersonAge_returnSortedMyArrayList() {
        Given: listPerson = getListPersonSortByAge();
        
        When: QuickSort.quicksort(listPerson);
        
        Then: assertEquals("[Barbara Baboshina 4, "
                + "Nikita Moroz 18, "
                + "Alex Moroz 22]", Arrays.toString(listPerson.toArray()));
    }
    
    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByPersonLastName_returnSortedMyArrayList() {
        Given: listPerson = getListPersonSortByLastName();
        
        When: QuickSort.quicksort(listPerson);
        
        Then: assertEquals("[Nikita Moroz 18, "
                + "Barbara Baboshina 22, "
                + "Alex Moroz 22]", Arrays.toString(listPerson.toArray()));
    }
    
    @SuppressWarnings("unused")
    @Test
    void methodQuickSort_sortMyArrayListByPersonFirstName_returnSortedMyArrayList() {
        Given: listPerson = getListPersonSortByFirstName();
        
        When: QuickSort.quicksort(listPerson);
        
        
        Then: assertEquals("[Barbara Baboshina 4, "
                + "Alex Moroz 22, "
                + "Nikita Moroz 22]", Arrays.toString(listPerson.toArray()));
    }

    private MyList<String> getListString() {
        MyList<String> list = new MyArrayList<>();
        list.add("abc");
        list.add("bca");
        list.add("cba");
        return list;
    }
    
    private MyList<Double> getListDouble() {
        MyList<Double> list = new MyArrayList<>();
        list.add(10.09);
        list.add(5.29);
        list.add(2.76);
        return list;
    }
    
    private MyList<Integer> getListInteger() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(6);
        list.add(2);
        list.add(4);
        return list;
    }
    
    private MyList<Character> getListCharacter() {
        MyList<Character> list = new MyArrayList<>();
        list.add('b');
        list.add('c');
        list.add('a');
        return list;
    }

    private MyList<Person> getListPersonSortByAge() {
        MyList<Person> list = new MyArrayList<>();
        list.add(new Person("Alex", "Moroz", 22));
        list.add(new Person("Nikita", "Moroz", 18));
        list.add(new Person("Barbara", "Baboshina", 4));
        return list;
    }
    
    private MyList<Person> getListPersonSortByLastName() {
        MyList<Person> list = new MyArrayList<>();
        list.add(new Person("Alex", "Moroz", 22));
        list.add(new Person("Nikita", "Moroz", 18));
        list.add(new Person("Barbara", "Baboshina", 22));
        return list;
    }
    
    private MyList<Person> getListPersonSortByFirstName() {
        MyList<Person> list = new MyArrayList<>();
        list.add(new Person("Alex", "Moroz", 22));
        list.add(new Person("Nikita", "Moroz", 22));
        list.add(new Person("Barbara", "Baboshina", 4));
        return list;
    }

}
