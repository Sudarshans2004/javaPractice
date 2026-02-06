package iinterface;

public interface VariableNamingConf {

    interface a {
        int a =20;
    }
    interface b {
        int a =10;
    }

    public static void main(String[] args) {
//         we can access variable from interface name
        System.out.println(a.a);

    }
}
