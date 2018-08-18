package com.niall.alertmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class AlertManagerRestController {

	@RequestMapping(value = "/slackAlert", method = RequestMethod.GET)
	@ResponseBody
	public void sendSlackMessage(@RequestParam("message") String message,
			@RequestParam(value = "channel") String channel) {

	}
	
}
