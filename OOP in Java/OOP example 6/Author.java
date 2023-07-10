class Author{

    private final String name;
    private Book[] books = new Book[3];

    //constructor
    Author(String name){
        this.name=name;
    }

    String getname(){
        return name;
    }

    void addbook(Book Nbook, int i){
        books[i] = Nbook;
    }

    Book search_book(String key){
        Book foundBook = null;

        for(int i = 0; i<3; i++){
            if(books[i] != null && books[i].getName().equals(key)){
                foundBook = books[i];
            }
        }
        return foundBook;
    }

    void displaybooksdata(){
        for(int i = 0; i<3; i++){
            System.out.println("\n\nBook name: " + books[i].getName());
            System.out.println("Number of page(s): " + books[i].getNumpages());
            System.out.println("Book price: " + books[i].getPrice() + " $");
        }
    }

}