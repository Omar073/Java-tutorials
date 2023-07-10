import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.print("enter author name: ");
        String authname = scanner.nextLine();
        
        Author author = new Author(authname); // we have one author that has 3 books

        for(int i = 0; i<3; i++){
            System.out.println("\nBook number " + (i+1) + ": ");
            System.out.print("Enter book name: ");
            String bname = scanner.nextLine();
            System.out.print("Enter Number of pages: ");
            int bnumpage = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter book price: ");
            float bprice = Float.parseFloat(scanner.nextLine());

            Book Nbook = new Book(bname, bnumpage, bprice);
            Nbook.displaybookinfo();
            author.addbook(Nbook, i);
        }
        
        author.displaybooksdata();
        System.out.print("Enter the name of the book you want to find: ");
        String key = scanner.nextLine();
        Book foundB = author.search_book(key);

        //display found book
        foundB.displaybookinfo();

        scanner.close();
    }
}


