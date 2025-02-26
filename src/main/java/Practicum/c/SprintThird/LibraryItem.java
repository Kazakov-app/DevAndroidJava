package Practicum.c.SprintThird;

abstract class LibraryItem {
    String title;
    String text;
    String owner;
    String library;

    public void read() {
        System.out.println("Читаем:");
        System.out.println(title);
        System.out.println(text);
    }

/*

    public void takeFromLibrary(String newOwnerName) {
        owner = newOwnerName;
    }

    public void returnToLibrary() {
        owner = "";
    }

    public String getCurrentLibrary() {
        return library;
    }

    public void moveToNewLibrary(String libraryName) {
        library = libraryName;
    }
}
*/
interface Transportable{
    String getCurrentLibrary();
    void moveToNewLibrary(String libraryName);
}
interface Ownable{
    void takeFromLibrary(String newOwnerName);
    void returnToLibrary();
}
class Book extends LibraryItem implements Transportable,Ownable {
    public Book() {
    }

    @Override
    public String getCurrentLibrary() {
        return library;
    }

    @Override
    public void moveToNewLibrary(String libraryName) {
        library = libraryName;
    }
    @Override
    public void takeFromLibrary(String newOwnerName) {
        owner = newOwnerName;
    }

    @Override
    public void returnToLibrary() {
        owner = "";
    }
}

}

class Journal extends LibraryItem {
    public Journal() {
    }

    @Override
    public void read() {
        super.read();
    }
}

class EBook extends LibraryItem {
    public EBook() {
    }

    @Override
    public void read() {
        super.read();
    }
}
