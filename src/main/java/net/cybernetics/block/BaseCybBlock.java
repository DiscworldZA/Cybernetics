package net.cybernetics.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseCybBlock extends Block
{
	protected BaseCybBlock(Material mat, String name)
    {
	    super(mat);
	    this.setBlockName(name);
	    this.setBlockTextureName(name);
    }
	
}
