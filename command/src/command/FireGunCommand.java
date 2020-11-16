
package command;

public class FireGunCommand implements Comandos{
    private final GameActor gameActor;
    
    public FireGunCommand (GameActor gameActor){
        this.gameActor = gameActor;
    }
    
    public void execute(){
        this.gameActor.fireGun();
        
    }
    
}
