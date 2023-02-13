package semester2;
public class lab {
    public static void main(String[] args) {

        int rate = 45;
        int frequency = 2;

        for (int i=7; i>=1;  i--) 
        {
            rate -= 2;
            frequency = (rate*2) + 1;

            System.out.println("Rate: " + rate);
            System.out.println("Frequency: " + frequency);
        }

        int pay = 50;
        double days = 0;
        int hours = 5;
        int totalHours = 0;
        int totalPay = 0;

        do {
            totalHours += hours;
            totalPay += pay * hours;
            days += 1.5;

            System.out.println("Total hours: " + totalHours);
            System.out.println("Total pay: " + totalPay);
            System.out.println("Days: " + days);

        } while(days < 6);

        String word = "A";
        int count = 10;
        int code = 85;

        while(count != 0)
        {
            word += (char)code;
            code -= 4;
            count -= 2;

            System.out.println("Word: " + word);
            System.out.println("Code: " + code);
            System.out.println("Count: " + count);
           
        }

    }
}