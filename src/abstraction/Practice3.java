package abstraction;
//Create abstract class FoodOrder:
//Methods:
//selectItems() → abstract
//makePayment() → abstract
//deliver() → concrete
//placeOrder() → final method calling above in sequence
//Child class:
//OnlineFoodOrder
public class Practice3 {
    static abstract class FoodOrder{
        abstract void selectItems();
        abstract void makePayment();
        void delivery(){
            System.out.println("order delivered to customer");
        }
//        we have declared it as a final so that child methods don't change method flow
        final void placeOrder(){
             selectItems();
             makePayment();
             delivery();
        }
    }
    static class OnlineFoodOrder extends FoodOrder{

        @Override
        void selectItems() {
            System.out.println("Item Selected from online menu :");
        }

        @Override
        void makePayment() {
            System.out.println("make payment ");
        }
    }

    public static void main(String[] args) {
        FoodOrder f =new OnlineFoodOrder();
        f.placeOrder();
    }
}
