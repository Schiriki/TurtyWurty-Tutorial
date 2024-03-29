package com.schiriki.tutorialTurty.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
	
	public static final Food EXAMPLE_FOOD = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.SPEED, 100, 2), 0.5F)
			.effect(() -> new EffectInstance(Effects.POISON, 60), 0.05F)
			.fastToEat()
			.hunger(2)
			.saturation(0.2f)
			.setAlwaysEdible()
			.build();

}
