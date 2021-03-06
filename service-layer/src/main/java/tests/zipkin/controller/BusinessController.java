package tests.zipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangzexin189 on 2017-05-22.
 */
@Controller
public class BusinessController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("business")
    @ResponseBody
    public Object hello(String m) {
        Map<String, Object> resultData = new HashMap<String, Object>();

        resultData.put("msg", "service " + m);

        return resultData;
    }
}
