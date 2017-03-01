package dip.lab3.student.solution1;

/**
 *
 * @author Benjamin
 */
public class ConsoleMessage implements Output{
    // This class has only one responsibility: take the message from the MessageReader object and display to the console
    @Override
    public final void sendMessage(final Input msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getMessage());
    }
}
