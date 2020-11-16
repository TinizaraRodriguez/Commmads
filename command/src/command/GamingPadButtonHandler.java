
package command;


public class GamingPadButtonHandler implements GamingPadButton {
    private final String ButtonID;
    
    public GamingPadButtonHandler (String ButtonID){
        this.ButtonID = ButtonID;
    }
    
       public String getButtonID(){
        return ButtonID;
    }
       
       
    @Override
    public boolean isPressed(){
        return true;
        
        
    }
    
 
            
    
    
    
}
