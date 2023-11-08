package s6;

public class LowerCaseHandler implements Handler {

    @Override
    public String handleMessage(String message) {
        if(message.isEmpty() && message.isBlank()) return "";
        message = message.trim().toLowerCase();
        return message;
    }
}
