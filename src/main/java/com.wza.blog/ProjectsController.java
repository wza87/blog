package com.wza.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectsController {

  @RequestMapping("/projects")
  public String Projects(@RequestParam(value="name", required=false, defaultValue="") String name, Model model) {
    String pageTitle = "Projects";
    if (!StringUtils.isEmpty(name)){
      pageTitle= name + " Project";
    }
    model.addAttribute("pageTitle", pageTitle );
    model.addAttribute("name", name);
    return "projects";
  }

}