package academy.learnprogramming.controller;

import academy.learnprogramming.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @GetMapping("hello")
    public String hello() {
        log.info("hello() called");
        return ViewNames.HOME;
    }

    @ResponseBody
    @GetMapping("play")
    public String play() {
        log.info("play() called");
        return "play";
    }

}
