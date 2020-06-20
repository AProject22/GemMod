
package net.mcreator.gemmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.gemmod.item.AmetistaItem;
import net.mcreator.gemmod.GemModModElements;

@GemModModElements.ModElement.Tag
public class GemModCreativeTabItemGroup extends GemModModElements.ModElement {
	public GemModCreativeTabItemGroup(GemModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgem_mod_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AmetistaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
