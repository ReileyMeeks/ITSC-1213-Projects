/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ReileyMeeks
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
            throws FileNotFoundException, IOException {
        BookChapter slaughterhouse = BookChapterReadWrite.loadBookChapterFromFile
        ("slaughterhouse_five_chapter_1.txt");
        
        System.out.println(slaughterhouse);
        
        BookChapter got = BookChapterReadWrite.loadBookChapterFromFile
        ("game_of_thrones_chapter_1.txt");
        
        BookChapterReadWrite.writeBookChapterToFile(got, "outPutFile.txt");
    }
}
