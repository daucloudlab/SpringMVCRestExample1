package kz.kazntu.lessons.controllers;
/**
 * http://websystique.com/springmvc/spring-4-mvc-rest-service-example-using-restcontroller/
 */
import kz.kazntu.lessons.models.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player){
        Message msg = new Message(player, "Hello " + player) ;
        return msg ;
    }
}
