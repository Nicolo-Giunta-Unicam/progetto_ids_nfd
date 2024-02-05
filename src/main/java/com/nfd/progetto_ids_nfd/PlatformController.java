package com.nfd.progetto_ids_nfd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatformController {

   @RequestMapping("/hello") 
   public String hello(){
     return "hello world";
   } 
   
}
