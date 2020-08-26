package com.lunaisnotaboy.tachiyomi

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

  @GetMapping("/")
  fun tachiyomi(model: Model): String {
    model["title"] = "Home"
    return "home"
  }

}
