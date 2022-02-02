
import java.io.Console;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgt1
 */

public class MainMenu {
    
    Scanner scannerForUserInput = new Scanner(System.in);
    int optionSelected;
    
    public void startMenu(){
        showMenu();        
        getOptionSelected();
    }
    
    public void showMenu(){
        System.out.println("1. Begin");
        System.out.println("2. Download Previous Games");
        System.out.println("3. Exit");
    }
    
    public void getOptionSelected(){
        optionSelected = getAnswer();
        
        switch(optionSelected){
            case 1:
                System.out.println("Option 1 Pressed");
                executeOptionSelected(optionSelected);
                break;
            
            case 2: 
                System.out.println("Option 2 Pressed");
                executeOptionSelected(optionSelected);
                break;
                
            case 3:
                System.out.println("Exiting");
                executeOptionSelected(optionSelected);
                break;
            default:
                showMenu();
                getOptionSelected();
        }
    }
    
    public int getAnswer(){
        optionSelected = scannerForUserInput.nextInt();
        return optionSelected;
    }
    
    public void executeOptionSelected(int optionSelected){
        switch(optionSelected){
            case 1:
                beginANewGame();
                break;
            
            case 2: 
                System.out.println("Option 2 Pressed Again");
                break;
                
            case 3:
                System.out.println("Exiting Again");
                break;
        }

    }
    
    public void beginANewGame(){
        GameBoard currentBoard = new GameBoard(null);
        currentBoard.drawEmptyBoard();
    }
    
}
