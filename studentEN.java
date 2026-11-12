public class studentEN {
        private int age;
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;

        }
        public void setAge(int a)
        {
            age = a;
        }

        public int getAge(){
            return age;
        }

        public static void main(String[] args) {
            studentEN s = new studentEN();
            s.setName("Mahesh");

            s.setAge(22);

            System.out.println("Name :" +s.getName());
            System.out.println("Age: " + s.getAge());
        }

}
