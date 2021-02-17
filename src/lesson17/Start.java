package lesson17;

public class Start {
    public static void main(String[] args) {
        Monitoring alert = new Monitoring()
        {
            @Override
            public String monitor(String n)
            {
                System.out.println("some error masagge");
                return "alert";
            }
        };
    }

    private static void exemple(String s){
        class Test{
            private int i;

            Test(int i){
                this.i = i;
            }

            public void print(){
                System.out.println(s + " - number" + i);
            }
        }

        Test test = new Test(3);
        test.print();
    }
}
