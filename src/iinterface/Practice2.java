package iinterface;
//You are asked to:
//Create an interface → Payment
//Create two classes implementing it:
//CreditCardPayment
//UPIPayment
//Use interface reference like:
//Payment p = new UPIPayment();
public interface Practice2 {
    interface Payment {
        abstract void show();
    }
    class CreditCardPayment implements Payment{
        @Override
        public void show(){
            System.out.println("CreditCardPayment");
        }
    }
    class UPIPayment implements Payment{
        public void show(){
            System.out.println("UPIPayment");
        }
    }


    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.show();//👉 This demonstrates runtime polymorphism

    }
}
