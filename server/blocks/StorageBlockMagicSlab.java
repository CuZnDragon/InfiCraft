package net.minecraft.src.blocks;
import java.util.ArrayList;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class StorageBlockMagicSlab extends MagicSlabBase
	implements ITextureProvider
{
    public StorageBlockMagicSlab(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return 3F;
        case 1: return 3F; 
        case 2: return 3F;
        case 3: return 3F;
        case 4: return 3F;
        case 5: return 0.5F;
        case 12: return 1.5F; //Netherrack
        case 13: return Block.sandStone.getHardness(0) * 2F;
        case 14: return Block.stoneBrick.getHardness(0);
        case 15: return Block.brick.getHardness(0);
        default: return 0;
    	}
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture+md;
    }
    
    public String getTextureFile()
    {
        return "/infiblocks/infiblocks.png";
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 0));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 1));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 2));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 3));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 4));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 12));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 13));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 14));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabStone, 1, 15));
    }
}
