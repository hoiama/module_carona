package br.com.hoiama.angular1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerIndex {

    @RequestMapping(value="/", method= RequestMethod.GET)
    @ResponseBody
    public String getIndex(){
        return "index";
    }
}