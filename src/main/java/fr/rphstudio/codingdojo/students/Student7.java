/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.codingdojo.students;

import fr.rphstudio.codingdojo.game.Pod;
import fr.rphstudio.codingdojo.game.PodPlugIn;

import javax.swing.text.Position;

/**
 *
 * @author Romuald GRIGNON
 */
public class Student7 extends PodPlugIn {
    public Student7(Pod p){
        super(p);
    }

    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE



    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------

    @Override
    public void process(int delta)
    {
        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE
        float x;

        x = getNextCheckPointDistance();

        setPlayerName("student 73");
        selectShip(15);
        setPlayerColor(29,137,245,255);

        turnTowardNextCheckPoint();
        if (x >2.3) {
            incSpeed(1);
        }
        else if (x<2.3){
            incSpeed(-0.10f);
        }

        // END OF CODE AREA
        //-------------------------------------------------------
    }

}









