
package net.mcreator.gemmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.gemmod.itemgroup.GemModCreativeTabItemGroup;
import net.mcreator.gemmod.item.MalaquitaItem;
import net.mcreator.gemmod.GemModModElements;

import java.util.List;
import java.util.Collections;

@GemModModElements.ModElement.Tag
public class MinerioDeMalaquitaBlock extends GemModModElements.ModElement {
	@ObjectHolder("gem_mod:minerio_de_malaquita")
	public static final Block block = null;
	public MinerioDeMalaquitaBlock(GemModModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(GemModCreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(4)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("minerio_de_malaquita");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(MalaquitaItem.block, (int) (1)));
		}
	}
}
