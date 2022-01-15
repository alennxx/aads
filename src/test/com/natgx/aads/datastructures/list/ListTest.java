package com.natgx.aads.datastructures.list;

import com.natgx.aads.datastructures.Element;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class ListTest {

    abstract List<Element> createEmptyList();

    @Test
    void shouldCreateList() {
        List<Element> list = createEmptyList();

        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    void shouldAddElement() {
        List<Element> list = createEmptyList();
        Element element = new Element("first element");

        list.add(element);

        assertEquals(1, list.size());
        assertTrue(list.contains(element));
    }

    @Test
    @Disabled
    void shouldAddElementAtIndex() {

    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenElementIsAddedWithNegativeIndex() {
        fail();
    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenElementIsAddedWithIndexBiggerThanSize() {

    }

    @Test
    @Disabled
    void shouldReturnTrueWhenListContainsElement() {

    }

    @Test
    @Disabled
    void shouldReturnFalseWhenListDoesNotContainElement() {

    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenNullIsPassedToContains() {

    }

    @Test
    @Disabled
    void shouldGetElementByIndex() {

    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenIndexToGetElementIsNegative() {

    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenIndexToGetElementIsBiggerThanSize() {

    }

    @Test
    @Disabled
    void shouldRemoveElementByIndex() {

    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenIndexToRemoveElementIsNegative() {

    }

    @Test
    @Disabled
    void shouldThrowExceptionWhenIndexToRemoveElementIsBiggerThanSize() {

    }

    @Test
    @Disabled
    void shouldReturnSizeOfList() {

    }


}
