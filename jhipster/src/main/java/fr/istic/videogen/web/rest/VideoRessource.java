package fr.istic.videogen.web.rest;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URL;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.istic.videogen.Generator;
import fr.istic.videogen.playlistFormat.TypeGenerator;




@RestController
@RequestMapping(value = "/api/videos", produces = MediaType.APPLICATION_JSON_VALUE)
public class VideoRessource {

	@RequestMapping(method = RequestMethod.GET)
	    public String getAll() throws FileNotFoundException  {
			URL url = ResourceUtils.getURL("src/main/webapp/resources/test.videogen");
			String file = Generator.createVideo(url,TypeGenerator.M3UEXT,"src/main/webapp/resources/file.m3u8");
			System.out.println(file);
			return "{\"url\":\""+file+"\"}";
	    }
}
