package innerclass.regularinner;

public class VariableShadowing {
    int x =10;
    class Inner{
        int x = 100;
        public void m6(){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(VariableShadowing.this.x);
        }
    }

    public static void main(String[] args) {
        VariableShadowing v = new VariableShadowing();
        VariableShadowing.Inner i = v.new Inner();
        i.m6();
    }
}
