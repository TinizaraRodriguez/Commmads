
package command;

import java.util.HashMap;
import java.util.Map;

public class GamingPadHandler {
    
    private final GamingPadButton buttonA = new GamingPadButtonHandler("A");
    private final GamingPadButton buttonB = new GamingPadButtonHandler("B");
    private final GamingPadButton buttonY = new GamingPadButtonHandler("Y");
    private final GamingPadButton buttonX = new GamingPadButtonHandler("X");
    //Comandos buttonACommand, buttonBCommand, buttonYCommand, buttonXCommand;
    
    Map <String, Comandos> actionsPad = new HashMap<>();
    
    public GamingPadHandler(){
      
        
    }
    
    public void addCommand (String IDButton, Comandos buttonCommand){
        this.actionsPad.put (IDButton, buttonCommand);
    }

    public void handlerInput() {
        if (this.buttonA.isPressed()) this.actionsPad.get("A").execute();
        else if (this.buttonB.isPressed()) this.actionsPad.get("B").execute();
        else if (this.buttonY.isPressed()) this.actionsPad.get("Y").execute();
        else if (this.buttonX.isPressed()) this.actionsPad.get("X").execute();
        
    }

    private void swapWeapon() {
       
    }

    private void lurch() {
        
    }

    private void fireGun() {
       
    }

    private void jump() {
       
    }
    
    
    
}
