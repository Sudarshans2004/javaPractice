package iinterface;

interface AdapterClass {
    void show();
    void bow();
    void mow();
}

abstract class Adapter implements AdapterClass {
    public void show() {}
    public void bow() {}
    public void mow() {}
}

class Test extends Adapter {
    public void mow() {
        System.out.println("Adapter Class Example");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.mow();
    }
}
