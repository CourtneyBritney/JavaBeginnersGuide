package com.courtney;

class IncompatibleRef {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;
       // Y y = new Y(5);

        x2 = x; // OK, both of same type

        x2 = x2; // Error, not of same type
    }
}
