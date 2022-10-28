package task3;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Title newTitle = new Title();
        Author newAuthor = new Author();
        Content newContent = new Content();

        Scanner entTitle = new Scanner(System.in);
        newTitle.title = entTitle.nextLine();

        Scanner entAuthor = new Scanner(System.in);
        newAuthor.author = entAuthor.nextLine();

        Scanner entContent = new Scanner(System.in);
        newContent.content = entContent.nextLine();

        newTitle.show();
        newAuthor.show();
        newContent.show();

    }

}
