package com.ben.demos.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/dashboard")
	public String dashboardDateTime() {
	return "datehome.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) throws ParseException {
		Date myDate = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("MM-dd-yyyy");
       
        String strDate = sm.format(myDate);

        model.addAttribute("date", strDate);
		return "datetime.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) throws ParseException {
		Date myDate = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("hh:mm");
       
        String strTime = sm.format(myDate);
        
        model.addAttribute("time", strTime);
		return "datetime.jsp";
	}
}
