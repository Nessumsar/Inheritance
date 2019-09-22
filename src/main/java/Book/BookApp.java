package Book;

public class BookApp{


    public static void main(String[] args) {
       ChildBook CooltÄventyr =  new ChildBook("Lukas", 2006, "Cool", "Coolt äventyr");
       Book TråkigtÄventyr = new Book("Lukas", 2002, "Ocool", "Tråkigt äventyr", 1.00, 250);
       AdultBook KändBok = new AdultBook("Josef", 1920,"Ikonisk", "Känd bok.exe", 10.00, 800);

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
