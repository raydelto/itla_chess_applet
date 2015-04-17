/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itlachess.main.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Christian
 */
public class ProgressBar extends Thread{
    JProgressBar progress;
    
    public ProgressBar(JProgressBar progress){
        super();
        this.progress = progress;
    }
    public void run(){
        for (int i = 1; i <= 100; i++) {
            progress.setValue(i);
            pause(50);
        }
    }
    public void pause(int mlSeg){
        try {
            Thread.sleep(mlSeg);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
