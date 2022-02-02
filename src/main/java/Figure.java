/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgt1
 */
abstract class Figure {

    char symbol;
    
    Figure(char symbol){
        this.symbol = symbol;
    }
    
    public void drawFigure(){
        System.out.println(symbol);
    }
}
