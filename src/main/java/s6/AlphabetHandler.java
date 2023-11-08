package s6;

public class AlphabetHandler implements Handler {
    @Override
    public String handleMessage(String message) {
        String messageTest = message.replace(" ", "");
        boolean b = messageTest.matches("[a-яa-Я]+");
        if (b) {
            return message;
        } else {
            return "";
        }
    }
}
