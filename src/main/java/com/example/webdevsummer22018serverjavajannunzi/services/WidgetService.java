package com.example.webdevsummer22018serverjavajannunzi.services;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdevsummer22018serverjavajannunzi.models.Widget;

@RestController
@CrossOrigin(origins = "*")
public class WidgetService {
	@PostMapping("/api/widget")
	public List<Widget> saveWidgets(@RequestBody List<Widget> widgets) {
		return widgets;
	}
	
}
