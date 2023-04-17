public class TestComputer extends Computer {
    public static void main(String[] args) {

        Computer a = new Computer("Inspiron 1545", "DELL", "April 1, 2020", 2);
        Computer b = new Computer("A2338", "MacBook", "March 31, 2020", 4);
        Computer c = new Computer("Custom PC", "Ryzen", "January 1, 2023", 12);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
