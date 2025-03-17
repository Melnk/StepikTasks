package org.example.level1;

public interface MyIntList {
    int get(int i);
    void add(int x);
    void remove(int i);
    void delete(int x);
    int size();
    void set(int x, int i);
    String toString();
    boolean equals(MyArrayList m);
    void clear();
    void addAll(MyArrayList m);
    int hashCode();
}
