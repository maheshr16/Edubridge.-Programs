public class textBuilder {
    String text = " ";

    textBuilder add(String part){
        text += part;
        return this;
    }
    public static void main(String[] args){
        textBuilder t = new textBuilder();
        t.add("Hello").add(" ").add("world");
        System.out.println(t.text);
    }
}
