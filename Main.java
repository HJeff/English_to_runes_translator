package com.company;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;


//hashmap for run to english data


public class Main {

    public static hashmap(){
        HashMap<String, String> engToRunes = new HashMap<String, String>;

        engToRunes.put("A", "ᚨ");
        engToRunes.put("B", "ᛒ");
        engToRunes.put("C", "ᚲ");
        engToRunes.put("D", "ᛞ");
        engToRunes.put("E", "ᛖ");
        engToRunes.put("F", "ᚠ");
        engToRunes.put("G", "ᚷ");
        engToRunes.put("H", "ᚺ");
        engToRunes.put("I", "ᛁ");
        engToRunes.put("J", "ᛃ");
        engToRunes.put("K", "ᚴ");
        engToRunes.put("L", "ᛚ");
        engToRunes.put("M", "ᛗ");
        engToRunes.put("N", "ᚾ");
        engToRunes.put("O", "ᛟ");
        engToRunes.put("P", "ᛈ");
        engToRunes.put("Q", "ᛩ");
        engToRunes.put("R", "ᚱ");
        engToRunes.put("S", "ᛋ");
        engToRunes.put("T", "ᛏ");
        engToRunes.put("U", "ᚢ");
        engToRunes.put("V", "ᚡ");
        engToRunes.put("W", "ᚹ");
        engToRunes.put("X", "ᛪ");
        engToRunes.put("Y", "ᚤ");
        engToRunes.put("Z", "ᛉ");




    }



    public void EnglishToRune(){

        JFrame frame = new JFrame("English to rune translator");
        frame.setVisible(true);
        frame.setSize(900, 800);

        JLabel englishLabel = new JLabel("English here");
        englishLabel.setHorizontalAlignment((SwingConstants.CENTER);
        JButton englishToRune = new JButton("Translate!");



    }







    public static void main(String[] args) {
	// write your code here
    }
}
