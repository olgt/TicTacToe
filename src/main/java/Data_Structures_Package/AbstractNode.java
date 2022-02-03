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
abstract class AbstractNode {
    
    char value;
    
    public void assignValueOfNode(char value){
        this.value = value;
    }
    
    public void deleteValueOfNode(){
        this.value = ' ';
    }
}
