package com;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Yuriy Vins 15.01.2022
 */
@RestController
@RequestMapping("/")
@Tag(name = "Класс ControllerRest", description = "Все его Rest-методы:")
public class ControllerRest {

      @GetMapping("/swagger")
      @Operation(summary = "Метод приветствует Swagger")
      public ResponseEntity<String> swaggerController(){
          return ResponseEntity.ok().body("Hello Swagger!");
      }

      @GetMapping()
      public ModelAndView simpleController(){
          ModelAndView modelAndView = new ModelAndView();
          modelAndView.setViewName("index");
          return modelAndView;
    }
}
