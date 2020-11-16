
package command;

public class Command {

    public static void main(String[] args) {
        
        GameActor archer = new GameActor(){
            
          @Override
          public void jump(){ }
          @Override
          public void swapWeapon(){ }
          @Override
          public void lurch(){ }
          @Override
          public void fireGun(){ }
           
        };
        
        Comandos jumpCommand = new JumpCommand();
        Comandos fireGunCommand = new FireGunCommand(archer);
        Comandos lurchCommand = new LurchCommand();
        Comandos swapWeaponCommand = new SwapWeaponCommand();
        
        GamingPadHandler gamingPadHandler = new GamingPadHandler();
        
        gamingPadHandler.addCommand("A", swapWeaponCommand);
        gamingPadHandler.addCommand("B", lurchCommand);
        gamingPadHandler.addCommand("Y", fireGunCommand);
        gamingPadHandler.addCommand("X", jumpCommand);
        
        while (true){
            gamingPadHandler.handlerInput();
        }

    }
    
}
