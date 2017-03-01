package dip.lab3.student.solution1;



/**
 *
 * @author Benjamin
 */
public class MessageService {
    private Input input;
    private Output output;

    public MessageService(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void displayMessage(){
        output.sendMessage(input);
    }
    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }
          
}
