package com.mylist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

  @GetMapping("/contact/list")
  public Object list() {
    String[] contacts = {
        "홍길동, hong@test.com, 010-1111-2222, test",
        "유관순, hong@test.com, 010-1111-2222, test",
        "김구, hong@test.com, 010-1111-2222, test"
    };
    return contacts;
  }
}