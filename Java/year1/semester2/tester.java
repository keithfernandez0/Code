

public class tester {

    public static void main(String[] args) 
    {
        System.out.println(myMethod(5,8));
    }

    public static int myMethod(int a, int b)
    {
        if (a==1)
            return b;
        else
            return b + myMethod(a-1, b);
    }

}
