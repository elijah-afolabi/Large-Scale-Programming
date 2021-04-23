package org.howard.edu.lsp.exam.question42;

import java.util.*;

public class SongsDatabase {

    private Map<String, Set<String>> genreMap = new HashMap<String, Set<String>>();
    
    /* Add a song title to a genre */
        public void addSong(String genre, String songTitle) {
        	//Code it!!
           
            if(genreMap.containsKey(genre)){
                genreMap.get(genre).add(songTitle);//adding songTitle with genre
            }else{
                //making a new set when the genre does not exist and adding it to the hashmap
                Set<String> newSet = new HashSet<String>();
                newSet.add(songTitle);
                genreMap.put(genre,newSet);
            }
    
        }
    

		/* Return the Set that contains all songs for a genre */
        public Set<String> getSongs(String genre) {
    
        	// Code it!!
            return genreMap.get(genre);//returning the set corresponding to the genre
    
        }
    
        /* Return genre, i.e., jazz, given a song title */
        public String getGenreOfSong(String songTitle) {
    
        	// Code it!!
            for (Map.Entry<String, Set<String>> entry : genreMap.entrySet()) {
                
                if(entry.getValue().contains(songTitle)){
                    return entry.getKey();
                }
            
            }

            return "Not Found";
    
        }

        public static void main(String args[]){
            SongsDatabase db = new SongsDatabase();

            //adding songs
            db.addSong("Rap","Savage");
            db.addSong("Rap","Gin and Juice");
            db.addSong("Jazz","Always There");
            db.addSong("Afrobeats","Ye");
            db.addSong("Trap","The box");
            db.addSong("Rap","God's Plan");

            //getting songs 
         Set<String> set = db.getSongs("Rap");
         System.out.println( db.getSongs("Rap") );// prints “Rap”
         System.out.println( db.getGenreOfSong("Savage") );// prints “Rap”
         System.out.println( db.getGenreOfSong("Always There"));// prints “Jazz”

        }
    
}
