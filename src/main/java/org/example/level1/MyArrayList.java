package org.example.level1;

import java.util.*;

public class MyArrayList implements MyIntList {
    private int size = 0;
    private int capacity = 16;
    private int[] list = new int[0];

    public void MyArrayList(){
        this.size = 0;
        list = new int[capacity];
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(list[0]);
        for (int i = 0; i < size; i++){
            result.append(", ").append(list[i]);
        }
        result.append("]");
        return result.toString();
    }
    @Override
    public boolean equals(MyArrayList myArrayList) {
        if (size != myArrayList.size()) return false;
        for (int i = 0; i < size; i++) {
            if (list[i] != myArrayList.get(i)) return false;
        }
        return true;
    }
    @Override
    public void clear(){
        size = 0;
        for (int i = 0; i < size; i++){
            list[i] = 0;
        }
    }
    @Override
    public void addAll(MyArrayList myArrayList) {
        if (capacity < size + myArrayList.size()){
            capacity = Math.max((int) (list.length * 1.5), size + myArrayList.size());
            int[] newList = new int[capacity];

            for (int i = 0; i < size; i++){
                newList[i] = list[i];
            }
            list = newList;
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            list[size + i] = myArrayList.get(i);
        }
        size += myArrayList.size();
    }
    @Override
    public int get(int i) {
        if (i > -1 && i < size) return list[i];
        throw new RuntimeException();
    }
    @Override
    public void add(int x) {
        size++;
        if (capacity < size) {

            //TODO
        }
        list[size] = x;
    }
    @Override
    public void remove(int i){
        if (i > -1 && i < size) {
            for (int j = i; j < size; j++) list[j] = list[j+1];
        }
        else throw new RuntimeException();
    }
    @Override
    public void delete(int x){
        for (int i = 0; i < size; i++) {
            if (list[i] == x) {
                remove(i);
                break;
            }
        }
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void set(int x, int i) {
        if (i > -1 && i < size) list[i] = x;
        else throw new RuntimeException();
    }
}

