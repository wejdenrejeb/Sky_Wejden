package espritds.sky_wejden.Aspects;


import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Map<String,String>  HandlerException(Exception exception){
        Map map = new HashMap<>();
        map.put("error", exception.getMessage());
        return map;

    }
}
