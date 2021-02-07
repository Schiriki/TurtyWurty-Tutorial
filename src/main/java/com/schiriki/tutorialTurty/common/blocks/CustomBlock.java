package com.schiriki.tutorialTurty.common.blocks;



import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CustomBlock extends BaseHorizontalBlock {

	public CustomBlock(Properties properties) {
		super(properties);
		runCalculation(Block.makeCuboidShape(8, 0, 4, 15, 1, 13));
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}

}
