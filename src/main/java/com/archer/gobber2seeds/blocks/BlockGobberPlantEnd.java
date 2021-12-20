package com.archer.gobber2seeds.blocks;

import com.archer.gobber2seeds.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockGobberPlantEnd extends CropBlock
{
	public BlockGobberPlantEnd(String name, Properties builder)
    {
        super(builder);
        this.registerDefaultState(this.getStateDefinition().any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
    }
    
    protected boolean isValidGround(BlockState state, BlockGetter worldIn, BlockPos pos)
    {
        return state.getBlock() == Blocks.FARMLAND;
    }
    
    @OnlyIn(Dist.CLIENT)
    protected ItemLike getSeedsItem()
    {
        return ItemInit.GOBBER2_SEED_END.get();
    }

    public ItemStack getItem(BlockGetter worldIn, BlockPos pos, BlockState state)
    {
        return new ItemStack(this.getSeedsItem());
    }	
}