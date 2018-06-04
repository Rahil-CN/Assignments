package com.codenation.psp;

import com.codenation.psp.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.codenation.psp.User;
import com.codenation.psp.UserRepository;
import java.util.Map;
import java.util.LinkedHashMap;



@Controller
@RequestMapping(path="/")
public class ApplicationController {

    /**
     *
     * @return
     */

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody void displayData(@RequestBody Test t1)
    {

        System.out.print(t1.getName());
        System.out.print(t1.getAge());
        System.out.print(t1.getMarks());
        System.out.print(t1.getRoll());

    }

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Map> healthCheck() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status","Ok-v4");
        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }
}