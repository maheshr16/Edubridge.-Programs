import java.io.FileReader;
import java.io.FileNotFoundException;
class main {
    public static void main(String[] args){
        try{
            FileReader file = new FileReader("data.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

}
