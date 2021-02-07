package com.schiriki.tutorialTurty.core.init;

import com.schiriki.tutorialTurty.TutorialTurty;
import com.schiriki.tutorialTurty.common.blocks.CustomBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			TutorialTurty.MOD_ID);
	
	//.from(Blocks/ (BlockInit.Blocke_name.get) for copying block
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", 
			()-> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.CYAN_TERRACOTTA)
					.hardnessAndResistance(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> PHANTOM_ORE = BLOCKS.register("phantom_ore", 
			()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
					.hardnessAndResistance(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.sound(SoundType.STONE)
					.setRequiresTool()));
	
	public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block", 
			()-> new CustomBlock(AbstractBlock.Properties.create(Material.WOOD)
					.harvestTool(ToolType.AXE)
					.harvestLevel(1)
					.sound(SoundType.WOOD)
					.setRequiresTool()));
}
