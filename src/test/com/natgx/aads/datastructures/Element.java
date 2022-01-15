package com.natgx.aads.datastructures;

import java.util.Objects;
import java.util.UUID;

public class Element {

    private final UUID mId;
    private final String mName;

    public Element(String name) {
        mId = UUID.randomUUID();
        mName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(mId, element.mId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId);
    }

    @Override
    public String toString() {
        return "Element[" + mName + "]";
    }

}
