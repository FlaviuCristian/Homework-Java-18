import java.util.Arrays;

public class Library {

    private Book[] books;

    private int getPositionOfBookInList(Book bookToBeSearched) {
        for (int i = 0; i < books.length; i++) {

            if (books[i].getName().equals(bookToBeSearched.getName())) {
                return i;
            }
        }
        return -1;
    }

    private boolean existInLibrary(Book bookToBeSearched) {
        final int positionOfBookInList = getPositionOfBookInList(bookToBeSearched);
        return positionOfBookInList != -1;
    }

    public void addToLibrary(Book book) {

        if (this.books == null) {
            books = new Book[]{book};
        } else {

            if (!existInLibrary(book)) {
                final int numberOfBooks = this.books.length;

                final Book[] newListOfBooks = Arrays.copyOf(this.books, numberOfBooks + 1);

                newListOfBooks[numberOfBooks] = book;
                System.out.println("Am adaugat cartea " + book);

                books = newListOfBooks;
            }
        }
    }

    public void deleteFromLibrary(Book book) {
        if (existInLibrary(book)) {
            final int sizeOfNewList = books.length - 1;
            Book[] newList = new Book[sizeOfNewList];
            final int positionOfBookToBeDeleted = getPositionOfBookInList(book);

            System.arraycopy(books, 0, newList, 0, positionOfBookToBeDeleted - 1);

            System.arraycopy(books, positionOfBookToBeDeleted, newList, positionOfBookToBeDeleted - 1,
                    books.length - positionOfBookToBeDeleted);
            System.out.println("Am sters cartea.");

            books = newList;
        }
    }

    public void listFromLibrary() {
        if (books == null) {
            System.out.println("Biblioteca e goala");
        } else {
            System.out.println("Lista de carti din biblioteca e:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}