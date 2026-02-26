package string;

final public class OwnImmutableClass {
    private int i =10;
    OwnImmutableClass(int i){
        this.i = this.i;
    }
    public OwnImmutableClass modify(int i){
        if(this.i == i){
            return this;
        }else{
            return new OwnImmutableClass(i);
        }
    }

    public static void main(String[] args) {
        OwnImmutableClass o = new OwnImmutableClass(10);
        OwnImmutableClass o1 = o.modify(100);
        OwnImmutableClass o2 = o.modify(10);
        System.out.println(o==o1);
        System.out.println(o==o2);

    }
}
