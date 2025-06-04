package com.pranavv51.service_a.service;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SampleAService {

    private int getrandint(int param){
        Random rand = new Random();
        if(param==0){
            return rand.nextInt(65,122);
        }
        return rand.nextInt(35,100);
    }


    public String genString(){
        int lengthOfString = getrandint(8);
        String ans = "";

        for(int i=0;i<lengthOfString;i++){
            ans+=Character.toString((char) getrandint(0));
        }
        return ans;
    }




}
