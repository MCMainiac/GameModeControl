package de.mcmainiac.gmc.tasks;

import de.mcmainiac.gmc.Main;
import de.mcmainiac.gmc.utils.Updater;
import de.mcmainiac.gmc.utils.MessageColor;

import java.io.File;

public class UpdaterTask implements Runnable {
	private boolean update;
	private final Main plugin;
	private final File pluginFile;

	public UpdaterTask(Main plugin, File file, boolean shouldUpdate) {
		this.plugin = plugin;
		this.pluginFile = file;
		this.update = shouldUpdate;
	}

	@Override
	public void run() {
		if (Main.debug)
			Main.log("Running updater");

		Updater.UpdateType updateType;
		if (update)
			updateType = Updater.UpdateType.DEFAULT;
		else
			updateType = Updater.UpdateType.NO_DOWNLOAD;

		var updater = new Updater(plugin, Main.PLUGIN_ID, pluginFile, updateType, true);
		switch(updater.getResult()) {
			case NO_UPDATE:
				Main.log("[Updater] No update was found (latest version: " + updater.getLatestName() + ").");
				break;
			case SUCCESS:
				Main.log("[Updater] The newest version " + updater.getLatestName() + " has been downloaded and will be");
				Main.log("[Updater] loaded the next time the server restarts/reloads.");
				break;
			case UPDATE_AVAILABLE:
				Main.log("[Updater] There is a newer version available: " + updater.getLatestName() + ", but since");
				Main.log("[Updater] auto-update is disabled, nothing was downloaded.");
				break;
			case DISABLED:
				break;
			default:
				Main.log("[Updater] Something went wrong while updating!", MessageColor.ERROR);
				break;
		}
	}
}
