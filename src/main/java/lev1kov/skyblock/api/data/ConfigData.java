package lev1kov.skyblock.api.data;

import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

public interface ConfigData {

    FileConfiguration getConfiguration();

    File getFile();

    void save();

}
