package com.pranavv51.service_b.service;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SampleBService {

    private String[] strArray = {"Hello world","Ee sala cup namdu","Thank you","Greetings","I love India","GoodBye","Mera Bharat Mahan"};

    private int randInt(int param){
        Random rand = new Random();

        if(param==0){
            return rand.nextInt(0,6);
        }
        return rand.nextInt(1,15);

    }


    public String generateSeqStrings(){
        int length = randInt(7);
        String res="";
        for(int i=0;i<length;i++){
            res+=strArray[randInt(0)];
        }

        return res;
    }



}
