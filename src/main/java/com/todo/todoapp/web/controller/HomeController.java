package com.todo.todoapp.web.controller;

import com.todo.todoapp.web.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final TestMapper testMapper;

    @GetMapping("/")
    public ModelAndView index(ModelAndView mv) {
        String getTime = testMapper.getTime();

        mv.addObject("time",getTime);
        mv.addObject("msg","Hello Spring!");
        mv.setViewName("/index");
        return mv;
    }
}
