package net.minecraft.src.blocks.magicslabs;
import java.util.ArrayList;

import net.minecraft.src.*;

public class MagicSlabSoil extends MagicSlabBase
{	
    public MagicSlabSoil(int i, int j)
    {
        super(i, j, Material.ground);
    }
    
    public int getRenderColor(int md)
    {
        if(md == 1)
        	return getBlockColor();
        else if(md == 15)
        	return getLeavesColor();
        else
        	return 0xffffff;
    }
    
    public int getBlockColor()
    {
        double d = 0.5D;
        double d1 = 1.0D;
        return ColorizerGrass.getGrassColor(d, d1);
    }
    
    public int getLeavesColor()
    {
        double d = 0.5D;
        double d1 = 1.0D;
        return ColorizerFoliage.getFoliageColor(d, d1);
    }
    
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
    {
    	int md = iblockaccess.getBlockMetadata(x, y, z);
    	if (md == 1) //Grass
    	{
    		int var5 = 0;
            int var6 = 0;
            int var7 = 0;

            for (int var8 = -1; var8 <= 1; ++var8)
            {
                for (int var9 = -1; var9 <= 1; ++var9)
                {
                    int var10 = iblockaccess.getBiomeGenForCoords(x + var9, z + var8).getBiomeFoliageColor();
                    var5 += (var10 & 16711680) >> 16;
                    var6 += (var10 & 65280) >> 8;
                    var7 += var10 & 255;
                }
            }

            return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
    	} else
    	
    	if (md == 15) //Leaves
    	{
    		int var5 = iblockaccess.getBlockMetadata(x, y, z);

            if ((var5 & 3) == 1)
            {
                return ColorizerFoliage.getFoliageColorPine();
            }
            else if ((var5 & 3) == 2)
            {
                return ColorizerFoliage.getFoliageColorBirch();
            }
            else
            {
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;

                for (int var9 = -1; var9 <= 1; ++var9)
                {
                    for (int var10 = -1; var10 <= 1; ++var10)
                    {
                        int var11 = iblockaccess.getBiomeGenForCoords(x + var10, z + var9).getBiomeFoliageColor();
                        var6 += (var11 & 16711680) >> 16;
                        var7 += (var11 & 65280) >> 8;
                        var8 += var11 & 255;
                    }
                }

                return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
            }
    	} else
    	{
    		return 0xffffff;
    	}
    }
    @Override
    public int getLightValue(IBlockAccess iba, int x, int y, int z) {
	    int md = iba.getBlockMetadata(x, y, z);
	    if(md == 13)
	    	return 15;
	    else
	    	return 0;
    }
    
    
    protected Block getStepSound(StepSound stepsound, int md)
    {
        stepSound = stepsound;
        return this;
    }
    
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return Block.dirt.getHardness(0);
        case 1: return Block.grass.getHardness(0);
        case 2: return Block.mycelium.getHardness(0);
        case 3: return Block.sand.getHardness(0);
        case 4: return Block.gravel.getHardness(0);
        case 5: return Block.wood.getHardness(0);
        case 6: return Block.wood.getHardness(1);
        case 7: return Block.wood.getHardness(2);
        case 8: return Block.planks.getHardness(0);
        case 9: return Block.snow.getHardness(0);
        case 10: return Block.slowSand.getHardness(0);
        case 11: return Block.mushroomCapBrown.getHardness(0);
        case 12: return Block.mushroomCapRed.getHardness(0);
        case 13: return Block.glowStone.getHardness(0);
        case 14: return Block.glass.getHardness(0);
        case 15: return Block.leaves.getHardness(0);
        default: return 0;
    	}
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        switch(md)
        {
        case 0: return Block.dirt.getBlockTextureFromSideAndMetadata(side, 0);
        case 1: return 0; //Block.grass.getBlockTextureFromSideAndMetadata(side, 0);
        case 2: return Block.mycelium.getBlockTextureFromSideAndMetadata(side, 0);
        case 3: return Block.sand.getBlockTextureFromSideAndMetadata(side, 0);
        case 4: return Block.gravel.getBlockTextureFromSideAndMetadata(side, 0);
        case 5: return 20;
        case 6: return 116;
        case 7: return 117;
        case 8: return Block.planks.getBlockTextureFromSideAndMetadata(side, 0);
        case 9: return Block.snow.getBlockTextureFromSideAndMetadata(side, 0);
        case 10: return Block.slowSand.getBlockTextureFromSideAndMetadata(side, 0);
        case 11:
        	if(side == 0) {
        		return 142;
        	} else {
        		return 142 - 16;
        	}
        	//return Block.mushroomCapBrown.getBlockTextureFromSideAndMetadata(side, 0);
        case 12: 
        	if(side == 0) {
        		return 141;
        	} else {
        		return 141 - 16;
        	}
        	//return Block.mushroomCapRed.getBlockTextureFromSideAndMetadata(side, 0);
        case 13: return Block.glowStone.getBlockTextureFromSideAndMetadata(side, 0);
        case 14: return Block.glass.getBlockTextureFromSideAndMetadata(side, 0);
        case 15: return Block.leaves.getBlockTextureFromSideAndMetadata(side, 0);
        default: return 0;
        }
    }
    
    //Block texture side for grass
    /*public int getBlockTexture(IBlockAccess iblockaccess, int x, int y, int z, int side)
    {
        int md = iblockaccess.getBlockMetadata(x, y, z);
        if(md == 1)
        {
	    	if (side == 1)
	        {
	            return 0;
	        }
	        if (side == 0)
	        {
	            return 2;
	        }
	        Material material = iblockaccess.getBlockMaterial(x, y + 1, z);
	        return material != Material.snow && material != Material.craftedSnow ? 3 : 68;
        } else
        	
        {
        	return getBlockTextureFromSideAndMetadata(side, md);
        }
    }*/
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 0));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 1));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 2));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 3));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 4));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 5));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 6));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 7));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 8));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 9));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 10));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 11));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 12));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 13));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 14));
        arraylist.add(new ItemStack(mod_InfiBlocks.magicSlabSoil, 1, 15));
    }
}
