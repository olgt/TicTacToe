
import Data_Structures_Package.BoardStructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgt1
 */

public class GameBoard {
    BoardStructure currentBoard;
    
    public GameBoard(BoardStructure currentGame){
        if(currentGame == null){
            currentBoard = new BoardStructure();
        } else {
            this.currentBoard = currentGame;
        }
    }
    
    public void drawEmptyBoard(){
        drawTopBoard();
        
        drawRowEmpty();
        System.out.println();
        drawRowEmpty();
        System.out.println();
        drawRowEmpty();
        System.out.println();
        
    }
    
    public void drawRowEmpty(){        
        System.out.print('|');
        System.out.print('_');
        System.out.print('|');
        System.out.print('_');
        System.out.print('|');
        System.out.print('_');
        System.out.print('|');
    }
    
    public void drawTopBoard(){
        System.out.print(' ');
        System.out.print('_');
        System.out.print(' ');
        System.out.print('_');
        System.out.print(' ');
        System.out.print('_');
        
        System.out.println();

    }

    public void getDimensions(){
        this.currentBoard.getDimensions();
    }
}
