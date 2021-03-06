package net.minecraft.src.blocks.bricks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BrickBlockItem extends ItemBlock
{	
	public static final String blockType[] =
	{
	    "obsidian", "snow", "sandstone", "brick", "netherrack", "diamond", "gold", "lapis", 
	    "slab", "stoneSmall", "slabSmall", "brickTile", "iron", "redstone", "slime", "bone"
	};

    public BrickBlockItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }
    
    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Brick").toString();
    }
}
