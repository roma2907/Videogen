package fr.istic.videogen.web.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.istic.videogen.Generator;




@RestController
@RequestMapping(value = "/api/videos", produces = MediaType.APPLICATION_JSON_VALUE)
public class VideoRessource {
	
	 @RequestMapping(method = RequestMethod.GET)
	    public String getAll() {
	       String url = Generator.createVideo("test.videogen","m3uext");
	       System.out.println(url);
	       return "{\"url\":\""+url+"\"}";
	    }
}
