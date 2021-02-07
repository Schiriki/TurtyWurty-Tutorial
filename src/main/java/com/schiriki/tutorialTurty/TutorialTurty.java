package com.schiriki.tutorialTurty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.schiriki.tutorialTurty.core.init.BlockInit;
import com.schiriki.tutorialTurty.core.init.ItemInit;
import com.schiriki.tutorialTurty.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialTurty.MOD_ID)
public class TutorialTurty
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tutorial_turty";
    public static final ItemGroup TUTORIAL_GROUP = new TutorialGroup("tutorialtab");

    public TutorialTurty() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){

    }
    
    public static class TutorialGroup extends ItemGroup {

		public TutorialGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.CUSTOM_BLOCK.get().getDefaultInstance();
		}
    	
		/*
		@Override
		public void fill(NonNullList<ItemStack> items) {
			// TODO Auto-generated method stub
			items.add(Items.ACACIA_BOAT.getDefaultInstance());
			super.fill(items);
		}*/
    }
}
