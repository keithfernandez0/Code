public class string {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        String string2 = "Course";
        System.out.println("The first character in message is: " + message.charAt(0));
        System.out.println("The length of the message is:  " + message.length()); 
        System.out.println("Substring: " + message.substring(0, 7));
        System.out.println(message.concat(string2));
        String string3 = "Mean";
        System.out.println(string3.replace('M', 'K'));

        
        
    
    }
    
}
