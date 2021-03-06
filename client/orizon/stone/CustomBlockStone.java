package net.minecraft.src.orizon.stone;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class CustomBlockStone extends Block
    implements ITextureProvider
{
    public CustomBlockStone(int id, int texture)
    {
        super(id, texture, Material.rock);
        enableStats = false;
    }
    
    public boolean getEnableStats() {return false;}

    protected int damageDropped(int md)
    {
        return md;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }

    public String getTextureFile()
    {
        return "/oretex/stone.png";
    }
}
