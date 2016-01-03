package fr.istic.videogen.web.rest;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.istic.videogen.Generator;
import fr.istic.videogen.playlistFormat.TypeGenerator;




@RestController
@RequestMapping(value = "/api/videos", produces = MediaType.APPLICATION_JSON_VALUE)
public class VideoRessource {
	
	@Autowired ServletContext context;
	
	 @RequestMapping(method = RequestMethod.GET)
	    public String getAll() {
	       String url = Generator.createVideo("src/main/webapp/resources/test.videogen",TypeGenerator.M3UEXT,"src/main/webapp/resources/file.m3u8");
	       
	       return "{\"url\":\""+url+"\"}";
	    }
}
