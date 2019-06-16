package com.company;

import java.util.ArrayList;

public class animeselection {
    private ArrayList<String>genres;
    private ArrayList<anime>animelist;
    private ArrayList<anime>description;
    public animeselection(ArrayList<String>genres,ArrayList<anime>animelist){
        this.genres=genres;
        this.animelist=animelist;
    }
    public ArrayList<String>Animeselections(){
        ArrayList<String>test=new ArrayList<String>();
        int matches;
        for(int x = 0;x<animelist.size();x++){
            matches=0;
            for(int y = 0;y<animelist.get(x).getGenres().size();y++){
                for(int z = 0;z<genres.size();z++){
                    if(genres.get(z).equals(animelist.get(x).getGenres().get(y))){
                        matches++;
                    }
                }
            }
            if(matches>=genres.size()){
                test.add(animelist.get(x).getName());
            }
        }
        return test;
    }
    public ArrayList<String>Animedescriptions(){
        ArrayList<String>test=new ArrayList<String>();
        int matches;
        for(int x = 0;x<animelist.size();x++){
            matches=0;
            for(int y = 0;y<animelist.get(x).getGenres().size();y++){
                for(int z = 0;z<genres.size();z++){
                    if(genres.get(z).equals(animelist.get(x).getGenres().get(y))){
                        matches++;
                    }
                }
            }
            if(matches>=genres.size()){
                test.add(animelist.get(x).getDescription());
            }
        }
        return test;
    }
}
