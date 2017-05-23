package tests.zipkin.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangzexin on 22/05/2017.
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        resultData.put("code", -1);
        resultData.put("msg", e.getMessage());

        return resultData;
    }
}
