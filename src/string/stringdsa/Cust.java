package string.stringdsa;

final public class Cust {
    private int i ;
    Cust(int i){
        this.i=i;
    }
    public Cust modify(int i ){
        if(this.i==i){
            return this;
        }else{
            return new Cust(i);
        }
    }
}
