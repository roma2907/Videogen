package fr.istic.videogen.playlist

import java.io.IOException
import java.io.File
import java.io.FileWriter

class PlayListM3U extends PlayList {
	
	
	
 
	override generateFile() {
		
		val f = new File ("file.m3u");
	
	
	val fw = new FileWriter (f);
		
		try
		{
			urlVideos.forEach[v|
				
				fw.write (v);
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