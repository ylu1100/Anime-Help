package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Action- Intense battles and action-packed scenes are the name of the game here. If you are into movies like the Fast and Furious franchise, this is the genre for you.\n" +
                "\n" +
                "Adventure- Think people leaving their comfort zone and going to a new and exciting place, kinda like Percy Jackson but Japanese and edgy rather than white and edgy.\n" +
                "\n" +
                "Comedy- Think a better, actually funny version of SNL. These can be actually funny, or they can be based off of a running joke in the anime.\n" +
                "\n" +
                "Drama- Girl’s locker room chatter X Keeping Up With the Kardashians X All that stuff you see on Youtube with Logan Paul and KSI, except actually interesting and without a dead Japanese guy.\n" +
                "\n" +
                "Slice of Life- Normal, relatable situations we all find ourselves in; just in Japanese and with a lot of anime schoolgirls (Anyone who watches in Dubbed should be locked away from the general public) \n" +
                "\n" +
                "Fantasy- Lots of things that can’t happen in real life can happen here. Good if want an “escape from reality” or “nerd gets the hot girl” show ;)\n" +
                "\n" +
                "Magic- Like fantasy, except with more people shouting spells and with more pentagrams. Think Harry Potter instead of Percy Jackson and u have the general idea.\n" +
                "\n" +
                "Supernatural- Monsters somehow pull up on your block every other week, and there’s nothing the protagonist can do except beat them up, get stronger, and simultaneously chase a love interest and a near-unbeatable obstacle throughout the duration. 99% of the time, you’re watching because the animation is fire and so is the soundtrack.\n" +
                "\n" +
                "Horror- The best ones make every horror movie you’ve ever seen combined look like a damn Pixar movie. Bring a diaper and some popcorn, this genre will scare the literal crap out of you.\n" +
                "\n" +
                "Mystery- Main character tries to solve a mystery throughout the whole story. Just like any mystery show on TV, but animated, Japanese style. It’s a nice genre if you’re willing to invest your time in it and keep up with it.\n" +
                "\n" +
                "Psychological- The primary battle here is in the minds of the characters. There may be some action here and there, but for the most part it’s like watching a chess game rather than a boxing match.\n" +
                "\n" +
                "Romance- Exactly what it sounds like- love and stuff. Good if you're feeling lonely. May or may not contain Hentai if you’re lucky.\n");
        System.out.println("Type in the above genres you enjoy and we will find animes that caters to you");
        Scanner input= new Scanner(System.in);
        System.out.println("Separate each genre with a comma");
        String in=input.nextLine();
        if(!(in.substring(0,1).equals(","))){
            in=","+in;
        }
        if(!(in.substring(in.length()-1).equals(","))){
            in=in+",";
        }
        ArrayList<String> genre= new ArrayList<>();
        String in1=in.toLowerCase();

        ArrayList<Integer>commas= new ArrayList<>();
        for(int x = 0;x<in1.length();x++){
            if(in1.substring(x,x+1).equals(",")){
                commas.add(x);
            }
        }

            for (int x = 0; x < commas.size() - 1; x++) {
                genre.add(in1.substring(commas.get(x)+1, commas.get(x + 1)));
            }



        ArrayList<anime> animelist= new ArrayList<>();
        animelist.add(new anime("One Punch Man", animetest.onepunchman(), "Guy tries to find purpose in life as he effortlessly overcome his obstacles"));
        animelist.add(new anime("Jojo's Bizarre Adventure", animetest.jojo(), "With their newfound powers, a family discovers their destiny that involves taking down the supernatural"));
        animelist.add(new anime("My Hero Academia", animetest.myheroaca(), "Normal kid obtains powers from Japan's strongest hero and must develop his abilities to defeat an evil organization"));
        animelist.add(new anime("Dragon Ball Z", animetest.dragonballz(), "Humanoid alien saves world from people to gods"));
        animelist.add(new anime("Death Note", animetest.deathnote(), "Guy starts killing people with a notebook"));
        animelist.add(new anime("Rising of the Shield Hero", animetest.shieldhero(), "Youth gets sent to a parallel world where he must venture with a shield"));
        animelist.add(new anime("Fairy Tail", animetest.fairytail(), "An adventure story about a guild called Fairy Tail"));
        animelist.add(new anime("Assassination Classroom", animetest.assassclass(), "Kids must kill their mutated teacher before graduation"));
        animelist.add(new anime("Konosuba", animetest.konosuba(), "Teenager gets reincarnated in a parallel world with MMORPG elements"));
        animelist.add(new anime("Attack On Titan", animetest.snk(), "Small people try not to get eaten by giant people"));
        animelist.add(new anime("Hunter X Hunter", animetest.hxh(), "Young boy looks for his father"));
        animelist.add(new anime("Sword Art Online", animetest.sao(), "Average school boy becomes overpowered in a dangerous game"));
        animelist.add(new anime("Akame Ga Kill", animetest.akame(), "Group of friends try to overthrow the government"));//yuurrrrrr
        animelist.add(new anime("Highschool DxD", animetest.hdxd(), "Perverted teen dies on his first date, but is revived by a beautiful woman. Luckily he has to serve her"));
        animelist.add(new anime("To-Love Ru", animetest.toloveru(), "Schoolboy questions his heart's desires while attracting a lot of girls with his good virtues"));
        animelist.add(new anime("Tokyo Ghoul", animetest.tokyoghoul(), "In a world full of ghouls, boy gets torn apart on his first date. However, he recovers with transplanted organs of his killer and struggles with his identity"));
        animelist.add(new anime("Dororo", animetest.dororo(), "Boy tries to take back his body parts from demons"));
        animelist.add(new anime("Future Diary", animetest.mirainikki(), "Boy gets carried by an extremely obsessive girl in a battle royale to become God"));

        animeselection select1=new animeselection(genre,animelist);
        System.out.println();
        System.out.print("genres:");
        for(int x = 0;x<genre.size();x++){
            System.out.print(""+genre.get(x)+",");
        }
        System.out.println();
        for(int x = 0;x<select1.Animeselections().size();x++){
            System.out.println(select1.Animeselections().get(x));
            System.out.println(select1.Animedescriptions().get(x));
            System.out.println();
        }

	// write your code here
    }
}
