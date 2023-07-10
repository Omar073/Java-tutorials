class Book{

    private String name;
    private final int numpages;
    private float price;

    //constructors
    Book (int numpages){
        this.numpages=numpages;
    }
    
    Book (String name, int numpages){
        this.name=name;
        this.numpages=numpages;
    }

    Book(String name, int numpages, float price){
        this.name=name;
        this.numpages=numpages;
        this.price=price;
    }

    //setters and getters
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getNumpages(){
        return this.numpages;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public float getPrice(){
        return this.price;
    }

    void displaybookinfo(){
        System.out.println("\nthe book name is " + name);
        System.out.println("it's number of page(s): " + numpages);
        System.out.println("the book price is " + price + " $");
    }

}