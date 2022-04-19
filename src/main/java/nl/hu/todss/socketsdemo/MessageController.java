package nl.hu.todss.socketsdemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message wut(Message input){
        System.out.println("Hij dut 't!");
        Message output = new Message(input.getSender(), "Output: " + input.getContent());

        return output;
    }
}
