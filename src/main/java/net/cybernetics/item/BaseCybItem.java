package net.cybernetics.item;

import net.minecraft.item.Item;

public class BaseCybItem extends Item
{
	protected BaseCybItem(String name)
	{
		this.setUnlocalizedName(name);
		this.setTextureName(name);
	}
}
