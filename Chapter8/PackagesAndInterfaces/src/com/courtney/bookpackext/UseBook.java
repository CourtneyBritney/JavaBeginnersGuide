package com.courtney.bookpackext;

// Use the Book Class from bookpack.
class UseBook {
    public static void main(String args[]) {
        com.courtney.bookpack.Book books[] = new com.courtney.bookpack.Book[5];

        books[0] = new com.courtney.bookpack.Book("Java: A Beginner's Guide",
                "Schildt", 2019);
        books[1] = new com.courtney.bookpack.Book("Java: The Complete Reference",
                "Schildt", 2019);
        books[2] = new com.courtney.bookpack.Book("Introducing JavaFX 8 Programming",
                "Schildt", 2015);
        books[3] = new com.courtney.bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new com.courtney.bookpack.Book("On the Road",
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}
