package net.minecraft.src.inficore.buckets;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.inficore.Items;

public class InfiBucketGoldMilk extends Item
	implements ITextureProvider
{
    public InfiBucketGoldMilk(int i)
    {
        super(i);
        setMaxStackSize(1);
        this.setItemName("bucketGold");
    }

    public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        itemstack.stackSize--;
        if (!world.isRemote)
        {
            entityplayer.clearActivePotions();
        }
        if (itemstack.stackSize <= 0)
        {
            return new ItemStack(Items.goldBucketEmpty);
        }
        else
        {
            return itemstack;
        }
    }

    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        return itemstack;
    }
    
    public String getTextureFile()
    {
        return "/inficore/items.png";
    }
}
