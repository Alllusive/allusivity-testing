package net.allusive.allusivity_;

import net.allusive.allusivity_.block.ModBlocks;
import net.allusive.allusivity_.block.entity.NetherConduitBlockEntity;
import net.allusive.allusivity_.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.allusive.allusivity_.block.ModBlocks.BE_NETHER_CONDUIT;
import static net.allusive.allusivity_.block.ModBlocks.NETHER_CONDUIT;

public class Allusivity implements ModInitializer {
	public static final String MOD_ID = "allusivity_";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GEL_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TANZANITE_OUTCROP, RenderLayer.getCutout());
		BE_NETHER_CONDUIT = Registry.register(Registry.BLOCK_ENTITY_TYPE, "allusivity_:nether_conduit", FabricBlockEntityTypeBuilder.create(NetherConduitBlockEntity::new, NETHER_CONDUIT).build(null));
	}
}
