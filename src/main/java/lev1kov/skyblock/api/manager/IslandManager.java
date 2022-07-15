package lev1kov.skyblock.api.manager;

import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lombok.NonNull;

public interface IslandManager {

    Island getDefaultIsland(@NonNull Gamer var1);

    void addIsland(@NonNull Island var1);

    void update(@NonNull Island var1);

    Island getIsland(@NonNull String var1);

    Island getIsland(@NonNull Gamer var1);

}
