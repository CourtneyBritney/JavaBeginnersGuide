package com.courtney;

// Demonstrate when constructors are called.

// Create a super class.
class A {
    A() {
        System.out.println("Constructing A.");
    }
}

// Create a subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Constructing B.");
    }
}

// Create another subclass by extending B.
class C extends B {
    C() {
        System.out.println("Constructing C.");
    }
}
