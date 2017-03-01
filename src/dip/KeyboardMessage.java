package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class KeyboardMessage implements Input{
    
    @Override
    public Message getMessage() {
        Scanner input = new Scanner(System.in);
        String rawMsg = input.nextLine();
        Message msg = new Message(rawMsg);
        return msg;
    }
}
