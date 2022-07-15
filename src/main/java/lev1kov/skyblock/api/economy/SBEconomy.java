package lev1kov.skyblock.api.economy;

import lombok.NonNull;
import org.bukkit.entity.Player;

public interface SBEconomy {

    void take(@NonNull Player var1, int var2);

    int get(@NonNull Player var1);

}
