package com.courtney;

// Create an off-road vehicle class
class OffRoad extends Vehicle {
    private int groundClearance; // ground clearance in inches

    public OffRoad(int p, int f, int m, int groundClearance) {
        super(p, f, m);
        this.groundClearance = groundClearance;
    }

    // ...
}
