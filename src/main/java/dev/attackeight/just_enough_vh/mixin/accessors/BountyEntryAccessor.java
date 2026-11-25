package dev.attackeight.just_enough_vh.mixin.accessors;

import iskallia.vault.config.bounty.BountyBoardRewardsConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BountyBoardRewardsConfig.Entry.class)
public interface BountyEntryAccessor {
    @Accessor("minLevel")
    int getMinLevel();

    @Accessor("maxLevel")
    int getMaxLevel();

    @Accessor("minGreedTier")
    int getMinGreedTier();
}