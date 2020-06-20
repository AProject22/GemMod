
package net.mcreator.gemmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.gemmod.itemgroup.GemModCreativeTabItemGroup;
import net.mcreator.gemmod.GemModModElements;

@GemModModElements.ModElement.Tag
public class JaspeItem extends GemModModElements.ModElement {
	@ObjectHolder("gem_mod:jaspe")
	public static final Item block = null;
	public JaspeItem(GemModModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GemModCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("jaspe");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
