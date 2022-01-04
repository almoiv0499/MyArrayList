package com.java.customarraylist;

/**
 * This collection is its own {@code List} implementation.
 * As it fills, it can grows in size.
 * My list contains specified elements.
 * My list can adds elements.
 * The list can also removes elements, while reducing its size.
 * Can gets items from the collection, finds out the size.
 * Sets a specific value to a specific index.
 *
* @param <T> type of objects in the custom list
*
* @author Aleksandr Moroz
 */


public interface MyList<T> {

        /**
         * This method returns count of elements in the custom list.
         *
         * @return this method returns count of elements in the custom list
         */
        public int size();

        /**
         * This method returns {@code true}, if this custom list contains no elements
         *
         * @return this method returns {@code true}, if this custom list contains no elements
         */
        public boolean isEmpty();

        /**
         * This method returns {@code true}, if this custom list contains specified element.
         *
         * @param o element whose to be tested
         * @return this method returns (@code true), if this custom list contains no elements
         */
        public boolean contains(Object o);

        /**
         * This method transforms this custom list to the array in proper sequence.
         * Returns array of objects in proper sequence.
         *
         * @return array of objects in proper sequence
         */
        public Object[] toArray();

        /**
         * This method adds specified elements to the end of custom list.
         * Returns {@code true}, if specified element successfully added.
         *
         * @param e element whose to be added
         * @return {@code true}, if specified element successfully added
         */
        public boolean add(T e);

        /**
         * This method deletes specified elements from custom list.
         * Returns {@code true}, if specified element successfully deleted.
         *
         * @param e element whose to be deleted
         * @return {@code true}, if specified element successfully deleted
         */
        public boolean remove(Object o);

        /**
         * This method removes all elements from the list.
         */
        public void clear();

        /**
         * This method gets element by index
         * Returns specified element by index from list
         *
         * @param index index by whose specified element will get
         * @return specified element by index from list
         */
        public T get(int index);

        /**
         * This method replaces the element at the specified position in this list with the
         * specified element.
         * Returns specified element by index from list
         *
         * @param index index by whose specified element will set
         * @param element element whose will set at the specified position
         * @return the element previously at the specified position
         */
        public T set(int index, T element);

        /**
         * This method adds specified elements by spicified index.
         * Also Shifts the element currently at that position and any subsequent elements to the right.
         *
         * @param index index by whose specified element will add
         * @param e element whose to be added
         */
        public void add(int index, T element);

        /**
         * This method adds specified elements by spicified index.
         * Returns the element at this position.
         *
         * @param index index by whose specified element will delete
         * @return the element at this position.
         */
        public T remove(int index);

        /**
         * This method gets the index of a specified element.
         * Returns the index of a specified element.
         *
         * @param o the element to get the index
         * @return the index of a specified element.
         */
        public int indexOf(Object o);

        /**
         * This method gets the index of a specified element from the end.
         * Returns the index of a specified element from the end.
         *
         * @param o the element to get the index from the end
         * @return the index of a specified element from the end.
         */
        public int lastIndexOf(Object o);

        public boolean equals(Object o);

        public int hashCode();

}
