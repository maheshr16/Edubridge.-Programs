interface greeting {
    default void sayhello(){
        printmessage("hello");
    }
    private void printmessage(String message){
        System.out.println(message);
    }
}
class student implements greeting{
    public static void main(String[] args){
        student s = new student();
        s.sayhello();
    }
}
