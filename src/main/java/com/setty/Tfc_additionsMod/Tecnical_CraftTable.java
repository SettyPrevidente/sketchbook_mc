package com.setty.Tfc_additionsMod;

import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.Immutable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.client.event.ColorHandlerEvent;

public class Tecnical_CraftTable extends Block
{
    public Tecnical_CraftTable()
    {
        super(Properties.create(Material.WOOD).harvestTool(ToolType.AXE));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder)
    {
        return ImmutableList.of(new ItemStack(Items.CAKE, 8), new ItemStack(Items.TORCH, 1));
    }
}
