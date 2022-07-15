package lev1kov.skyblock.api.manager;

import lev1kov.skyblock.api.Gamer;
import lombok.NonNull;
import org.bukkit.entity.Player;

public interface GamerManager {

    Gamer getDefaultGamer(@NonNull Player var1);

    void addGamer(@NonNull Gamer var1);

    void update(@NonNull Gamer var1);

    Gamer getGamer(@NonNull String var1);

    Gamer getGamer(@NonNull Player var1);

}
