package semester2.p1;

public class C1 {

    // Data fields
    public int x = 2;
    protected int y = 3 ;
    int z = 1;
    private int u = 5;

    public void m1(){
        System.out.println("Public method m1");
    }

    protected void m2() {
        System.out.println("Protected method m2");
    }

    void m3() {
        System.out.println("Default method m3");
    }

    private void m4() {
        System.out.println("Private method m4");
    }
    public static void main(String[] args) {
        
        // Objects
        C1 obj = new C1(); // default constructor
        System.out.println(obj.u);
        System.out.println(obj.y);
        System.out.println(obj.x);
        System.out.println(obj.z);

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();

    }
}
