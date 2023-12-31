
package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String incio(){
        log.info("ejecutando el controlador rest");
        log.debug("mas detalle del controlador");
        return "HolaMundo con Spring ";
    }
}
