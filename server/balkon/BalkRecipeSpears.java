package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeSpears
{
    public BalkRecipeSpears()
    {
    }

    public static int recipeStorm()
    {
        mod_BalkonInfiWeapons.stWoodSpear.setIconCoord(1, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.stWoodSpear, "Stony Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.saWoodSpear.setIconCoord(2, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.saWoodSpear, "Sandy Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bWoodSpear.setIconCoord(3, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.bWoodSpear, "Necrotic Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pWoodSpear.setIconCoord(4, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.pWoodSpear, "Fibery Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.nWoodSpear.setIconCoord(5, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.nWoodSpear, "Bloody Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.sWoodSpear.setIconCoord(6, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.sWoodSpear, "Slimy Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cWoodSpear.setIconCoord(7, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.cWoodSpear, "Spiny Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fWoodSpear.setIconCoord(8, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.fWoodSpear, "Flaky Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brWoodSpear.setIconCoord(9, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.brWoodSpear, "Baked Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.planks, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.stStoneSpear.setIconCoord(1, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.stStoneSpear, "Heavy Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.saStoneSpear.setIconCoord(2, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.saStoneSpear, "Sandy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bStoneSpear.setIconCoord(3, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.bStoneSpear, "Necrotic Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pStoneSpear.setIconCoord(4, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.pStoneSpear, "Fibery Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.mStoneSpear.setIconCoord(5, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.mStoneSpear, "Mossy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nStoneSpear.setIconCoord(6, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.nStoneSpear, "Bloody Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.iceStoneSpear.setIconCoord(7, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.iceStoneSpear, "Icy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sStoneSpear.setIconCoord(8, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.sStoneSpear, "Slimy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cStoneSpear.setIconCoord(9, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.cStoneSpear, "Spiny Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fStoneSpear.setIconCoord(10, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.fStoneSpear, "Flaky Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brStoneSpear.setIconCoord(11, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.brStoneSpear, "Baked Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.stIronSpear.setIconCoord(1, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.stIronSpear, "Stony Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iIronSpear.setIconCoord(2, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.iIronSpear, "Ironic Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dIronSpear.setIconCoord(3, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.dIronSpear, "Jeweled Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.gIronSpear.setIconCoord(4, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.gIronSpear, "Expensive Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.rIronSpear.setIconCoord(5, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.rIronSpear, "Red Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oIronSpear.setIconCoord(6, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.oIronSpear, "Glassy Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.bIronSpear.setIconCoord(7, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.bIronSpear, "Necrotic Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.nIronSpear.setIconCoord(8, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.nIronSpear, "Bloody Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glIronSpear.setIconCoord(9, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.glIronSpear, "Glowing Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.iceIronSpear.setIconCoord(10, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.iceIronSpear, "Icy Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sIronSpear.setIconCoord(11, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.sIronSpear, "Slimy Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.blIronSpear.setIconCoord(12, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.blIronSpear, "Blazing Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.stDiamondSpear.setIconCoord(1, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.stDiamondSpear, "Stony Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iDiamondSpear.setIconCoord(2, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.iDiamondSpear, "Hard Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dDiamondSpear.setIconCoord(3, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.dDiamondSpear, "Diamondium Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.gDiamondSpear.setIconCoord(4, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.gDiamondSpear, "Expensive Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.rDiamondSpear.setIconCoord(5, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.rDiamondSpear, "Red Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oDiamondSpear.setIconCoord(6, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.oDiamondSpear, "Glassy Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.bDiamondSpear.setIconCoord(7, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.bDiamondSpear, "Necrotic Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mDiamondSpear.setIconCoord(8, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.mDiamondSpear, "Mossy Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nDiamondSpear.setIconCoord(9, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.nDiamondSpear, "Bloody Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glDiamondSpear.setIconCoord(10, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.glDiamondSpear, "Glowing Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.blDiamondSpear.setIconCoord(11, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.blDiamondSpear, "Blazing Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.stGoldSpear.setIconCoord(1, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.stGoldSpear, "Stony Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.gGoldSpear.setIconCoord(2, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.gGoldSpear, "Expensive Useless Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.oGoldSpear.setIconCoord(3, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.oGoldSpear, "Glassy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.saGoldSpear.setIconCoord(4, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.saGoldSpear, "Sandy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bGoldSpear.setIconCoord(5, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.bGoldSpear, "Necrotic Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mGoldSpear.setIconCoord(6, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.mGoldSpear, "Mossy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nGoldSpear.setIconCoord(7, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.nGoldSpear, "Bloody Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glGoldSpear.setIconCoord(8, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.glGoldSpear, "Glowing Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.iceGoldSpear.setIconCoord(9, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.iceGoldSpear, "Icy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sGoldSpear.setIconCoord(10, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.sGoldSpear, "Slimy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.fGoldSpear.setIconCoord(11, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.fGoldSpear, "Flaky Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.wRedstoneSpear.setIconCoord(0, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.wRedstoneSpear, "Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stRedstoneSpear.setIconCoord(1, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.stRedstoneSpear, "Stony Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iRedstoneSpear.setIconCoord(2, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.iRedstoneSpear, "Hard Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dRedstoneSpear.setIconCoord(3, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.dRedstoneSpear, "Jeweled Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.rRedstoneSpear.setIconCoord(4, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.rRedstoneSpear, "Redredred Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oRedstoneSpear.setIconCoord(5, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.oRedstoneSpear, "Glassy Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.bRedstoneSpear.setIconCoord(6, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.bRedstoneSpear, "Necrotic Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mRedstoneSpear.setIconCoord(7, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.mRedstoneSpear, "Mossy Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.glRedstoneSpear.setIconCoord(8, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.glRedstoneSpear, "Glowing Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.sRedstoneSpear.setIconCoord(9, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.sRedstoneSpear, "Slimy Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.blRedstoneSpear.setIconCoord(10, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.blRedstoneSpear, "Blazing Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wObsidianSpear.setIconCoord(0, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.wObsidianSpear, "Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stObsidianSpear.setIconCoord(1, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.stObsidianSpear, "Stony Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iObsidianSpear.setIconCoord(2, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.iObsidianSpear, "Hard Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dObsidianSpear.setIconCoord(3, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.dObsidianSpear, "Jeweled Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.gObsidianSpear.setIconCoord(4, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.gObsidianSpear, "Expensive Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.rObsidianSpear.setIconCoord(5, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.rObsidianSpear, "Red Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oObsidianSpear.setIconCoord(6, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.oObsidianSpear, "Wicked Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.bObsidianSpear.setIconCoord(7, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.bObsidianSpear, "Necrotic Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.nObsidianSpear.setIconCoord(8, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.nObsidianSpear, "Bloody Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glObsidianSpear.setIconCoord(9, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.glObsidianSpear, "Glowing Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.sObsidianSpear.setIconCoord(10, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.sObsidianSpear, "Slimy Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.fObsidianSpear.setIconCoord(11, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.fObsidianSpear, "Flaky Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.blObsidianSpear.setIconCoord(12, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.blObsidianSpear, "Blazing Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wSandstoneSpear.setIconCoord(0, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.wSandstoneSpear, "Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stSandstoneSpear.setIconCoord(1, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.stSandstoneSpear, "Stony Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.saSandstoneSpear.setIconCoord(2, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.saSandstoneSpear, "Sandpoke");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bSandstoneSpear.setIconCoord(3, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.bSandstoneSpear, "Necrotic Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pSandstoneSpear.setIconCoord(4, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.pSandstoneSpear, "Fibery Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.nSandstoneSpear.setIconCoord(5, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.nSandstoneSpear, "Bloody Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.iceSandstoneSpear.setIconCoord(6, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.iceSandstoneSpear, "Icy Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sSandstoneSpear.setIconCoord(7, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.sSandstoneSpear, "Slimy Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cSandstoneSpear.setIconCoord(8, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.cSandstoneSpear, "Spiny Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fSandstoneSpear.setIconCoord(9, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.fSandstoneSpear, "Flaky Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brSandstoneSpear.setIconCoord(10, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.brSandstoneSpear, "Baked Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.wBoneSpear.setIconCoord(0, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.wBoneSpear, "Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stBoneSpear.setIconCoord(1, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.stBoneSpear, "Stony Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iBoneSpear.setIconCoord(2, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.iBoneSpear, "Hard Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dBoneSpear.setIconCoord(3, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.dBoneSpear, "Jeweled Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.rBoneSpear.setIconCoord(4, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.rBoneSpear, "Red Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oBoneSpear.setIconCoord(5, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.oBoneSpear, "Glassy Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.bBoneSpear.setIconCoord(6, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.bBoneSpear, "Reanimated Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mBoneSpear.setIconCoord(7, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.mBoneSpear, "Mossy Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nBoneSpear.setIconCoord(8, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.nBoneSpear, "Netherrack Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glBoneSpear.setIconCoord(9, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.glBoneSpear, "Glowstone Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.sBoneSpear.setIconCoord(10, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.sBoneSpear, "Slimy Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cBoneSpear.setIconCoord(11, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.cBoneSpear, "Spiny Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fBoneSpear.setIconCoord(12, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.fBoneSpear, "Flaky Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brBoneSpear.setIconCoord(13, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.brBoneSpear, "Baked Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.blBoneSpear.setIconCoord(14, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.blBoneSpear, "Blazing Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wPaperSpear.setIconCoord(0, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.wPaperSpear, "Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.saPaperSpear.setIconCoord(1, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.saPaperSpear, "Stony Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bPaperSpear.setIconCoord(2, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.bPaperSpear, "Necrotic Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pPaperSpear.setIconCoord(3, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.pPaperSpear, "Rolled up Paper");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.sPaperSpear.setIconCoord(4, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.sPaperSpear, "Slimy Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cPaperSpear.setIconCoord(5, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.cPaperSpear, "Spiny Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.brPaperSpear.setIconCoord(6, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.brPaperSpear, "Baked Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.stMossySpear.setIconCoord(0, 10);
        ModLoader.addName(mod_BalkonInfiWeapons.stMossySpear, "Stony Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.dMossySpear.setIconCoord(1, 10);
        ModLoader.addName(mod_BalkonInfiWeapons.dMossySpear, "Jeweled Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.rMossySpear.setIconCoord(2, 10);
        ModLoader.addName(mod_BalkonInfiWeapons.rMossySpear, "Red Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.bMossySpear.setIconCoord(3, 10);
        ModLoader.addName(mod_BalkonInfiWeapons.bMossySpear, "Necrotic Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mMossySpear.setIconCoord(4, 10);
        ModLoader.addName(mod_BalkonInfiWeapons.mMossySpear, "Living Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.glMossySpear.setIconCoord(5, 10);
        ModLoader.addName(mod_BalkonInfiWeapons.glMossySpear, "Glowing Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.wNetherrackSpear.setIconCoord(0, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.wNetherrackSpear, "Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stNetherrackSpear.setIconCoord(1, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.stNetherrackSpear, "Stony Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iNetherrackSpear.setIconCoord(2, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.iNetherrackSpear, "Hard Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.rNetherrackSpear.setIconCoord(3, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.rNetherrackSpear, "Red Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oNetherrackSpear.setIconCoord(4, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.oNetherrackSpear, "Glassy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.saNetherrackSpear.setIconCoord(5, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.saNetherrackSpear, "Sandy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bNetherrackSpear.setIconCoord(6, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.bNetherrackSpear, "Necrotic Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mNetherrackSpear.setIconCoord(7, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.mNetherrackSpear, "Mossy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nNetherrackSpear.setIconCoord(8, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.nNetherrackSpear, "Bloody Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glNetherrackSpear.setIconCoord(9, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.glNetherrackSpear, "Glowing Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.iceNetherrackSpear.setIconCoord(10, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.iceNetherrackSpear, "Icy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sNetherrackSpear.setIconCoord(11, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.sNetherrackSpear, "Slimy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cNetherrackSpear.setIconCoord(12, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.cNetherrackSpear, "Spiny Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fNetherrackSpear.setIconCoord(13, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.fNetherrackSpear, "Flaky Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.brNetherrackSpear.setIconCoord(14, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.brNetherrackSpear, "Baked Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.blNetherrackSpear.setIconCoord(15, 11);
        ModLoader.addName(mod_BalkonInfiWeapons.blNetherrackSpear, "Blazing Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.wGlowstoneSpear.setIconCoord(0, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.wGlowstoneSpear, "Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stGlowstoneSpear.setIconCoord(1, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.stGlowstoneSpear, "Stony Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iGlowstoneSpear.setIconCoord(2, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.iGlowstoneSpear, "Hard Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dGlowstoneSpear.setIconCoord(3, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.dGlowstoneSpear, "Jeweled Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.rGlowstoneSpear.setIconCoord(4, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.rGlowstoneSpear, "Red Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oGlowstoneSpear.setIconCoord(5, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.oGlowstoneSpear, "Glassy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.bGlowstoneSpear.setIconCoord(6, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.bGlowstoneSpear, "Necrotic Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.mGlowstoneSpear.setIconCoord(7, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.mGlowstoneSpear, "Mossy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nGlowstoneSpear.setIconCoord(8, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.nGlowstoneSpear, "Bloody Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glGlowstoneSpear.setIconCoord(9, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.glGlowstoneSpear, "Bright Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.iceGlowstoneSpear.setIconCoord(10, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.iceGlowstoneSpear, "Icy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.lGlowstoneSpear.setIconCoord(11, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.lGlowstoneSpear, "Fiery Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.lGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.sGlowstoneSpear.setIconCoord(12, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.sGlowstoneSpear, "Slimy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.blGlowstoneSpear.setIconCoord(13, 12);
        ModLoader.addName(mod_BalkonInfiWeapons.blGlowstoneSpear, "Blazing Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wIceSpear.setIconCoord(0, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.wIceSpear, "Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stIceSpear.setIconCoord(1, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.stIceSpear, "Stony Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iIceSpear.setIconCoord(2, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.iIceSpear, "Hard Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dIceSpear.setIconCoord(3, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.dIceSpear, "Jeweled Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.gIceSpear.setIconCoord(4, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.gIceSpear, "Expensive Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.rIceSpear.setIconCoord(5, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.rIceSpear, "Red Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oIceSpear.setIconCoord(6, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.oIceSpear, "Glassy Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.saIceSpear.setIconCoord(7, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.saIceSpear, "Sandy Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bIceSpear.setIconCoord(8, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.bIceSpear, "Necrotic Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.glIceSpear.setIconCoord(9, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.glIceSpear, "Glowing Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.iceIceSpear.setIconCoord(10, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.iceIceSpear, "Ice Pole");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sIceSpear.setIconCoord(11, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.sIceSpear, "Slimy Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cIceSpear.setIconCoord(12, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.cIceSpear, "Spiny Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fIceSpear.setIconCoord(13, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.fIceSpear, "Flaky Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brIceSpear.setIconCoord(14, 13);
        ModLoader.addName(mod_BalkonInfiWeapons.brIceSpear, "Baked Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.dLavaSpear.setIconCoord(0, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.dLavaSpear, "Jeweled Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.rLavaSpear.setIconCoord(1, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.rLavaSpear, "Red Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.bLavaSpear.setIconCoord(2, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.bLavaSpear, "Necrotic Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.nLavaSpear.setIconCoord(3, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.nLavaSpear, "Bloody Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glLavaSpear.setIconCoord(4, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.glLavaSpear, "Glowing Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.lLavaSpear.setIconCoord(5, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.lLavaSpear, "Pigburn");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.lLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_BalkonInfiWeapons.blLavaSpear.setIconCoord(6, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.blLavaSpear, "Blazing Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wSlimeSpear.setIconCoord(0, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.wSlimeSpear, "Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stSlimeSpear.setIconCoord(1, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.stSlimeSpear, "Stony Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iSlimeSpear.setIconCoord(2, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.iSlimeSpear, "Hard Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.dSlimeSpear.setIconCoord(3, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.dSlimeSpear, "Jeweled Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.gSlimeSpear.setIconCoord(4, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.gSlimeSpear, "Expensive Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.rSlimeSpear.setIconCoord(5, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.rSlimeSpear, "Red Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.oSlimeSpear.setIconCoord(6, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.oSlimeSpear, "Glassy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.saSlimeSpear.setIconCoord(7, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.saSlimeSpear, "Sandy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bSlimeSpear.setIconCoord(8, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.bSlimeSpear, "Necrotic Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pSlimeSpear.setIconCoord(9, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.pSlimeSpear, "Fibery Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.mSlimeSpear.setIconCoord(10, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.mSlimeSpear, "Mossy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.mSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_BalkonInfiWeapons.nSlimeSpear.setIconCoord(11, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.nSlimeSpear, "Bloody Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glSlimeSpear.setIconCoord(12, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.glSlimeSpear, "Glowing Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.iceSlimeSpear.setIconCoord(13, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.iceSlimeSpear, "Icy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.lSlimeSpear.setIconCoord(14, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.lSlimeSpear, "Fiery Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.lSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_BalkonInfiWeapons.sSlimeSpear.setIconCoord(15, 15);
        ModLoader.addName(mod_BalkonInfiWeapons.sSlimeSpear, "Rubber Stick");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cSlimeSpear.setIconCoord(12, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.cSlimeSpear, "Spiny Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fSlimeSpear.setIconCoord(13, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.fSlimeSpear, "Flaky Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brSlimeSpear.setIconCoord(14, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.brSlimeSpear, "Baked Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.blSlimeSpear.setIconCoord(15, 14);
        ModLoader.addName(mod_BalkonInfiWeapons.blSlimeSpear, "Blazing Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wCactusSpear.setIconCoord(10, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.wCactusSpear, "Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_BalkonInfiWeapons.stCactusSpear.setIconCoord(11, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.stCactusSpear, "Stony Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.saCactusSpear.setIconCoord(12, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.saCactusSpear, "Sandy Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bCactusSpear.setIconCoord(13, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.bCactusSpear, "Necrotic Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pCactusSpear.setIconCoord(14, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.pCactusSpear, "Fibery Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.nCactusSpear.setIconCoord(15, 0);
        ModLoader.addName(mod_BalkonInfiWeapons.nCactusSpear, "Bloody Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.sCactusSpear.setIconCoord(12, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.sCactusSpear, "Slimy Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cCactusSpear.setIconCoord(13, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.cCactusSpear, "Spined Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fCactusSpear.setIconCoord(14, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.fCactusSpear, "Flaky Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brCactusSpear.setIconCoord(15, 1);
        ModLoader.addName(mod_BalkonInfiWeapons.brCactusSpear, "Baked Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        /*mod_BalkonInfiWeapons.wFlintSpear.setIconCoord(13, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.wFlintSpear, "Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });*/
        mod_BalkonInfiWeapons.stFlintSpear.setIconCoord(14, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.stFlintSpear, "Stony Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.iFlintSpear.setIconCoord(15, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.iFlintSpear, "Hard Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_BalkonInfiWeapons.gFlintSpear.setIconCoord(12, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.gFlintSpear, "Expensive Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.gFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_BalkonInfiWeapons.oFlintSpear.setIconCoord(13, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.oFlintSpear, "Glassy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.oFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_BalkonInfiWeapons.saFlintSpear.setIconCoord(14, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.saFlintSpear, "Sandy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bFlintSpear.setIconCoord(15, 3);
        ModLoader.addName(mod_BalkonInfiWeapons.bFlintSpear, "Necrotic Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.nFlintSpear.setIconCoord(12, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.nFlintSpear, "Bloody Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.iceFlintSpear.setIconCoord(13, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.iceFlintSpear, "Icy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sFlintSpear.setIconCoord(14, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.sFlintSpear, "Slimy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cFlintSpear.setIconCoord(15, 4);
        ModLoader.addName(mod_BalkonInfiWeapons.cFlintSpear, "Spiny Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fFlintSpear.setIconCoord(11, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.fFlintSpear, "Spear of Sharpening");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brFlintSpear.setIconCoord(12, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.brFlintSpear, "Baked Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.blFlintSpear.setIconCoord(13, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.blFlintSpear, "Blazing Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.wBrickSpear.setIconCoord(14, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.wBrickSpear, "Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick
                });
        mod_BalkonInfiWeapons.stBrickSpear.setIconCoord(15, 5);
        ModLoader.addName(mod_BalkonInfiWeapons.stBrickSpear, "Stony Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.stBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_BalkonInfiWeapons.saBrickSpear.setIconCoord(13, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.saBrickSpear, "Sandstone Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.saBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_BalkonInfiWeapons.bBrickSpear.setIconCoord(14, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.bBrickSpear, "Necrotic Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.pBrickSpear.setIconCoord(15, 6);
        ModLoader.addName(mod_BalkonInfiWeapons.pBrickSpear, "Fibery Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.pBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_BalkonInfiWeapons.nBrickSpear.setIconCoord(11, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.nBrickSpear, "Bloody Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.iceBrickSpear.setIconCoord(12, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.iceBrickSpear, "Icy Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.iceBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_BalkonInfiWeapons.sBrickSpear.setIconCoord(13, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.sBrickSpear, "Slimy Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.sBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_BalkonInfiWeapons.cBrickSpear.setIconCoord(14, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.cBrickSpear, "Spiny Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.cBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_BalkonInfiWeapons.fBrickSpear.setIconCoord(15, 7);
        ModLoader.addName(mod_BalkonInfiWeapons.fBrickSpear, "Flaky Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_BalkonInfiWeapons.brBrickSpear.setIconCoord(15, 8);
        ModLoader.addName(mod_BalkonInfiWeapons.brBrickSpear, "Look-alike Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.brBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_BalkonInfiWeapons.dBlazeSpear.setIconCoord(7, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.dBlazeSpear, "Jeweled Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.dBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_BalkonInfiWeapons.rBlazeSpear.setIconCoord(8, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.rBlazeSpear, "Red Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.rBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_BalkonInfiWeapons.bBlazeSpear.setIconCoord(9, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.bBlazeSpear, "Necrotic Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.bBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_BalkonInfiWeapons.nBlazeSpear.setIconCoord(10, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.nBlazeSpear, "Bloody Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.nBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_BalkonInfiWeapons.glBlazeSpear.setIconCoord(11, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.glBlazeSpear, "Glowing Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.glBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_BalkonInfiWeapons.lBlazeSpear.setIconCoord(12, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.lBlazeSpear, "Fiery Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.lBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.fBlazeSpear.setIconCoord(13, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.fBlazeSpear, "Flaky Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.fBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_BalkonInfiWeapons.blBlazeSpear.setIconCoord(14, 9);
        ModLoader.addName(mod_BalkonInfiWeapons.blBlazeSpear, "Blasted Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.blBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}