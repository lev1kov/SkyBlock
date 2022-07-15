package lev1kov.skyblock.api.data;

import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lombok.NonNull;

public interface Database {

    void save(Gamer var1);

    void save(Island var1);

    Gamer loadGamer(@NonNull String var1);

    Island loadIsland(@NonNull String var1);

    void saveAll();

    void saveGamers();

    void saveIslands();

}
