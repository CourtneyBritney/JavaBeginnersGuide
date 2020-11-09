package com.courtney;

// A superclass reference can refer to a subclass object.
class X {
    int a;

    X(int i) { a = i; }
}

class Y extends X {
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}
