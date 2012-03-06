package net.minecraft.src.orizon;
import java.util.ArrayList;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class ColoredStone extends Block
	implements ITextureProvider
{
    public ColoredStone(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    protected int damageDropped(int md)
    {
        return md;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
    
    /*public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 0));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 1));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 2));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 3));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 4));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 5));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 6));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 7));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 8));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 9));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 10));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 11));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 12));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 13));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 14));
        arraylist.add(new ItemStack(mod_InfiBlocks.brick, 1, 15));
    }*/
    
    public String getTextureFile()
    {
        return "/oretex/stone.png";
    }
}