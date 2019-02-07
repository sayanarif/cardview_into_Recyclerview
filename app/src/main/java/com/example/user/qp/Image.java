package com.example.user.qp;

import java.util.ArrayList;

public class Image {
    private int quoteimg;
    private String imgname;

    public Image(int quoteimg, String imgname) {
        this.quoteimg = quoteimg;
        this.imgname = imgname;
    }

    public int getQuoteimg() {
        return quoteimg;
    }

    public String getImgname() {
        return imgname;
    }
    public static ArrayList<Image>getAllImg(){
        ArrayList<Image>images=new ArrayList<>();
        images.add(new Image(R.drawable.rsz_alone,"Alone"));
        images.add(new Image(R.drawable.rsz_angry,"Angry"));
        images.add(new Image(R.drawable.rsz_1rsz_anniversary,"Anniversary"));
        /*images.add(new Image(R.drawable.alone,"Alone"));
        images.add(new Image(R.drawable.angry,"Angry"));
        images.add(new Image(R.drawable.anniversary,"Anniversary"));
        images.add(new Image(R.drawable.awesome,"Awesome"));
        images.add(new Image(R.drawable.awkward,"Awkward"));
        images.add(new Image(R.drawable.beard,"Beard"));
        images.add(new Image(R.drawable.beautiful,"Beautiful"));
        images.add(new Image(R.drawable.birthday,"Birthday"));
        images.add(new Image(R.drawable.broken_heart,"Broken heart"));
        images.add(new Image(R.drawable.cheating,"Cheating"));
        images.add(new Image(R.drawable.childhood,"childhood"));
        images.add(new Image(R.drawable.cute,"Cute"));
        images.add(new Image(R.drawable.emotional,"Emotional"));
        images.add(new Image(R.drawable.family,"Family"));
        images.add(new Image(R.drawable.fathers_day,"Fathers day"));
        images.add(new Image(R.drawable.food,"Food"));
        images.add(new Image(R.drawable.friends,"Friends"));
        images.add(new Image(R.drawable.funny,"Funny"));
        images.add(new Image(R.drawable.goodmrning,"Good Morning"));
        images.add(new Image(R.drawable.goodnight,"Good Night"));
        images.add(new Image(R.drawable.gym,"Gym"));
        images.add(new Image(R.drawable.happiness,"Happiness"));
        images.add(new Image(R.drawable.hateyou,"Hate You"));
        images.add(new Image(R.drawable.hot,"Hot"));
        images.add(new Image(R.drawable.hurt,"Hurt"));
        images.add(new Image(R.drawable.husband,"Husband"));
        images.add(new Image(R.drawable.inspirational,"Inspirational"));
        images.add(new Image(R.drawable.insult,"Insult"));
        images.add(new Image(R.drawable.jealous,"Jealous"));
        images.add(new Image(R.drawable.kiss,"Kiss"));
        images.add(new Image(R.drawable.lonely,"Loney"));
        images.add(new Image(R.drawable.love,"Love"));
        images.add(new Image(R.drawable.marrige,"Marriage"));
        images.add(new Image(R.drawable.men,"Men"));
        images.add(new Image(R.drawable.miss_u,"Miss you"));
        images.add(new Image(R.drawable.mothersday,"Mothers Day"));
        images.add(new Image(R.drawable.motivational,"Motivational"));
        images.add(new Image(R.drawable.music,"Music"));
        images.add(new Image(R.drawable.parents,"Parents"));
        images.add(new Image(R.drawable.party,"Party"));
        images.add(new Image(R.drawable.pets,"Pets"));
        images.add(new Image(R.drawable.relationship,"Relationship"));
        images.add(new Image(R.drawable.romantic,"Romantic"));
        images.add(new Image(R.drawable.selfie,"Selfie"));
        images.add(new Image(R.drawable.single,"Single"));
        images.add(new Image(R.drawable.sister,"Sister"));
        images.add(new Image(R.drawable.sorry,"sorry"));
        images.add(new Image(R.drawable.success,"Success"));
        images.add(new Image(R.drawable.trust,"Trust"));
        images.add(new Image(R.drawable.weekend,"Weekend"));
        images.add(new Image(R.drawable.wife,"Wife"));
        images.add(new Image(R.drawable.women,"Wpmen"));*/
return images;
    }
}
