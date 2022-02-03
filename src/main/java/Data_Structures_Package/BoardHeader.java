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
public class BoardHeader {
    BoardNode start;
    
    public BoardHeader(){
        this.start = new BoardNode();   
    }
    
    public void getDimensions(){
        System.out.println("The Dimensions of the board are Y: " + this.getHeight() + " X: " + this.getLength());
    }
    
    public int getLength(){
        int length = 0;
        
        BoardNode currentNode = this.start.right;
        
        while(currentNode != null){
            currentNode = currentNode.right;
            length++;
        }
        
        return length;
    }
    
    public int getHeight(){
        int height = 0;
        
        BoardNode currentNode = this.start.bottom;
                
        while(currentNode != null){
            currentNode = currentNode.bottom;
            height++;         
        }
        
        return height;
    }
    
    public void buildEmptyBoard(int height, int length){
        

        BoardNode temp = start;
        
        int counterLength = 0;
        int counterHeight = 0;
        
        while(counterLength < length){
            BoardNode current = new BoardNode();
            
            temp.right=current;
            current.left = temp;
            temp = temp.right;
            counterLength++;
        }
        
        temp = start;
        
        while(counterHeight < height){
            BoardNode current = new BoardNode();
            
            temp.bottom=current;
            current.top = temp;
            temp = temp.bottom;
            counterHeight++;
        }
        
        
    }
}
