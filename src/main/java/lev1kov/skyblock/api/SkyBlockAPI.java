package lev1kov.skyblock.api;

import lev1kov.skyblock.api.manager.GamerManager;
import lev1kov.skyblock.api.manager.IslandManager;
import lev1kov.skyblock.api.manager.impl.CraftGamerManager;
import lev1kov.skyblock.api.manager.impl.CraftIslandManager;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SkyBlockAPI {

    public final static GamerManager GamerManager = new CraftGamerManager();

    public final static IslandManager IslandManager = new CraftIslandManager();

}
