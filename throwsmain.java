import java.io.IOException;
public class throwsmain {
    static void test() throws IOException{
        throw new IOException("File Error");
    }
    public static void main(String[] args){
        try{
            test();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
