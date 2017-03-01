package dip.lab3.student.solution1;

/**
 *
 * @author Benjamin
 */
public class Startup {
    public static void main(String[] args) {

        
        Input input = new KeyboardMessage();
        Output output = new ConsoleMessage();
        Input input1 = new KeyboardMessage();
        Output output1 = new GuiMessage();
        MessageService service = new MessageService(input, output);
        service.displayMessage();
        MessageService service1 = new MessageService(input1,output1);
        service1.displayMessage();
    }
}
