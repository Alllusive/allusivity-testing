package net.allusive.allusivity_.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ConduitBlockEntity;
import net.minecraft.util.registry.Registry;

import static net.allusive.allusivity_.block.ModBlocks.NETHER_CONDUIT;

public class BlockEntity {

    public static BlockEntityType<ConduitBlockEntity> NETHER_CONDUIT_ENTITY;

    @Override
    public void onInitialize() {
        NETHER_CONDUIT_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "allusivity_:nether_conduit_entity", FabricBlockEntityTypeBuilder.create(::new, NETHER_CONDUIT).build(null));
    }
}
