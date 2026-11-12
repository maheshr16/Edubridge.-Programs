class rectangle{
    int lenght;
    int breath;

    void calculateArea() {
        int Area = lenght * breath;

        System.out.println("Area of rectangle =" + Area);
    }

        public static void main(String[] args){
            rectangle r = new rectangle();
            r.lenght = 10;
            r.breath = 5;
            r.calculateArea();
        }

}
