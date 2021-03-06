package net.minecraft.src.infi2x2;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.mod_Infi2x2;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfi2x2 {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/2x2Extended.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_Infi2x2. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-600 range for blocks
         */
        mod_Infi2x2.infitoolsPresent = config.getOrCreateBooleanProperty("Add InfiTool Combinations", "general", true).getBoolean(true);
        
        enableWoodTools = config.getOrCreateBooleanProperty("Enable Wooden Tools", "general", true).getBoolean(true);
        enableStoneTools = config.getOrCreateBooleanProperty("Enable Stone Tools", "general", true).getBoolean(true);
        enableIronTools = config.getOrCreateBooleanProperty("Enable Iron Tools", "general", true).getBoolean(true);
        enableDiamondTools = config.getOrCreateBooleanProperty("Enable Diamond Tools", "general", true).getBoolean(true);
        enableRedstoneTools = config.getOrCreateBooleanProperty("Enable Redstone Tools", "general", true).getBoolean(true);
        enableObsidianTools = config.getOrCreateBooleanProperty("Enable Obsidian Tools", "general", true).getBoolean(true);
        enableSandstoneTools = config.getOrCreateBooleanProperty("Enable Sandstone Tools", "general", true).getBoolean(true);
        enableBoneTools = config.getOrCreateBooleanProperty("Enable Bone Tools", "general", true).getBoolean(true);
        enablePaperTools = config.getOrCreateBooleanProperty("Enable Paper Tools", "general", true).getBoolean(true);
        enableMossyTools = config.getOrCreateBooleanProperty("Enable Mossy Tools", "general", true).getBoolean(true);
        enableNetherrackTools = config.getOrCreateBooleanProperty("Enable Netherrack Tools", "general", true).getBoolean(true);
        enableGlowstoneTools = config.getOrCreateBooleanProperty("Enable Glowstone Tools", "general", true).getBoolean(true);
        enableIceTools = config.getOrCreateBooleanProperty("Enable Ice Tools", "general", true).getBoolean(true);
        enableLavaTools = config.getOrCreateBooleanProperty("Enable Lava Tools", "general", true).getBoolean(true);
        enableSlimeTools = config.getOrCreateBooleanProperty("Enable Slime Tools", "general", true).getBoolean(true);
        enableCactusTools = config.getOrCreateBooleanProperty("Enable Cactus Tools", "general", true).getBoolean(true);
        enableFlintTools = config.getOrCreateBooleanProperty("Enable Flint Tools", "general", true).getBoolean(true);
        enableBlazeTools = config.getOrCreateBooleanProperty("Enable Blaze Tools", "general", true).getBoolean(true);
        
        enableCopperTools = config.getOrCreateBooleanProperty("Enable Copper Tools", "general", true).getBoolean(true);
        enableBronzeTools = config.getOrCreateBooleanProperty("Enable Bronze Tools", "general", true).getBoolean(true);
        enableWorkedIronTools = config.getOrCreateBooleanProperty("Enable Worked Iron Tools", "general", true).getBoolean(true);
        enableSteelTools = config.getOrCreateBooleanProperty("Enable Steel Tools", "general", true).getBoolean(true);
        enableCobaltTools = config.getOrCreateBooleanProperty("Enable Cobalt Tools", "general", true).getBoolean(true);
        enableArditeTools = config.getOrCreateBooleanProperty("Enable Ardite Tools", "general", true).getBoolean(true);
        enableManyullynTools = config.getOrCreateBooleanProperty("Enable Manyullyn Tools", "general", true).getBoolean(true);
        enableUraniumTools = config.getOrCreateBooleanProperty("Enable Uranium Tools", "general", true).getBoolean(true);
        
        woodHandpickID = config.getOrCreateIntProperty("Wooden Handpicks", "item", 21001).getInt(21001);
        stoneHandpickID = config.getOrCreateIntProperty("Stone Handpicks", "item", 21008).getInt(21008);
        ironHandpickID = config.getOrCreateIntProperty("Iron Handpicks", "item", 21017).getInt(21017);
        diamondHandpickID = config.getOrCreateIntProperty("Diamond Handpicks", "item", 21026).getInt(21026);
        redstoneHandpickID = config.getOrCreateIntProperty("Redstone Handpicks", "item", 21048).getInt(21048);
        obsidianHandpickID = config.getOrCreateIntProperty("Obsidian Handpicks", "item", 21068).getInt(21068);
        sandstoneHandpickID = config.getOrCreateIntProperty("Sandstone Handpicks", "item", 21078).getInt(21078);
        boneHandpickID = config.getOrCreateIntProperty("Bone Handpicks", "item", 21086).getInt(21086);
        paperHandpickID = config.getOrCreateIntProperty("Paper Handpicks", "item", 21095).getInt(21095);
        mossyHandpickID = config.getOrCreateIntProperty("Mossy Handpicks", "item", 21100).getInt(21100);
        netherrackHandpickID = config.getOrCreateIntProperty("Netherrack Handpicks", "item", 21112).getInt(21112);
        glowstoneHandpickID = config.getOrCreateIntProperty("Glowstone Handpicks", "item", 21125).getInt(21125);
        iceHandpickID = config.getOrCreateIntProperty("Ice Handpicks", "item", 21134).getInt(21134);
        lavaHandpickID = config.getOrCreateIntProperty("Lava Handpicks", "item", 21140).getInt(21140);
        slimeHandpickID = config.getOrCreateIntProperty("Slime Handpicks", "item", 21148).getInt(21148);
        cactusHandpickID = config.getOrCreateIntProperty("Cactus Handpicks", "item", 21154).getInt(21154);
        flintHandpickID = config.getOrCreateIntProperty("Flint Handpicks", "item", 21161).getInt(21161);
        blazeHandpickID = config.getOrCreateIntProperty("Blaze Handpicks", "item", 21171).getInt(21171);
        
        copperHandpickID = config.getOrCreateIntProperty("Copper Handpicks", "item", 21179).getInt(21179);
        bronzeHandpickID = config.getOrCreateIntProperty("Bronze Handpicks", "item", 21187).getInt(21187);
        workedIronHandpickID = config.getOrCreateIntProperty("Worked Iron Handpicks", "item", 21196).getInt(21196);
        steelHandpickID = config.getOrCreateIntProperty("Steel Handpicks", "item", 21214).getInt(21214);
        cobaltHandpickID = config.getOrCreateIntProperty("Cobalt Handpicks", "item", 21234).getInt(21234);
        arditeHandpickID = config.getOrCreateIntProperty("Ardite Handpicks", "item", 21252).getInt(21252);
        manyullynHandpickID = config.getOrCreateIntProperty("Manyullyn Handpicks", "item", 21270).getInt(21270);
        uraniumHandpickID = config.getOrCreateIntProperty("Uranium Handpicks", "item", 21288).getInt(21288);
        
        woodDaggerID = config.getOrCreateIntProperty("Wooden Daggers", "item", 21301).getInt(21301);
        stoneDaggerID = config.getOrCreateIntProperty("Stone Daggers", "item", 21308).getInt(21308);
        ironDaggerID = config.getOrCreateIntProperty("Iron Daggers", "item", 21317).getInt(21317);
        diamondDaggerID = config.getOrCreateIntProperty("Diamond Daggers", "item", 21326).getInt(21326);
        redstoneDaggerID = config.getOrCreateIntProperty("Redstone Daggers", "item", 21348).getInt(21348);
        obsidianDaggerID = config.getOrCreateIntProperty("Obsidian Daggers", "item", 21368).getInt(21368);
        sandstoneDaggerID = config.getOrCreateIntProperty("Sandstone Daggers", "item", 21378).getInt(21378);
        boneDaggerID = config.getOrCreateIntProperty("Bone Daggers", "item", 21386).getInt(21386);
        paperDaggerID = config.getOrCreateIntProperty("Paper Daggers", "item", 21395).getInt(21395);
        mossyDaggerID = config.getOrCreateIntProperty("Mossy Daggers", "item", 21400).getInt(21400);
        netherrackDaggerID = config.getOrCreateIntProperty("Netherrack Daggers", "item", 21412).getInt(21412);
        glowstoneDaggerID = config.getOrCreateIntProperty("Glowstone Daggers", "item", 21425).getInt(21425);
        iceDaggerID = config.getOrCreateIntProperty("Ice Daggers", "item", 21434).getInt(21434);
        lavaDaggerID = config.getOrCreateIntProperty("Lava Daggers", "item", 21440).getInt(21440);
        slimeDaggerID = config.getOrCreateIntProperty("Slime Daggers", "item", 21448).getInt(21448);
        cactusDaggerID = config.getOrCreateIntProperty("Cactus Daggers", "item", 21454).getInt(21454);
        flintDaggerID = config.getOrCreateIntProperty("Flint Daggers", "item", 21461).getInt(21461);
        blazeDaggerID = config.getOrCreateIntProperty("Blaze Daggers", "item", 21471).getInt(21471);
        
        copperDaggerID = config.getOrCreateIntProperty("Copper Daggers", "item", 21479).getInt(21479);
        bronzeDaggerID = config.getOrCreateIntProperty("Bronze Daggers", "item", 21487).getInt(21487);
        workedIronDaggerID = config.getOrCreateIntProperty("Worked Iron Daggers", "item", 21496).getInt(21496);
        steelDaggerID = config.getOrCreateIntProperty("Steel Daggers", "item", 21514).getInt(21514);
        cobaltDaggerID = config.getOrCreateIntProperty("Cobalt Daggers", "item", 21534).getInt(21534);
        arditeDaggerID = config.getOrCreateIntProperty("Ardite Daggers", "item", 21552).getInt(21552);
        manyullynDaggerID = config.getOrCreateIntProperty("Manyullyn Daggers", "item", 21570).getInt(21570);
        uraniumDaggerID = config.getOrCreateIntProperty("Uranium Daggers", "item", 21588).getInt(21588);
        
        woodTrowelID = config.getOrCreateIntProperty("Wooden Trowels", "item", 21601).getInt(21601);
        stoneTrowelID = config.getOrCreateIntProperty("Stone Trowels", "item", 21608).getInt(21608);
        ironTrowelID = config.getOrCreateIntProperty("Iron Trowels", "item", 21617).getInt(21617);
        diamondTrowelID = config.getOrCreateIntProperty("Diamond Trowels", "item", 21626).getInt(21626);
        redstoneTrowelID = config.getOrCreateIntProperty("Redstone Trowels", "item", 21648).getInt(21648);
        obsidianTrowelID = config.getOrCreateIntProperty("Obsidian Trowels", "item", 21668).getInt(21668);
        sandstoneTrowelID = config.getOrCreateIntProperty("Sandstone Trowels", "item", 21678).getInt(21678);
        boneTrowelID = config.getOrCreateIntProperty("Bone Trowels", "item", 21686).getInt(21686);
        paperTrowelID = config.getOrCreateIntProperty("Paper Trowels", "item", 21695).getInt(21695);
        mossyTrowelID = config.getOrCreateIntProperty("Mossy Trowels", "item", 21700).getInt(21700);
        netherrackTrowelID = config.getOrCreateIntProperty("Netherrack Trowels", "item", 21712).getInt(21712);
        glowstoneTrowelID = config.getOrCreateIntProperty("Glowstone Trowels", "item", 21725).getInt(21725);
        iceTrowelID = config.getOrCreateIntProperty("Ice Trowels", "item", 21734).getInt(21734);
        lavaTrowelID = config.getOrCreateIntProperty("Lava Trowels", "item", 21740).getInt(21740);
        slimeTrowelID = config.getOrCreateIntProperty("Slime Trowels", "item", 21748).getInt(21748);
        cactusTrowelID = config.getOrCreateIntProperty("Cactus Trowels", "item", 21754).getInt(21754);
        flintTrowelID = config.getOrCreateIntProperty("Flint Trowels", "item", 21761).getInt(21761);
        blazeTrowelID = config.getOrCreateIntProperty("Blaze Trowels", "item", 21771).getInt(21771);
        
        copperTrowelID = config.getOrCreateIntProperty("Copper Trowels", "item", 21779).getInt(21779);
        bronzeTrowelID = config.getOrCreateIntProperty("Bronze Trowels", "item", 21787).getInt(21787);
        workedIronTrowelID = config.getOrCreateIntProperty("Worked Iron Trowels", "item", 21796).getInt(21796);
        steelTrowelID = config.getOrCreateIntProperty("Steel Trowels", "item", 21814).getInt(21814);
        cobaltTrowelID = config.getOrCreateIntProperty("Cobalt Trowels", "item", 21834).getInt(21834);
        arditeTrowelID = config.getOrCreateIntProperty("Ardite Trowels", "item", 21852).getInt(21852);
        manyullynTrowelID = config.getOrCreateIntProperty("Manyullyn Trowels", "item", 21870).getInt(21870);
        uraniumTrowelID = config.getOrCreateIntProperty("Uranium Trowels", "item", 21888).getInt(21888);
        
        woodHatchetID = config.getOrCreateIntProperty("Wooden Hatchets", "item", 21901).getInt(21901);
        stoneHatchetID = config.getOrCreateIntProperty("Stone Hatchets", "item", 21908).getInt(21908);
        ironHatchetID = config.getOrCreateIntProperty("Iron Hatchets", "item", 21917).getInt(21917);
        diamondHatchetID = config.getOrCreateIntProperty("Diamond Hatchets", "item", 21926).getInt(21926);
        redstoneHatchetID = config.getOrCreateIntProperty("Redstone Hatchets", "item", 21948).getInt(21948);
        obsidianHatchetID = config.getOrCreateIntProperty("Obsidian Hatchets", "item", 21968).getInt(21968);
        sandstoneHatchetID = config.getOrCreateIntProperty("Sandstone Hatchets", "item", 21978).getInt(21978);
        boneHatchetID = config.getOrCreateIntProperty("Bone Hatchets", "item", 21986).getInt(21986);
        paperHatchetID = config.getOrCreateIntProperty("Paper Hatchets", "item", 21995).getInt(21995);
        mossyHatchetID = config.getOrCreateIntProperty("Mossy Hatchets", "item", 22000).getInt(22000);
        netherrackHatchetID = config.getOrCreateIntProperty("Netherrack Hatchets", "item", 22012).getInt(22012);
        glowstoneHatchetID = config.getOrCreateIntProperty("Glowstone Hatchets", "item", 22025).getInt(22025);
        iceHatchetID = config.getOrCreateIntProperty("Ice Hatchets", "item", 22034).getInt(22034);
        lavaHatchetID = config.getOrCreateIntProperty("Lava Hatchets", "item", 22040).getInt(22040);
        slimeHatchetID = config.getOrCreateIntProperty("Slime Hatchets", "item", 22048).getInt(22048);
        cactusHatchetID = config.getOrCreateIntProperty("Cactus Hatchets", "item", 22054).getInt(22054);
        flintHatchetID = config.getOrCreateIntProperty("Flint Hatchets", "item", 22061).getInt(22061);
        blazeHatchetID = config.getOrCreateIntProperty("Blaze Hatchets", "item", 22071).getInt(22071);
        
        copperHatchetID = config.getOrCreateIntProperty("Copper Hatchets", "item", 22079).getInt(22079);
        bronzeHatchetID = config.getOrCreateIntProperty("Bronze Hatchets", "item", 22087).getInt(22087);
        workedIronHatchetID = config.getOrCreateIntProperty("Worked Iron Hatchets", "item", 22096).getInt(22096);
        steelHatchetID = config.getOrCreateIntProperty("Steel Hatchets", "item", 22114).getInt(22114);
        cobaltHatchetID = config.getOrCreateIntProperty("Cobalt Hatchets", "item", 22134).getInt(22134);
        arditeHatchetID = config.getOrCreateIntProperty("Ardite Hatchets", "item", 22152).getInt(22152);
        manyullynHatchetID = config.getOrCreateIntProperty("Manyullyn Hatchets", "item", 22170).getInt(22170);
        uraniumHatchetID = config.getOrCreateIntProperty("Uranium Hatchets", "item", 22188).getInt(22188);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static boolean enableWoodTools;
    public static boolean enableStoneTools;
    public static boolean enableIronTools;
    public static boolean enableDiamondTools;
    public static boolean enableRedstoneTools;
    public static boolean enableObsidianTools;
    public static boolean enableSandstoneTools;
    public static boolean enableBoneTools;
    public static boolean enablePaperTools;
    public static boolean enableMossyTools;
    public static boolean enableNetherrackTools;
    public static boolean enableGlowstoneTools;
    public static boolean enableIceTools;
    public static boolean enableLavaTools;
    public static boolean enableSlimeTools;
    public static boolean enableCactusTools;
    public static boolean enableFlintTools;
    public static boolean enableBlazeTools;
    
    public static boolean enableCopperTools;
    public static boolean enableBronzeTools;
    public static boolean enableWorkedIronTools;
    public static boolean enableSteelTools;
    public static boolean enableCobaltTools;
    public static boolean enableArditeTools;
    public static boolean enableManyullynTools;
    public static boolean enableUraniumTools;
    
    public static int woodHandpickID;
    public static int stoneHandpickID;
    public static int ironHandpickID;
    public static int diamondHandpickID;
    public static int redstoneHandpickID;
    public static int obsidianHandpickID;
    public static int sandstoneHandpickID;
    public static int boneHandpickID;
    public static int paperHandpickID;
    public static int mossyHandpickID;
    public static int netherrackHandpickID;
    public static int glowstoneHandpickID;
    public static int iceHandpickID;
    public static int lavaHandpickID;
    public static int slimeHandpickID;
    public static int cactusHandpickID;
    public static int flintHandpickID;
    public static int blazeHandpickID;
    
    public static int copperHandpickID;
    public static int bronzeHandpickID;
    public static int workedIronHandpickID;
    public static int steelHandpickID;
    public static int cobaltHandpickID;
    public static int arditeHandpickID;
    public static int manyullynHandpickID;
    public static int uraniumHandpickID;
    
    public static int woodDaggerID;
    public static int stoneDaggerID;
    public static int ironDaggerID;
    public static int diamondDaggerID;
    public static int redstoneDaggerID;
    public static int obsidianDaggerID;
    public static int sandstoneDaggerID;
    public static int boneDaggerID;
    public static int paperDaggerID;
    public static int mossyDaggerID;
    public static int netherrackDaggerID;
    public static int glowstoneDaggerID;
    public static int iceDaggerID;
    public static int lavaDaggerID;
    public static int slimeDaggerID;
    public static int cactusDaggerID;
    public static int flintDaggerID;
    public static int blazeDaggerID;
    
    public static int copperDaggerID;
    public static int bronzeDaggerID;
    public static int workedIronDaggerID;
    public static int steelDaggerID;
    public static int cobaltDaggerID;
    public static int arditeDaggerID;
    public static int manyullynDaggerID;
    public static int uraniumDaggerID;
    
    public static int woodTrowelID;
    public static int stoneTrowelID;
    public static int ironTrowelID;
    public static int diamondTrowelID;
    public static int redstoneTrowelID;
    public static int obsidianTrowelID;
    public static int sandstoneTrowelID;
    public static int boneTrowelID;
    public static int paperTrowelID;
    public static int mossyTrowelID;
    public static int netherrackTrowelID;
    public static int glowstoneTrowelID;
    public static int iceTrowelID;
    public static int lavaTrowelID;
    public static int slimeTrowelID;
    public static int cactusTrowelID;
    public static int flintTrowelID;
    public static int blazeTrowelID;
    
    public static int copperTrowelID;
    public static int bronzeTrowelID;
    public static int workedIronTrowelID;
    public static int steelTrowelID;
    public static int cobaltTrowelID;
    public static int arditeTrowelID;
    public static int manyullynTrowelID;
    public static int uraniumTrowelID;
    
    public static int woodHatchetID;
    public static int stoneHatchetID;
    public static int ironHatchetID;
    public static int diamondHatchetID;
    public static int redstoneHatchetID;
    public static int obsidianHatchetID;
    public static int sandstoneHatchetID;
    public static int boneHatchetID;
    public static int paperHatchetID;
    public static int mossyHatchetID;
    public static int netherrackHatchetID;
    public static int glowstoneHatchetID;
    public static int iceHatchetID;
    public static int lavaHatchetID;
    public static int slimeHatchetID;
    public static int cactusHatchetID;
    public static int flintHatchetID;
    public static int blazeHatchetID;
    
    public static int copperHatchetID;
    public static int bronzeHatchetID;
    public static int workedIronHatchetID;
    public static int steelHatchetID;
    public static int cobaltHatchetID;
    public static int arditeHatchetID;
    public static int manyullynHatchetID;
    public static int uraniumHatchetID;
}