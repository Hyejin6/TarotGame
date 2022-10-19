package com.example.tarotgame;

import java.io.Serializable;

public class TarotData implements Serializable {

    private String tarotName;
    private String tarotStr;
    private String tarotTag;
    private int tarotImg;

    public TarotData(String tarotName, String tarotStr, String tarotTag, int tarotImg) {
        this.tarotName = tarotName;
        this.tarotStr = tarotStr;
        this.tarotTag = tarotTag;
        this.tarotImg = tarotImg;
    }

    public String getTarotName() {
        return this.tarotName;
    }
    public String getTarotStr() {
        return this.tarotStr;
    }
    public String getTarotTag() {
        return this.tarotTag;
    }
    public int getTarotImg() {
        return this.tarotImg;
    }



}
