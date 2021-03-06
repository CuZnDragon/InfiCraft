package net.minecraft.src.core;

import net.minecraft.src.*;

public class InfiRecipeShovels
{
    public InfiRecipeShovels()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiTools.stWoodShovel.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiTools.stWoodShovel, "Stony Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.saWoodShovel.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiTools.saWoodShovel, "Sandy Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bWoodShovel.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiTools.bWoodShovel, "Necrotic Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pWoodShovel.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiTools.pWoodShovel, "Fibery Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.nWoodShovel.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiTools.nWoodShovel, "Bloody Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.sWoodShovel.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiTools.sWoodShovel, "Slimy Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cWoodShovel.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiTools.cWoodShovel, "Spiny Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fWoodShovel.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiTools.fWoodShovel, "Flaky Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brWoodShovel.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiTools.brWoodShovel, "Baked Wooden Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brWoodShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(Item.shovelStone, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stStoneShovel.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiTools.stStoneShovel, "Heavy Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.saStoneShovel.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiTools.saStoneShovel, "Sandy Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bStoneShovel.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiTools.bStoneShovel, "Necrotic Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pStoneShovel.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiTools.pStoneShovel, "Fibery Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.mStoneShovel.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiTools.mStoneShovel, "Mossy Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nStoneShovel.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiTools.nStoneShovel, "Bloody Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.iceStoneShovel.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiTools.iceStoneShovel, "Icy Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sStoneShovel.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiTools.sStoneShovel, "Slimy Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cStoneShovel.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiTools.cStoneShovel, "Spiny Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fStoneShovel.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiTools.fStoneShovel, "Flaky Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brStoneShovel.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiTools.brStoneShovel, "Baked Stone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.stIronShovel.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiTools.stIronShovel, "Stony Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iIronShovel.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiTools.iIronShovel, "Ironic Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dIronShovel.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiTools.dIronShovel, "Jeweled Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.gIronShovel.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiTools.gIronShovel, "Expensive Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.rIronShovel.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiTools.rIronShovel, "Red Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oIronShovel.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiTools.oIronShovel, "Glassy Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.bIronShovel.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiTools.bIronShovel, "Necrotic Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.nIronShovel.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiTools.nIronShovel, "Bloody Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glIronShovel.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiTools.glIronShovel, "Glowing Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.iceIronShovel.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiTools.iceIronShovel, "Icy Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sIronShovel.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiTools.sIronShovel, "Slimy Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.blIronShovel.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiTools.blIronShovel, "Blazing Iron Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blIronShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.stDiamondShovel.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiTools.stDiamondShovel, "Stony Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iDiamondShovel.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiTools.iDiamondShovel, "Hard Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dDiamondShovel.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiTools.dDiamondShovel, "Diamondium Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.gDiamondShovel.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiTools.gDiamondShovel, "Expensive Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.rDiamondShovel.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiTools.rDiamondShovel, "Red Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oDiamondShovel.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiTools.oDiamondShovel, "Glassy Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.bDiamondShovel.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiTools.bDiamondShovel, "Necrotic Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mDiamondShovel.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiTools.mDiamondShovel, "Mossy Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nDiamondShovel.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiTools.nDiamondShovel, "Bloody Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glDiamondShovel.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiTools.glDiamondShovel, "Glowing Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.blDiamondShovel.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiTools.blDiamondShovel, "Blazing Diamond Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blDiamondShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.stGoldShovel.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiTools.stGoldShovel, "Stony Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.gGoldShovel.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiTools.gGoldShovel, "Expensive Useless Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.oGoldShovel.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiTools.oGoldShovel, "Glassy Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.saGoldShovel.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiTools.saGoldShovel, "Sandy Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bGoldShovel.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiTools.bGoldShovel, "Necrotic Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mGoldShovel.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiTools.mGoldShovel, "Mossy Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nGoldShovel.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiTools.nGoldShovel, "Bloody Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glGoldShovel.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiTools.glGoldShovel, "Glowing Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.iceGoldShovel.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiTools.iceGoldShovel, "Icy Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sGoldShovel.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiTools.sGoldShovel, "Slimy Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.fGoldShovel.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiTools.fGoldShovel, "Flaky Gold Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fGoldShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.wRedstoneShovel.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiTools.wRedstoneShovel, "Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stRedstoneShovel.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiTools.stRedstoneShovel, "Stony Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iRedstoneShovel.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiTools.iRedstoneShovel, "Hard Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dRedstoneShovel.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiTools.dRedstoneShovel, "Jeweled Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.rRedstoneShovel.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiTools.rRedstoneShovel, "Redredred Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oRedstoneShovel.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiTools.oRedstoneShovel, "Glassy Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.bRedstoneShovel.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiTools.bRedstoneShovel, "Necrotic Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mRedstoneShovel.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiTools.mRedstoneShovel, "Mossy Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.glRedstoneShovel.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiTools.glRedstoneShovel, "Glowing Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.sRedstoneShovel.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiTools.sRedstoneShovel, "Slimy Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.blRedstoneShovel.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiTools.blRedstoneShovel, "Blazing Redstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blRedstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wObsidianShovel.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiTools.wObsidianShovel, "Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stObsidianShovel.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiTools.stObsidianShovel, "Stony Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iObsidianShovel.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiTools.iObsidianShovel, "Hard Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dObsidianShovel.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiTools.dObsidianShovel, "Jeweled Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.gObsidianShovel.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiTools.gObsidianShovel, "Expensive Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.rObsidianShovel.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiTools.rObsidianShovel, "Red Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oObsidianShovel.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiTools.oObsidianShovel, "Wicked Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.bObsidianShovel.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiTools.bObsidianShovel, "Necrotic Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.nObsidianShovel.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiTools.nObsidianShovel, "Bloody Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glObsidianShovel.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiTools.glObsidianShovel, "Glowing Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.sObsidianShovel.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiTools.sObsidianShovel, "Slimy Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.fObsidianShovel.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiTools.fObsidianShovel, "Flaky Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.blObsidianShovel.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiTools.blObsidianShovel, "Blazing Obsidian Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blObsidianShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wSandstoneShovel.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiTools.wSandstoneShovel, "Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stSandstoneShovel.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiTools.stSandstoneShovel, "Stony Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.saSandstoneShovel.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiTools.saSandstoneShovel, "Sandspill");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bSandstoneShovel.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiTools.bSandstoneShovel, "Necrotic Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pSandstoneShovel.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiTools.pSandstoneShovel, "Fibery Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.nSandstoneShovel.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiTools.nSandstoneShovel, "Bloody Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.iceSandstoneShovel.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiTools.iceSandstoneShovel, "Icy Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sSandstoneShovel.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiTools.sSandstoneShovel, "Slimy Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cSandstoneShovel.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiTools.cSandstoneShovel, "Spiny Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fSandstoneShovel.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiTools.fSandstoneShovel, "Flaky Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brSandstoneShovel.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiTools.brSandstoneShovel, "Baked Sandstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brSandstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.wBoneShovel.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiTools.wBoneShovel, "Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stBoneShovel.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiTools.stBoneShovel, "Stony Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iBoneShovel.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiTools.iBoneShovel, "Hard Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dBoneShovel.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiTools.dBoneShovel, "Jeweled Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.rBoneShovel.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiTools.rBoneShovel, "Red Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oBoneShovel.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiTools.oBoneShovel, "Glassy Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.bBoneShovel.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiTools.bBoneShovel, "Reanimated Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mBoneShovel.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiTools.mBoneShovel, "Mossy Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nBoneShovel.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiTools.nBoneShovel, "Netherrack Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glBoneShovel.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiTools.glBoneShovel, "Glowstone Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.sBoneShovel.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiTools.sBoneShovel, "Slimy Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cBoneShovel.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiTools.cBoneShovel, "Spiny Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fBoneShovel.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiTools.fBoneShovel, "Flaky Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brBoneShovel.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiTools.brBoneShovel, "Baked Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.blBoneShovel.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiTools.blBoneShovel, "Blazing Bone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blBoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wPaperShovel.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiTools.wPaperShovel, "Paper Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.saPaperShovel.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiTools.saPaperShovel, "Stony Paper Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bPaperShovel.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiTools.bPaperShovel, "Necrotic Paper Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pPaperShovel.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiTools.pPaperShovel, "Soft Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.sPaperShovel.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiTools.sPaperShovel, "Slimy Paper Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cPaperShovel.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiTools.cPaperShovel, "Spiny Paper Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.brPaperShovel.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiTools.brPaperShovel, "Baked Paper Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brPaperShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.stMossyShovel.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiTools.stMossyShovel, "Stony Moss-Covered Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.dMossyShovel.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiTools.dMossyShovel, "Jeweled Moss-Covered Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.rMossyShovel.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiTools.rMossyShovel, "Red Moss-Covered Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.bMossyShovel.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiTools.bMossyShovel, "Necrotic Moss-Covered Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mMossyShovel.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiTools.mMossyShovel, "Living Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.glMossyShovel.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiTools.glMossyShovel, "Glowing Moss-Covered Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glMossyShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.wNetherrackShovel.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiTools.wNetherrackShovel, "Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stNetherrackShovel.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiTools.stNetherrackShovel, "Stony Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iNetherrackShovel.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiTools.iNetherrackShovel, "Hard Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.rNetherrackShovel.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiTools.rNetherrackShovel, "Red Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oNetherrackShovel.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiTools.oNetherrackShovel, "Glassy Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.saNetherrackShovel.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiTools.saNetherrackShovel, "Sandy Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bNetherrackShovel.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiTools.bNetherrackShovel, "Necrotic Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mNetherrackShovel.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiTools.mNetherrackShovel, "Mossy Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nNetherrackShovel.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiTools.nNetherrackShovel, "Blood Spade");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glNetherrackShovel.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiTools.glNetherrackShovel, "Glowing Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.iceNetherrackShovel.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiTools.iceNetherrackShovel, "Icy Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sNetherrackShovel.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiTools.sNetherrackShovel, "Slimy Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cNetherrackShovel.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiTools.cNetherrackShovel, "Spiny Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fNetherrackShovel.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiTools.fNetherrackShovel, "Flaky Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.brNetherrackShovel.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiTools.brNetherrackShovel, "Baked Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.blNetherrackShovel.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiTools.blNetherrackShovel, "Blazing Netherrack Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blNetherrackShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.wGlowstoneShovel.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiTools.wGlowstoneShovel, "Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stGlowstoneShovel.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiTools.stGlowstoneShovel, "Stony Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iGlowstoneShovel.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiTools.iGlowstoneShovel, "Hard Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dGlowstoneShovel.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiTools.dGlowstoneShovel, "Jeweled Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.rGlowstoneShovel.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiTools.rGlowstoneShovel, "Red Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oGlowstoneShovel.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiTools.oGlowstoneShovel, "Glassy Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.bGlowstoneShovel.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiTools.bGlowstoneShovel, "Necrotic Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.mGlowstoneShovel.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiTools.mGlowstoneShovel, "Mossy Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nGlowstoneShovel.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiTools.nGlowstoneShovel, "Bloody Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glGlowstoneShovel.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiTools.glGlowstoneShovel, "Bright Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.iceGlowstoneShovel.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiTools.iceGlowstoneShovel, "Icy Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.lGlowstoneShovel.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiTools.lGlowstoneShovel, "Fiery Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.lGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.sGlowstoneShovel.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiTools.sGlowstoneShovel, "Slimy Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.blGlowstoneShovel.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiTools.blGlowstoneShovel, "Blazing Glowstone Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blGlowstoneShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wIceShovel.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiTools.wIceShovel, "Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stIceShovel.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiTools.stIceShovel, "Stony Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iIceShovel.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiTools.iIceShovel, "Hard Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dIceShovel.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiTools.dIceShovel, "Jeweled Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.gIceShovel.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiTools.gIceShovel, "Expensive Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.rIceShovel.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiTools.rIceShovel, "Red Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oIceShovel.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiTools.oIceShovel, "Glassy Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.saIceShovel.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiTools.saIceShovel, "Sandy Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bIceShovel.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiTools.bIceShovel, "Necrotic Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.glIceShovel.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiTools.glIceShovel, "Glowing Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.iceIceShovel.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiTools.iceIceShovel, "Freezing Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sIceShovel.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiTools.sIceShovel, "Slimy Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cIceShovel.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiTools.cIceShovel, "Spiny Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fIceShovel.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiTools.fIceShovel, "Flaky Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brIceShovel.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiTools.brIceShovel, "Baked Ice Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brIceShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.dLavaShovel.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiTools.dLavaShovel, "Jeweled Lava Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.rLavaShovel.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiTools.rLavaShovel, "Red Lava Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.bLavaShovel.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiTools.bLavaShovel, "Necrotic Lava Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.nLavaShovel.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiTools.nLavaShovel, "Bloody Lava Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glLavaShovel.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiTools.glLavaShovel, "Glowing Lava Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.lLavaShovel.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiTools.lLavaShovel, "Char Soiler");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.lLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiTools.blLavaShovel.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiTools.blLavaShovel, "Blazing Lava Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blLavaShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wSlimeShovel.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiTools.wSlimeShovel, "Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stSlimeShovel.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiTools.stSlimeShovel, "Stony Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iSlimeShovel.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiTools.iSlimeShovel, "Hard Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.dSlimeShovel.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiTools.dSlimeShovel, "Jeweled Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.gSlimeShovel.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiTools.gSlimeShovel, "Expensive Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.rSlimeShovel.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiTools.rSlimeShovel, "Red Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.oSlimeShovel.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiTools.oSlimeShovel, "Glassy Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.saSlimeShovel.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiTools.saSlimeShovel, "Sandy Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bSlimeShovel.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiTools.bSlimeShovel, "Necrotic Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pSlimeShovel.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiTools.pSlimeShovel, "Fibery Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.mSlimeShovel.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiTools.mSlimeShovel, "Mossy Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiTools.nSlimeShovel.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiTools.nSlimeShovel, "Bloody Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glSlimeShovel.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiTools.glSlimeShovel, "Glowing Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.iceSlimeShovel.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiTools.iceSlimeShovel, "Icy Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.lSlimeShovel.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiTools.lSlimeShovel, "Fiery Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.lSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiTools.sSlimeShovel.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiTools.sSlimeShovel, "Slimedigger");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cSlimeShovel.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiTools.cSlimeShovel, "Spiny Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fSlimeShovel.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiTools.fSlimeShovel, "Flaky Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brSlimeShovel.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiTools.brSlimeShovel, "Baked Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.blSlimeShovel.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiTools.blSlimeShovel, "Blazing Slime Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blSlimeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wCactusShovel.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiTools.wCactusShovel, "Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stCactusShovel.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiTools.stCactusShovel, "Stony Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.saCactusShovel.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiTools.saCactusShovel, "Sandy Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bCactusShovel.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiTools.bCactusShovel, "Necrotic Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pCactusShovel.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiTools.pCactusShovel, "Fibery Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.nCactusShovel.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiTools.nCactusShovel, "Bloody Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.sCactusShovel.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiTools.sCactusShovel, "Slimy Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cCactusShovel.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiTools.cCactusShovel, "Spined Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fCactusShovel.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiTools.fCactusShovel, "Flaky Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brCactusShovel.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiTools.brCactusShovel, "Baked Cactus Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brCactusShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.wFlintShovel.setIconCoord(13, 2);
        ModLoader.addName(mod_InfiTools.wFlintShovel, "Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stFlintShovel.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiTools.stFlintShovel, "Stony Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.iFlintShovel.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiTools.iFlintShovel, "Hard Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiTools.gFlintShovel.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiTools.gFlintShovel, "Expensive Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.gFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiTools.oFlintShovel.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiTools.oFlintShovel, "Glassy Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.oFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiTools.saFlintShovel.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiTools.saFlintShovel, "Sandy Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bFlintShovel.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiTools.bFlintShovel, "Necrotic Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.nFlintShovel.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiTools.nFlintShovel, "Bloody Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.iceFlintShovel.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiTools.iceFlintShovel, "Icy Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sFlintShovel.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiTools.sFlintShovel, "Slimy Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cFlintShovel.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiTools.cFlintShovel, "Spiny Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fFlintShovel.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiTools.fFlintShovel, "Rough-hewn Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brFlintShovel.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiTools.brFlintShovel, "Baked Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.blFlintShovel.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiTools.blFlintShovel, "Blazing Flint Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blFlintShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiTools.wBrickShovel.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiTools.wBrickShovel, "Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.wBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.stick
                });
        mod_InfiTools.stBrickShovel.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiTools.stBrickShovel, "Stony Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiTools.saBrickShovel.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiTools.saBrickShovel, "Sandstone Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiTools.bBrickShovel.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiTools.bBrickShovel, "Necrotic Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.pBrickShovel.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiTools.pBrickShovel, "Fibery Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiTools.nBrickShovel.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiTools.nBrickShovel, "Bloody Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.iceBrickShovel.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiTools.iceBrickShovel, "Icy Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiTools.sBrickShovel.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiTools.sBrickShovel, "Slimy Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiTools.cBrickShovel.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiTools.cBrickShovel, "Spiny Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiTools.fBrickShovel.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiTools.fBrickShovel, "Flaky Brick Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.brBrickShovel.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiTools.brBrickShovel, "Look-alike Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brBrickShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiTools.dBlazeShovel.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiTools.dBlazeShovel, "Jeweled Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.dBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiTools.rBlazeShovel.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiTools.rBlazeShovel, "Red Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.rBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiTools.bBlazeShovel.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiTools.bBlazeShovel, "Necrotic Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiTools.nBlazeShovel.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiTools.nBlazeShovel, "Bloody Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiTools.glBlazeShovel.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiTools.glBlazeShovel, "Glowing Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.glBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiTools.lBlazeShovel.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiTools.lBlazeShovel, "Fiery Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.lBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiTools.fBlazeShovel.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiTools.fBlazeShovel, "Flaky Blaze Shovel");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiTools.blBlazeShovel.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiTools.blBlazeShovel, "All dirt are belong to us");
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.blBlazeShovel, 1), new Object[]
                {
                    "m", "|", "|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}
