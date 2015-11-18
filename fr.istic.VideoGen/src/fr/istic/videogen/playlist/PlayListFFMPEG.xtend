package fr.istic.videogen.playlist

import java.io.File
import java.io.FileWriter
import java.io.IOException

class PlayListFFMPEG extends PlayList {
	
	
	
 
	override generateFile() {
		
		val f = new File ("file.ffmpeg");
	
	
	val fw = new FileWriter (f);
		
		try
		{
			urlVideos.forEach[v|
				
				fw.write ("file:"+"'"+v+"'");
				 fw.write ("\r\n");
				
			]
			 fw.close ();
		 }
			catch (IOException exception)
			{
			    System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
			}
		 }
		
	}
	
	
	
	
	
