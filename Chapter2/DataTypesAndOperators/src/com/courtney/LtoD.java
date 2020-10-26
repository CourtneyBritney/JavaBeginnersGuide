package com.courtney;

// Demonstrate automatic conversion from long to double.

public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;      // Automatic conversion from long to double
        // Can't convert from Double to Long

        System.out.println("L and D: " + L + " " + D);
    }
}
