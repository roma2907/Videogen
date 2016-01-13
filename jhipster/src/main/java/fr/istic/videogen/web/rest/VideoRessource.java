package fr.istic.videogen.web.rest;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.istic.videogen.Generator;
import fr.istic.videogen.playlistFormat.TypeGenerator;
import fr.istic.videogen.vignette.VideoWithImage;




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

	@RequestMapping(value="/vignettes",method=RequestMethod.GET)
	public @ResponseBody List<VideoWithImage> getVignettes() throws FileNotFoundException{
		URL url = ResourceUtils.getURL("src/main/webapp/resources/test.videogen");
		return Generator.createVignette(url);
	}

	@RequestMapping(value="/vignettes",method=RequestMethod.POST)
	public String createPlayListVignette(@RequestBody List<Integer> lists) throws FileNotFoundException{
		URL url = ResourceUtils.getURL("src/main/webapp/resources/test.videogen");
		String file = Generator.createVideo(url,lists,TypeGenerator.M3UEXT,"src/main/webapp/resources/file.m3u8");
		System.out.println(file);
		return "{\"url\":\""+file+"\"}";
	}
}
