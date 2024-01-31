import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundEx {
    public static void main(String[] args) {
        try{
            File f=new File("D:/DOWNLOADS/Wipro_JSP.pdf");
            FileReader fr = new FileReader(f);
        }catch(FileNotFoundException e){
            System.out.println("file not found here:");
        }
        
    }
}
