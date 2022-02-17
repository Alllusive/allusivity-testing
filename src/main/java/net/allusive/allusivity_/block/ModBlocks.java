package net.allusive.allusivity_.block;

import net.allusive.allusivity_.Allusivity;
import net.allusive.allusivity_.block.custom.ModNetherConduitBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GEL_BLOCK = registerBlock("gel_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).breakInstantly().nonOpaque()), ItemGroup.MISC);

    public static final Block TANZANITE_OUTCROP = registerBlock("tanzanite_outcrop",
            new Block(FabricBlockSettings.of(Material.AMETHYST).hardness(2).requiresTool().nonOpaque()), ItemGroup.MISC);

    public static final Block NETHER_CONDUIT = registerBlock("nether_conduit",
            new ModNetherConduitBlock(FabricBlockSettings.of(Material.GLASS).hardness(4).requiresTool().nonOpaque()), ItemGroup.MISC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Allusivity.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Allusivity.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Allusivity.LOGGER.info("Registering ModBlocks for " + Allusivity.MOD_ID);
    }
}
