package com.wza.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AboutController {

  @RequestMapping("/about")
  public String About(Model model) {
    String pageTitle = "About";
    model.addAttribute("pageTitle", pageTitle );
    return "about";
  }

}