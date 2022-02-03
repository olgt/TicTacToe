/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures_Package;

/**
 *
 * @author olgt1
 */
public class BoardStructure {

    BoardHeader header;
    
    public BoardStructure(){
        header = new BoardHeader();
        header.buildEmptyBoard(3, 3);
    }
    
    public void getDimensions(){
        header.getDimensions();
    }
    
    
    
}
