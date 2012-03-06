package net.minecraft.src.orizon;
import net.minecraft.src.*;

import java.util.*;

public class WorldGenStones {

	private static WorldGenStones instance = new WorldGenStones();
	
	public WorldGenStones()	{
		copper = new OreGen(mod_Orizon.mineralOreID, 0, 12);
		turquoise = new OreGen(mod_Orizon.mineralOreID, 1, 8);
		chalcocite = new OreGen(mod_Orizon.mineralOreID, 2, 8);
		cassiterite = new OreGen(mod_Orizon.mineralOreID, 3, 7);
		teallite = new OreGen(mod_Orizon.mineralOreID, 4, 5);
		zincBloom = new OreGen(mod_Orizon.mineralOreID, 5, 9);
		sphalerite = new OreGen(mod_Orizon.mineralOreID, 6, 7);
		cerussite = new OreGen(mod_Orizon.mineralOreID, 7, 4);
		cobalt = new OreGen(mod_Orizon.mineralOreID, 8, 6);
		ardite = new OreGen(mod_Orizon.mineralOreID, 9, 6);
		myuvil = new OreGen(mod_Orizon.mineralOreID, 10, 6);
		galena = new OreGen(mod_Orizon.mineralOreID, 11, 12);
		chrysocolla = new OreGen(mod_Orizon.mineralOreID, 12, 2);
		aggregate = new OreGen(mod_Orizon.mineralOreID, 13, 8);
		
		copperA = new OreGen(mod_Orizon.mineralOreAltID, 0, 12);
		turquoiseA = new OreGen(mod_Orizon.mineralOreAltID, 1, 8);
		chalcociteA = new OreGen(mod_Orizon.mineralOreAltID, 2, 8);
		cassiteriteA = new OreGen(mod_Orizon.mineralOreAltID, 3, 7);
		tealliteA = new OreGen(mod_Orizon.mineralOreAltID, 4, 5);
		zincBloomA = new OreGen(mod_Orizon.mineralOreAltID, 5, 9);
		sphaleriteA = new OreGen(mod_Orizon.mineralOreAltID, 6, 7);
		cerussiteA = new OreGen(mod_Orizon.mineralOreAltID, 7, 4);
		cobaltA = new OreGen(mod_Orizon.mineralOreAltID, 8, 6);
		arditeA = new OreGen(mod_Orizon.mineralOreAltID, 9, 6);
		myuvilA = new OreGen(mod_Orizon.mineralOreAltID, 10, 6);
		galenaA = new OreGen(mod_Orizon.mineralOreAltID, 11, 12);
		chrysocollaA = new OreGen(mod_Orizon.mineralOreAltID, 12, 2);
		aggregateA = new OreGen(mod_Orizon.mineralOreAltID, 13, 8);
		
		copperS = new OreGenGradient(0, 12, false);
		turquoiseS = new OreGenGradient(1, 8, false);
		chalcociteS = new OreGenGradient(2, 8, false);
		cassiteriteS = new OreGenGradient(3, 7, false);
		tealliteS = new OreGenGradient(4, 5, false);
		zincBloomS = new OreGenGradient(5, 9, false);
		sphaleriteS = new OreGenGradient(6, 7, false);
		cerussiteS = new OreGenGradient(7, 4, false);
		cobaltS = new OreGenGradient(8, 6, false);
		arditeS = new OreGenGradient(9, 6, false);
		myuvilS = new OreGenGradient(10, 6, false);
		galenaS = new OreGenGradient(11, 12, false);
		chrysocollaS = new OreGenGradient(12, 2, false);
		aggregateS = new OreGenGradient(13, 8, false);
		
		copperSA = new OreGenGradient(0, 12, true);
		turquoiseSA = new OreGenGradient(1, 8, true);
		chalcociteSA = new OreGenGradient(2, 8, true);
		cassiteriteSA = new OreGenGradient(3, 7, true);
		tealliteSA = new OreGenGradient(4, 5, true);
		zincBloomSA = new OreGenGradient(5, 9, true);
		sphaleriteSA = new OreGenGradient(6, 7, true);
		cerussiteSA = new OreGenGradient(7, 4, true);
		cobaltSA = new OreGenGradient(8, 6, true);
		arditeSA = new OreGenGradient(9, 6, true);
		myuvilSA = new OreGenGradient(10, 6, true);
		galenaSA = new OreGenGradient(11, 12, true);
		chrysocollaSA = new OreGenGradient(12, 2, true);
		aggregateSA = new OreGenGradient(13, 8, true);
		
		redoGold = new OreGen(Block.oreGold.blockID, 0, 8);
		redoDiamond = new OreGen(Block.oreDiamond.blockID, 0, 7);
		redoLapis = new OreGen(Block.oreLapis.blockID, 0, 6);
		redoRedstone = new OreGen(Block.oreRedstone.blockID, 0, 7);
		
		redoGoldS = new OreGenVanilla(Block.oreGold, mod_Orizon.replaceMetal, 4, 8);
		redoDiamondS = new OreGenVanilla(Block.oreDiamond, mod_Orizon.replaceOre, 4, 7);
		redoLapisS = new OreGenVanilla(Block.oreLapis, mod_Orizon.replaceOre, 8, 6);
		redoRedstoneS = new OreGenVanilla(Block.oreRedstone, mod_Orizon.replaceOre, 12, 7);
		
		calcite = new StoneGen(mod_Orizon.calciteOre.blockID, 0, 200);
	    galenaC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 1, 18);
	    cassiteriteC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 2, 7);
	    zincBloomC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 3, 9);
	    sphaleriteC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 4, 12);
	    chalcociteC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 5, 8);
	    
	    marbleWhite = new StoneGen(mod_Orizon.marble.blockID, 0, 40);
	    marbleBlack = new StoneGen(mod_Orizon.marble.blockID, 1, 40);
	    marbleRose = new StoneGen(mod_Orizon.marble.blockID, 2, 40);
	    marbleEmerald = new StoneGen(mod_Orizon.marble.blockID, 3, 40);
	    marbleAzure = new StoneGen(mod_Orizon.marble.blockID, 4, 40);
	}
	
	public static WorldGenStones getInstance() {
		return instance;
	}
			
	public static void generateOres(World world, Random rand, int chunkX, int chunkZ)
	{
		if(mod_Orizon.genStratifiedStone) {
			int copperChunk = rand.nextInt(mod_Orizon.copperRarity) + (mod_Orizon.copperRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, copperS, copperSA, copperChunk, mod_Orizon.copperHeight);
			int turquoiseChunk = rand.nextInt(mod_Orizon.turquoiseRarity) + (mod_Orizon.turquoiseRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, turquoiseS, turquoiseSA, turquoiseChunk, mod_Orizon.turquoiseHeight);
			int chalcociteChunk = rand.nextInt(mod_Orizon.chalcociteRarity) + (mod_Orizon.chalcociteRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, chalcociteS, chalcociteSA, chalcociteChunk, mod_Orizon.chalcociteHeight);
			int cassiteriteChunk = rand.nextInt(mod_Orizon.cassiteriteRarity) + (mod_Orizon.cassiteriteRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, cassiteriteS, cassiteriteSA, cassiteriteChunk, mod_Orizon.cassiteriteHeight);
			int tealliteChunk = rand.nextInt(mod_Orizon.tealliteRarity) + (mod_Orizon.tealliteRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, tealliteS, tealliteSA, tealliteChunk, mod_Orizon.tealliteHeight);
			int zincBloomChunk = rand.nextInt(mod_Orizon.zincBloomRarity) + (mod_Orizon.zincBloomRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, zincBloomS, zincBloomSA, zincBloomChunk, mod_Orizon.zincBloomHeight);
			int sphaleriteChunk = rand.nextInt(mod_Orizon.sphaleriteRarity) + (mod_Orizon.sphaleriteRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, sphaleriteS, sphaleriteSA, sphaleriteChunk, mod_Orizon.sphaleriteHeight);
			int cerussiteChunk = rand.nextInt(mod_Orizon.cerussiteRarity) + (mod_Orizon.cerussiteRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, cerussiteS, cerussiteSA, cerussiteChunk, mod_Orizon.cerussiteHeight);
			int cobaltChunk = rand.nextInt(mod_Orizon.cobaltRarity) + (mod_Orizon.cobaltRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, cobaltS, cobaltSA, cobaltChunk, mod_Orizon.cobaltHeight);
			int arditeChunk = rand.nextInt(mod_Orizon.arditeRarity) + (mod_Orizon.arditeRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, arditeS, arditeSA, arditeChunk, mod_Orizon.arditeHeight);
			int myuvilChunk = rand.nextInt(mod_Orizon.myuvilRarity) + (mod_Orizon.myuvilRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, myuvilS, myuvilSA, myuvilChunk, mod_Orizon.myuvilHeight);
			int galenaChunk = rand.nextInt(mod_Orizon.galenaRarity) + (mod_Orizon.galenaRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, galenaS, galenaSA, galenaChunk, mod_Orizon.galenaHeight);
			int chrysocollaChunk = rand.nextInt(mod_Orizon.ivymetalRarity) + (mod_Orizon.ivymetalRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, chrysocollaS, chrysocollaSA, chrysocollaChunk, mod_Orizon.ivymetalHeight);
			int aggregateChunk = rand.nextInt(mod_Orizon.aggregateRarity) + (mod_Orizon.aggregateRarity / 2);
			generateStratifiedVein(world, rand, chunkX, chunkZ, aggregateS, aggregateSA, aggregateChunk, mod_Orizon.aggregateHeight);
			
			if(mod_Orizon.redoVanillaOres) {
				int goldChunk = rand.nextInt(mod_Orizon.goldRarity) + (mod_Orizon.goldRarity / 2);
				generateStratifiedVanillaVein(world, rand, chunkX, chunkZ, redoGoldS, goldChunk, mod_Orizon.goldHeight);
				int diamondChunk = rand.nextInt(mod_Orizon.diamondRarity) + (mod_Orizon.diamondRarity / 2);
				generateStratifiedVanillaVein(world, rand, chunkX, chunkZ, redoDiamondS, diamondChunk, mod_Orizon.diamondHeight);
				int lapisChunk = rand.nextInt(mod_Orizon.lapisRarity) + (mod_Orizon.lapisRarity / 2);
				generateStratifiedVanillaVein(world, rand, chunkX, chunkZ, redoLapisS, lapisChunk, mod_Orizon.lapisHeight);
				int redstoneChunk = rand.nextInt(mod_Orizon.redstoneRarity) + (mod_Orizon.redstoneRarity / 2);
				generateStratifiedVanillaVein(world, rand, chunkX, chunkZ, redoRedstoneS, redstoneChunk, mod_Orizon.redstoneHeight);
			}
			
		} else {
			int copperChunk = rand.nextInt(mod_Orizon.copperRarity) + (mod_Orizon.copperRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, copper, copperA, copperChunk, mod_Orizon.copperHeight);
			int turquoiseChunk = rand.nextInt(mod_Orizon.turquoiseRarity) + (mod_Orizon.turquoiseRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, turquoise, turquoiseA, turquoiseChunk, mod_Orizon.turquoiseHeight);
			int chalcociteChunk = rand.nextInt(mod_Orizon.chalcociteRarity) + (mod_Orizon.chalcociteRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, chalcocite, chalcociteA, chalcociteChunk, mod_Orizon.chalcociteHeight);
			int cassiteriteChunk = rand.nextInt(mod_Orizon.cassiteriteRarity) + (mod_Orizon.cassiteriteRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, cassiterite, cassiteriteA, cassiteriteChunk, mod_Orizon.cassiteriteHeight);
			int tealliteChunk = rand.nextInt(mod_Orizon.tealliteRarity) + (mod_Orizon.tealliteRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, teallite, tealliteA, tealliteChunk, mod_Orizon.tealliteHeight);
			int zincBloomChunk = rand.nextInt(mod_Orizon.zincBloomRarity) + (mod_Orizon.zincBloomRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, zincBloom, zincBloomA, zincBloomChunk, mod_Orizon.zincBloomHeight);
			int sphaleriteChunk = rand.nextInt(mod_Orizon.sphaleriteRarity) + (mod_Orizon.sphaleriteRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, sphalerite, sphaleriteA, sphaleriteChunk, mod_Orizon.sphaleriteHeight);
			int cerussiteChunk = rand.nextInt(mod_Orizon.cerussiteRarity) + (mod_Orizon.cerussiteRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, cerussite, cerussiteA, cerussiteChunk, mod_Orizon.cerussiteHeight);
			int cobaltChunk = rand.nextInt(mod_Orizon.cobaltRarity) + (mod_Orizon.cobaltRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, cobalt, cobaltA, cobaltChunk, mod_Orizon.cobaltHeight);
			int arditeChunk = rand.nextInt(mod_Orizon.arditeRarity) + (mod_Orizon.arditeRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, ardite, arditeA, arditeChunk, mod_Orizon.arditeHeight);
			int myuvilChunk = rand.nextInt(mod_Orizon.myuvilRarity) + (mod_Orizon.myuvilRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, myuvil, myuvilA, myuvilChunk, mod_Orizon.myuvilHeight);
			int galenaChunk = rand.nextInt(mod_Orizon.galenaRarity) + (mod_Orizon.galenaRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, galena, galenaA, galenaChunk, mod_Orizon.galenaHeight);
			int chrysocollaChunk = rand.nextInt(mod_Orizon.ivymetalRarity) + (mod_Orizon.ivymetalRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, chrysocolla, chrysocollaA, chrysocollaChunk, mod_Orizon.ivymetalHeight);
			int aggregateChunk = rand.nextInt(mod_Orizon.aggregateRarity) + (mod_Orizon.aggregateRarity / 2);
			generateVein(world, rand, chunkX, chunkZ, aggregate, aggregateA, aggregateChunk, mod_Orizon.aggregateHeight);
			
			if(mod_Orizon.redoVanillaOres) {
				int goldChunk = rand.nextInt(mod_Orizon.goldRarity) + (mod_Orizon.goldRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, redoGold, goldChunk, mod_Orizon.goldHeight);
				int diamondChunk = rand.nextInt(mod_Orizon.diamondRarity) + (mod_Orizon.diamondRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, redoDiamond, diamondChunk, mod_Orizon.diamondHeight);
				int lapisChunk = rand.nextInt(mod_Orizon.lapisRarity) + (mod_Orizon.lapisRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, redoLapis, lapisChunk, mod_Orizon.lapisHeight);
				int redstoneChunk = rand.nextInt(mod_Orizon.redstoneRarity) + (mod_Orizon.redstoneRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, redoRedstone, redstoneChunk, mod_Orizon.redstoneHeight);
			}
		}		
	}
	
	public static void generateCalcite(World world, Random rand, int chunkX, int chunkZ)
	{
		if(rand.nextInt(20) == 0)
	    {
			int hi = rand.nextInt(64);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        calcite.generate(world, rand, randX, hi, randZ);
	    }
		
		int galenaChunk = rand.nextInt(mod_Orizon.galenaRarity * 5) + (mod_Orizon.galenaRarity * 5 / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, galenaC, galenaChunk, mod_Orizon.galenaHeight);
		int cassiteriteChunk = rand.nextInt(mod_Orizon.cassiteriteRarity) + (mod_Orizon.cassiteriteRarity / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, cassiteriteC, cassiteriteChunk, mod_Orizon.cassiteriteHeight);
		int zincBloomChunk = rand.nextInt(mod_Orizon.zincBloomRarity) + (mod_Orizon.zincBloomRarity / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, zincBloomC, zincBloomChunk, mod_Orizon.zincBloomHeight);
		int sphaleriteChunk = rand.nextInt(mod_Orizon.sphaleriteRarity) + (mod_Orizon.sphaleriteRarity / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, sphaleriteC, sphaleriteChunk, mod_Orizon.sphaleriteHeight);
		int chalcociteChunk = rand.nextInt(mod_Orizon.chalcociteRarity) + (mod_Orizon.chalcociteRarity / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, chalcociteC, chalcociteChunk, mod_Orizon.chalcociteHeight);
	}
	
	public static void generateMarble(World world, Random rand, int chunkX,	int chunkZ) 
	{
		if(rand.nextInt(mod_Orizon.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(mod_Orizon.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(mod_Orizon.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(mod_Orizon.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(mod_Orizon.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(mod_Orizon.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(mod_Orizon.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(mod_Orizon.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(mod_Orizon.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(mod_Orizon.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	    }
	}
	
	public static boolean generateVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGen ori, OreGen alt, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        OreGen ore = ori;
	        if(rand.nextInt(4) == 0)
	        	ore = alt;
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateStratifiedVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGenGradient ori, OreGenGradient alt, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        OreGenGradient ore = ori;
	        if(rand.nextInt(4) == 0)
	        	ore = alt;
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateSimpleVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGen ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateCalciteVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGenCalcite ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateStratifiedVanillaVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGenVanilla ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static void generateStratifiedStone(World world, Random rand, int chunkX, int chunkZ)
	{
		for(int x = chunkX; x < chunkX + 16; x++) {
			for(int z = chunkZ; z < chunkZ + 16; z++) {
				
				for(int y = 0; y < 16; y++) {
					int bID = world.getBlockId(x, y, z);
					replaceBlocks(world, x, y, z, bID, 2);
				}
				for(int y = 16; y < 32; y++) {
					int bID = world.getBlockId(x, y, z);
					replaceBlocks(world, x, y, z, bID, 1);
				}
				for(int y = 32; y < 48; y++) {
					int bID = world.getBlockId(x, y, z);
					replaceBlocks(world, x, y, z, bID, 0);
				}
				for(int y = 64; y < 128; y++) {
					int bID = world.getBlockId(x, y, z);
					replaceBlocks(world, x, y, z, bID, 3);
				}
			}
		}
	}
	
	public static void generateGems(World world, Random random, int chunkX,
			int chunkZ) {
		
	}
	
	public static void replaceBlocks(World world, int x, int y, int z, int bID, int md) {
		if(bID == Block.stone.blockID)
			world.setBlockAndMetadata(x, y, z, mod_Orizon.cStone.blockID, md);
		else if(bID == Block.oreIron.blockID)
			world.setBlockAndMetadata(x, y, z, mod_Orizon.replaceMetal.blockID, md);
		else if(bID == Block.oreCoal.blockID)
			world.setBlockAndMetadata(x, y, z, mod_Orizon.replaceOre.blockID, md);
		
		if(mod_Orizon.redoVanillaOres) {
			if(bID == Block.oreGold.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.cStone.blockID, md);
			else if(bID == Block.oreDiamond.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.cStone.blockID, md);
			else if(bID == Block.oreLapis.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.cStone.blockID, md);
			else if(bID == Block.oreRedstone.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.cStone.blockID, md);
		} else {
			if(bID == Block.oreGold.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.replaceMetal.blockID, md+4);
			else if(bID == Block.oreDiamond.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.replaceOre.blockID, md+4);
			else if(bID == Block.oreLapis.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.replaceOre.blockID, md+8);
			else if(bID == Block.oreRedstone.blockID)
				world.setBlockAndMetadata(x, y, z, mod_Orizon.replaceOre.blockID, md+12);
		}
	}
	
    static OreGen copper;
    static OreGen turquoise;
    static OreGen chalcocite;
    static OreGen cassiterite;
    static OreGen teallite;
    static OreGen zincBloom;
    static OreGen sphalerite;
    static OreGen cerussite;
    static OreGen cobalt;
    static OreGen ardite;
    static OreGen myuvil;
    static OreGen galena;
    static OreGen chrysocolla;
    static OreGen aggregate;
    
    static OreGen copperA;
    static OreGen turquoiseA;
    static OreGen chalcociteA;
    static OreGen cassiteriteA;
    static OreGen tealliteA;
    static OreGen zincBloomA;
    static OreGen sphaleriteA;
    static OreGen cerussiteA;
    static OreGen cobaltA;
    static OreGen arditeA;
    static OreGen myuvilA;
    static OreGen galenaA;
    static OreGen chrysocollaA;
    static OreGen aggregateA;
    
    static OreGenGradient copperS;
    static OreGenGradient turquoiseS;
    static OreGenGradient chalcociteS;
    static OreGenGradient cassiteriteS;
    static OreGenGradient tealliteS;
    static OreGenGradient zincBloomS;
    static OreGenGradient sphaleriteS;
    static OreGenGradient cerussiteS;
    static OreGenGradient cobaltS;
    static OreGenGradient arditeS;
    static OreGenGradient myuvilS;
    static OreGenGradient galenaS;
    static OreGenGradient chrysocollaS;
    static OreGenGradient aggregateS;
    
    static OreGenGradient copperSA;
    static OreGenGradient turquoiseSA;
    static OreGenGradient chalcociteSA;
    static OreGenGradient cassiteriteSA;
    static OreGenGradient tealliteSA;
    static OreGenGradient zincBloomSA;
    static OreGenGradient sphaleriteSA;
    static OreGenGradient cerussiteSA;
    static OreGenGradient cobaltSA;
    static OreGenGradient arditeSA;
    static OreGenGradient myuvilSA;
    static OreGenGradient galenaSA;
    static OreGenGradient chrysocollaSA;
    static OreGenGradient aggregateSA;
    
    static StoneGen calcite;
    static OreGenCalcite galenaC;
    static OreGenCalcite cassiteriteC;
    static OreGenCalcite zincBloomC;
    static OreGenCalcite sphaleriteC;
    static OreGenCalcite chalcociteC;
    
    static OreGen redoGold;
    static OreGen redoDiamond;
    static OreGen redoLapis;
    static OreGen redoRedstone;
    
    static OreGenVanilla redoGoldS;
    static OreGenVanilla redoDiamondS;
    static OreGenVanilla redoLapisS;
    static OreGenVanilla redoRedstoneS;
    
    static StoneGen marbleWhite;
    static StoneGen marbleBlack;
    static StoneGen marbleRose;
    static StoneGen marbleEmerald;
    static StoneGen marbleAzure;
    
    static OreGen ruby;
    static OreGen emerald;
    static OreGen sapphire;
    static OreGen topaz;
    static OreGen amethyst;
    static OreGen quartz;
    static OreGen roseQuartz;
    static OreGen rockCrystal;

	public static void generateSilt(World world, Random random, int chunkX,
			int chunkZ) {
		// TODO Auto-generated method stub
		
	}
}