package semester2;

public class newproj {

    public static void main(String[] args) {
        C1 obj = new C1();

        System.out.println("Access X: " + obj.x);
        System.out.println("Access Y: " + obj.y);
        System.out.println("Access Z: " + obj.z);
    }

    public class C1 {
        public int x = 1;
        int y = 4;
        private int z = 5;

        // methods

        public void m1()
        {
            System.out.println("Public method");
        }

        void m2()
        {
            System.out.println("Default method");
        }

        private void m3()
        {
            System.out.println("Private method");
        }
    }
    
}
