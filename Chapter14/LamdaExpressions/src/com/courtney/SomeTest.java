package com.courtney;

// Use a generic functional interface.

// A generic functional interface with two parameters
// that returns a boolean result.
interface SomeTest<T> {
    boolean test(T n, T m);
}
