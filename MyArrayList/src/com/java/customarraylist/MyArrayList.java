package com.java.customarraylist;

import java.util.Arrays;
import java.util.Objects;

/**
 * This data structure is an implementation of {@code MyList}.
 * Inside {@code MyArrayList}, an array is implemented that doubles as it is filled.
 * It can store elements like an array.
 * It can grow in size by adding elements to the end of the array.
 * You can also add by a specific index.
 * {@code MyArrayList} holds elements.
 * {@code MyArrayList} can add items.
 * {@code MyArrayList} can also remove elements, while reducing its size.
 * You can get elements from {@code MyArrayList}, find out the size.
 * Set a specific value to a specific index.
 *
 * @param <E>
 * @see com.java.customarraylist.MyList
 *
 * @author Aleksandr Moroz
 */

public class MyArrayList<E> implements MyList<E> {

    /**
     * Initial capacity
     */
    private static final int INIT_SIZE = 10;

    /**
     * Array whose record and stores elements
     */
    private Object[] initArray;

    /**
     * Element showing array size
     */
    private int arraySize;

    /**
     * Element showing the index of the elements in the array
     */
    private int index;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        initArray = new Object[INIT_SIZE];
    }

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        initArray = new Object[capacity];
    }

    /**
     * This method is implementation method {@code size()} of {@code MyList}
     * Returns count of elements in the custom list.
     *
     * @return this method returns count of elements in the custom list
     */
    @Override
    public int size() {
        return arraySize;
    }

    /**
     * This method is implementation method {@code isEmpty()} of {@code MyList}
     * Returns {@code true}, if this custom list contains no elements
     *
     * @return this method returns {@code true}, if this custom list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return arraySize == 0;
    }

    /**
     * This method is implementation method {@code contains(Object o)} of {@code MyList}
     * Returns {@code true}, if this custom list contains specified element.
     *
     * @param o element whose to be tested
     * @return this method returns (@code true), if this custom list contains no elements
     */
    @Override
    public boolean contains(Object o) {
        for(Object obj : initArray) {
            if(o.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is implementation method {@code toArray()} of {@code MyList}
     * Transforms this custom list to the array in proper sequence.
     * Returns array of objects in proper sequence.
     *
     * @return array of objects in proper sequence
     */
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(initArray, arraySize);
    }

    /**
     * This method is implementation method {@code add(E e)} of {@code MyList}
     * Adds specified elements to the end of custom list.
     * Returns {@code true}, if specified element successfully added.
     *
     * @param e element whose to be added
     * @return {@code true}, if specified element successfully added
     */
    @Override
    public boolean add(E e) {
        if (index >= initArray.length) {
            Object[] newArray = new Object[initArray.length * 2];
            System.arraycopy(initArray, 0, newArray, 0, index - 1);
            initArray = newArray;
        }
        initArray[index] = e;
        index++;
        arraySize++;
        return true;
    }

    /**
     * This method is implementation method {@code remove(Object o)} of {@code MyList}
     * Deletes specified elements from custom list.
     * Returns {@code true}, if specified element successfully deleted.
     *
     * @param e element whose to be deleted
     * @return {@code true}, if specified element successfully deleted
     */
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < arraySize; i++) {
            if (initArray[i].equals(o)) {
                initArray[i] = null;
                System.arraycopy(initArray, i + 1, initArray, i, this.index - i);
                arraySize--;
                index--;
            }
        }
        return true;
    }

    /**
     * This method is implementation method {@code clear()} of {@code MyList}
     * Removes all elements from the list.
     */
    @Override
    public void clear() {
        for (int i = 0; i < arraySize; i++) {
            initArray[i] = null;
        }
        arraySize = 0;
    }

    /**
     * This method is implementation method {@code get(int index)} of {@code MyList}
     * Gets element by index
     * Returns specified element by index from list
     *
     * @param index index by whose specified element will get
     * @return specified element by index from list
     */
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return (E) initArray[index];
    }

    /**
     * This method is implementation method {@code set(int index, E element)} of {@code MyList}
     * Replaces the element at the specified position in this list with the
     * specified element.
     * Returns specified element by index from list
     *
     * @param index index by whose specified element will set
     * @param element element whose will set at the specified position
     * @return the element previously at the specified position
     */
    @SuppressWarnings("unchecked")
    @Override
    public E set(int index, E element) {
        E value = (E) initArray[index];
        initArray[index] = element;
        return value;
    }

    /**
     * This method is implementation method {@code add(int index, E element)} of {@code MyList}
     * Adds specified elements by spicified index.
     * Also Shifts the element currently at that position and any subsequent elements to the right.
     *
     * @param index index by whose specified element will add
     * @param e element whose to be added
     */
    @Override
    public void add(int index, E element) {
        if (index >= initArray.length) {
            Object[] newArray = new Object[initArray.length * 2];
            System.arraycopy(initArray, 0, newArray, 0, index - 1);
            initArray = newArray;
        }
        Object temp = initArray[index];
        initArray[index] = element;

        for (int i = index; i < arraySize; i++) {
            Object temp2 = initArray[i + 1];
            initArray[i + 1] = temp;
            temp = temp2;
        }
        arraySize++;
        this.index++;
    }

    /**
     * This method is implementation method {@code remove(int index)} of {@code MyList}
     * Adds specified elements by specified index.
     * Returns the element at this position.
     *
     * @param index index by whose specified element will delete
     * @return the element at this position.
     */
    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        System.arraycopy(initArray, index + 1, initArray, index, this.index - index);
        arraySize--;
        this.index--;
        return (E) initArray[index];
    }

    /**
     * This method is implementation method {@code indexOf(Object o)} of {@code MyList}
     * Gets the index of a specified element.
     * Returns the index of a specified element,
     * if {@code MyArrayList} don't contain element, returns -1.
     *
     * @param o the element to get the index
     * @return the index of a specified element,
     * if {@code MyArrayList} don't contain element, returns -1.
     */
    @Override
    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < arraySize; i++) {
                if (o.equals(initArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * This method is implementation method {@code lastIndexOf(Object o)} of {@code MyList}
     * Gets the index of a specified element from the end.
     * Returns the index of a specified element from the end,
     * if {@code MyArrayList} don't contain element, returns -1.
     *
     * @param o the element to get the index from the end
     * @return the index of a specified element from the end,
     * if {@code MyArrayList} don't contain element, returns -1.
     */
    @Override
    public int lastIndexOf(Object o) {
        for (int i = arraySize - 1; i >= 0; i--) {
            if (o.equals(initArray[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return arraySize == that.arraySize &&
                index == that.index &&
                Arrays.equals(initArray, that.initArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arraySize, index);
        result = 31 * result + Arrays.hashCode(initArray);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(initArray);
    }

}
