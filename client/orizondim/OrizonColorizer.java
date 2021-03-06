package net.minecraft.src.orizondim;

public class OrizonColorizer
{
    /** Color buffer for grass */
    private static int[] grassBuffer = new int[65536];
    private static int[] foliageBuffer = new int[65536];

    public static void setGrassBiomeColorizer(int[] par0ArrayOfInteger)
    {
        grassBuffer = par0ArrayOfInteger;
    }

    /**
     * Gets grass color from temperature and humidity. Args: temperature, humidity
     */
    public static int getGrassColor(double par0, double par2)
    {
        par2 *= par0;
        int var4 = (int)((1.0D - par0) * 255.0D);
        int var5 = (int)((1.0D - par2) * 255.0D);
        return grassBuffer[var5 << 8 | var4];
    }
    
    public static void getFoilageBiomeColorizer(int[] par0ArrayOfInteger)
    {
        foliageBuffer = par0ArrayOfInteger;
    }

    
    public static int getFoliageColor(double par0, double par2)
    {
        par2 *= par0;
        int var4 = (int)((1.0D - par0) * 255.0D);
        int var5 = (int)((1.0D - par2) * 255.0D);
        return foliageBuffer[var5 << 8 | var4];
    }

    /**
     * Gets the foliage color for pine type (metadata 1) trees
     */
    public static int getFoliageColorPine()
    {
        return 0xddddff;
    }

    /**
     * Gets the foliage color for birch type (metadata 2) trees
     */
    public static int getFoliageColorBirch()
    {
        return 0xffffaa;
    }

    public static int getFoliageColorBasic()
    {
        return 4764952;
    }
}
