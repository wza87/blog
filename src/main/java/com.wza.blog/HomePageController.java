package com.wza.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {

  @RequestMapping("/")
  public String Index() {
    return "index";
  }

}