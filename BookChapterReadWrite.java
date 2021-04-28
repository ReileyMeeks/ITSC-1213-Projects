/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author ReileyMeeks
 */
public class BookChapterReadWrite {

    public static BookChapter loadBookChapterFromFile(String filename)
            throws FileNotFoundException, IOException {
        FileInputStream fileByteStream = null;
        Scanner fileInput = null;

        fileByteStream = new FileInputStream(filename);
        fileInput = new Scanner(fileByteStream);

        String title = fileInput.nextLine();
        String author = fileInput.nextLine();

        int linePerPage = fileInput.nextInt();

        ArrayList<String> lines = new ArrayList<>();
        
        while (fileInput.hasNext()) {

            lines.add(fileInput.nextLine());
        }
        ArrayList<Page> pages = new ArrayList<>();

        int pageCount = lines.size() / linePerPage;
        int rLines = lines.size() % linePerPage;

        for (int i = 0; i < pageCount; i++) {
            Page page = new Page(linePerPage);
            pages.add(page);
        }
        if (rLines != 0) {
            Page lastPage = new Page(rLines);
            pages.add(lastPage);
        }
        int lineCount = 0;
        for (int i = 0; i < pageCount; i++) {
            for (int j = 0; j < linePerPage; j++) {
                pages.get(i).getLines()[j] = lines.get(lineCount);
                lineCount++;
            }
        }
        for (int i = 0; lineCount < lines.size(); i++) {
            pages.get(pageCount).getLines()[i] = lines.get(lineCount);
            lineCount++;
        }

        BookChapter bookChapter = new BookChapter(linePerPage, pages, title, author);

        fileByteStream.close();
        fileInput.close();
        return bookChapter;
    }
    
    public static Page getPage(Scanner scanner, int numLines){
        String[] lines = new String[numLines];
        for(int i = 0; i < numLines; i++){
            lines[i] = scanner.nextLine();
        }
        return new Page(lines);
    }

    public static void writeBookChapterToFile(BookChapter book, String filename)
            throws FileNotFoundException, IOException {
        FileOutputStream fileByteStream = null;
        PrintWriter output = null;

        fileByteStream = new FileOutputStream(filename);
        output = new PrintWriter(fileByteStream);

        output.println(book.getTitle());
        output.println(book.getAuthor());
        output.print(book.getLinesPerPage());

        for (int i = 0; i < book.getPages().size(); i++) {
            for (int j = 0; j < book.getPages().get(i).getLines().length; j++) {
                output.println(book.getPages().get(i).getLines()[j]);
            }
        }
        output.close();
    }
}
