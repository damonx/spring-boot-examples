package com.neo.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

	@RequestMapping(value = "/greeting/hi", method = RequestMethod.GET)
	public ModelAndView hello(final Locale locale, final ModelAndView model) {
		model.addObject("greeting", "Hello!");

		final Date date = new Date();
		final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		final String formattedDate = dateFormat.format(date);
		model.addObject("currentTime", formattedDate);
		model.setViewName("hello");
		return model;
	}

}