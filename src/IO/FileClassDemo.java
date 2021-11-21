package IO;
import java.io.File;

public class FileClassDemo {


    public static void main(String[] args) {

        // Absolute path -> full path to the file -> C:\Users\Nuclues\Desktop\files\document.txt
        // Relative path -> relative path in relation to current working directory -> document.txt
        // C:\Users\Nuclues\IdeaProjects\June17\document2.txt

        File file = new File("C:/Users/Nuclues/Desktop/files/document.txt");
        // File object represents a path to a file/folder
        System.out.println(file.exists());


        File file3 = new File("C:/Users/Nuclues/Desktop/files/document3.txt");
        System.out.println(file3.exists());

        File folder = new File("C:/Users/Nuclues/Desktop/files");
        System.out.println(folder.exists());
        File folder2 = new File("C:/Users/Nuclues/Desktop/files2");
        System.out.println(folder2.exists());

        System.out.println(file.isFile());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

//        file.renameTo(new File("C:/Users/Nuclues/Desktop/files/text.txt"));

        System.out.println(file.delete());

    }
}
