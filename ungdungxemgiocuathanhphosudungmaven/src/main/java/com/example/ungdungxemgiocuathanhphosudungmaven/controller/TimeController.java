package com.example.ungdungxemgiocuathanhphosudungmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/world-clock")
    public String getTimeByTimezone (ModelMap model, @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {
        Date date = new Date();
//        lay ra time zone hien tai
        TimeZone local = TimeZone.getDefault();
//        lay ra time zone cua 1 thanh pho cu the
        TimeZone cocal = TimeZone.getTimeZone(city);
        long local_time = date.getTime() +
                (local.getRawOffset() - local.getRawOffset());
//        cai dat lai thoi gian hien date thanh mi
        date.setTime(local_time);
        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "index";
    }
}
