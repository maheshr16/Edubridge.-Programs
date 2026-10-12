public class point {
    int x , y;

    point(int x,int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("point: ("+x+","+y+")");
    }
    public static void main(String[] args){
        point p1 = new point(10,20);
        point p2 = new point(30,40);

        p1.display();
        p2.display();
    }

}
