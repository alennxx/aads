package com.natgx.aads.datastructures.list;

import com.natgx.aads.datastructures.Element;

class ArrayListTest extends ListTest {

    @Override
    List<Element> createEmptyList() {
        return new ArrayList<>();
    }

}
