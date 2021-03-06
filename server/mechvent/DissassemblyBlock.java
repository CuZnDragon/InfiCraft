package net.minecraft.src.mechvent;

import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.forge.MinecraftForge;
import net.minecraft.src.*;

public class DissassemblyBlock extends Block
    implements ITextureProvider
{
    public DissassemblyBlock(int i)
    {
        super(i, 1, Material.wood);
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if (i == 1)
        {
            return (blockIndexInTexture - 1) + j * 4;
        }
        if (i == 0)
        {
            return blockIndexInTexture + 2 + j * 4;
        }
        if (i == 2 || i == 4)
        {
            return blockIndexInTexture + 1 + j * 4;
        }
        else
        {
            return blockIndexInTexture + j * 4;
        }
    }

    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
        	player.openGui(mod_InfiBlocks.getInstance(), mod_InfiBlocks.craftingGuiID, world, x, y, z);
            return true;
        }
    }

    protected int damageDropped(int i)
    {
        return i;
    }

    public String getTextureFile()
    {
        return "/infiblocks/infimachines.png";
    }
}
