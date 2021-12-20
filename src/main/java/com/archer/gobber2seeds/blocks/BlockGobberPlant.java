
package com.archer.gobber2seeds.blocks;

import com.archer.gobber2seeds.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockGobberPlant extends CropBlock
{
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};


    public BlockGobberPlant(String name, Properties builder)
    {
        super(builder);
        this.registerDefaultState(this.getStateDefinition().any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
    }

    protected boolean isValidGround(BlockState state, BlockGetter worldIn, BlockPos pos)
    {
        return state.getBlock() == Blocks.FARMLAND;
    }

    public RenderShape getRenderType(BlockState state)
    {
        return RenderShape.MODEL;
    }

    @OnlyIn(Dist.CLIENT)
    protected ItemLike getSeedsItem()
    {
        return ItemInit.GOBBER2_SEED.get();
    }

    public ItemStack getItem(BlockGetter worldIn, BlockPos pos, BlockState state)
    {
        return new ItemStack(this.getSeedsItem());
    }

    /*
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        return SHAPES[state.get(this.getAgeProperty())];
    }*/
}