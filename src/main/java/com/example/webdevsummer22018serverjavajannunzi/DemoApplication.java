package com.example.webdevsummer22018serverjavajannunzi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webdevsummer22018serverjavajannunzi.models.Widget;
import com.example.webdevsummer22018serverjavajannunzi.repositories.WidgetRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	WidgetRepository widgetRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
        List<Widget> widgets = (List<Widget>) widgetRepository.findAll();
        for(Widget widget : widgets) {
          System.out.println(widget.getTitle());        	
        }
    }
}
