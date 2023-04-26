package HW6;
import java.time.*;
import java.time.format.DateTimeFormatter;

public interface Timer {
    
    public String howToChangeWatchTime();

    public default String getCurrentTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
