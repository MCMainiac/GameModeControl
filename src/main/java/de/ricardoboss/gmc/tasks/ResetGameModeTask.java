package de.ricardoboss.gmc.tasks;

import de.ricardoboss.gmc.Main;
import de.ricardoboss.gmc.excpetions.GameModeNotFoundException;
import de.ricardoboss.gmc.utils.CGM;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class ResetGameModeTask implements Runnable {
    private final Player p;
    private final GameMode oldGm;

    public ResetGameModeTask(Player p, GameMode oldGm) {
        this.p = p;
        this.oldGm = oldGm;
    }

    @Override
    public void run() {
        try {
            CGM.set(p, CGM.getControlledGamemodeByGamemode(oldGm)); // reset the old gamemode of the player
        } catch (GameModeNotFoundException e) {
            Main.log("An exception occurred while resetting \"" + p.getName() + "\"'s game mode!");

            if (Main.debug)
                e.printStackTrace();
        }
    }
}
