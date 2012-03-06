package net.minecraft.src.blocks;

import net.minecraft.src.*;

public class InfiCarpetItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "lightgray", "cyan",
        "purple", "blue", "brown", "green", "red", "black"
    };

    public InfiCarpetItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.woolCarpet.getBlockTextureFromSideAndMetadata(2, InfiCarpetBlock.getBlockFromDye(i));
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Carpet").toString();
    }
}