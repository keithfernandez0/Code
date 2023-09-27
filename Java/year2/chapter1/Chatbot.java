package Java.year2.chapter1;
import java.time.LocalDate;

// ====================================================================================

public class Chatbot 
{
    private String name;
    private double version;
    private LocalDate lastUpdate;
    String[] supportedLanguages;
    private String author;
    private Mood mood;
    public static int numOfBotsCreated;

    enum Mood 
    {
        HAPPY, ANGRY, SAD, NEUTRAL;
    }

    // ====================================================================================

    // GETTER AND SETTER CONSTRUCTORS

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getVersion() 
    {
        return version;
    }

    public void setVersion(double version) 
    {
        this.version = version;
    }

    public LocalDate getLastUpdate() 
    {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) 
    {
        this.lastUpdate = lastUpdate;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }
    public Mood getMood() 
    {
        return mood;
    }

    public void setMood(Mood mood) 
    {
        this.mood = mood;
    }

    public static int getNumOfBotsCreated() 
    {
        return numOfBotsCreated;
    }

    public static void setNumOfBotsCreated(int numOfBotsCreated) 
    {
        Chatbot.numOfBotsCreated = numOfBotsCreated;
    }

    // ====================================================================================

    public Chatbot() 
    {
        super();
    }

    public String[] getSupportedLanguages() 
    {
        return supportedLanguages;
    }

    public void setSupportedLanguages(String[] supportedLanguages) 
    {
        this.supportedLanguages = supportedLanguages;
    }

    /**
     * @param name
     * @param version
     */

    public Chatbot(String name, double version) 
    {
        super();
        this.name = name;
        this.version = version;
    }

    public Chatbot(String name, double version, LocalDate lastUpdate, String[] supportedLanguages, String author, Mood mood) 
        {
        super();
        this.name = name;
        this.version = version;
        this.lastUpdate = lastUpdate;
        this.supportedLanguages = supportedLanguages;
        this.author = author;
        this.mood = mood;
        }

    public static int getGetNumOfBotsCreated() 
    {
        return numOfBotsCreated;
    }

    // ====================================================================================

    /**
     * @param name
     * @param version
     * @param lastUpdate
     * @param supportedLanguages
     * @param author
     * @param mood
     */

     // ====================================================================================

    String greet() 
    {
        return switch (mood) 
        {
        case HAPPY ->
        "Hello! I'm " + name + " version " + version +
        ", developed by " + author +
        ". It's a great day! How can I assist you?";

        case SAD ->
        "Hello. I'm " + name + " version " + version +
        ", developed by " + author + ". How can I help you today? ";

        case ANGRY ->
        "What do you want? I'm " + name + " version " +
        version + ", developed by " + author + ".";

        default -> // NEUTRAL
        "Hello! I'm " + name + " version " + version +
        ", developed by " + author + ". How can I assist you today? ";
        };
    }

    public String respond(String userMessage) 
    {
        return userMessage.contains("hello") ? "Hello there!" :
            userMessage.contains("how are you") ?
            respond() :
            "I'm sorry, I don't understand that. Can you rephrase? ";
    }

    private String respond() 
    {
        return switch (mood) {
        case HAPPY -> "I'm feeling great! How can I help you?";
        case SAD -> "I'm a bit down. What can I assist with?";
        case ANGRY -> "What now!?";
        default -> "I'm just a program, so I don't have feelings, " +
        "but I'm functioning properly. What can I do for you? ";
        };
    }

    // ====================================================================================

    public class TestBot 
    {
        public static void main(String[] args)
        {
            String[] languages1 = {"English", "Spanish", "Arabic", "Mandarin"};
            String[] languages2 = {"Russian", "French", "Portugese", "Korean"};
            LocalDate today = LocalDate.of(2023, 9, 11);

            Chatbot bot1 = new Chatbot("ChatGPT Turbo", 2.0, today, languages1, "OpenAI", Mood.HAPPY);
            Chatbot bot2 = new Chatbot("Bard", 1.6, today, languages2, "Google", Mood.SAD);

            System.out.println("\n");
            System.out.println(bot1.greet() + "\n");
            System.out.println(bot2.greet());
            System.out.println("\n");

        }
    }
}