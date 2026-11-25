package dev.attackeight.just_enough_vh.mixin.accessors;

import iskallia.vault.config.bounty.BountyBoardRewardsConfig;
import iskallia.vault.gear.VaultGearRarity;
import java.util.List;
import java.util.Map;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BountyBoardRewardsConfig.class)
public interface BountyBoardRewardsConfigAccessor {
    @Accessor("rewardsByRarity")
    Map<VaultGearRarity, List<BountyBoardRewardsConfig.Entry>> getRewardsByRarity();
}