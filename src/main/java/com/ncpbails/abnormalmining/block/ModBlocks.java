package com.ncpbails.abnormalmining.block;

import com.ncpbails.abnormalmining.AbnormalMining;
import com.ncpbails.abnormalmining.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AbnormalMining.MOD_ID);


    public static final RegistryObject<Block> WILLOW_PILLAR = registerBlock("willow_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_BOARDS = registerBlock("willow_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_BOARD_SLAB = registerBlock("willow_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_BOARD_STAIRS = registerBlock("willow_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_BOARD_WALL = registerBlock("willow_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_TILES = registerBlock("willow_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_TILE_SLAB = registerBlock("willow_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_TILE_STAIRS = registerBlock("willow_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_TILE_WALL = registerBlock("willow_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_WILLOW_PLANKS = registerBlock("carved_willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_CARVED_PLANK_SLAB = registerBlock("willow_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_CARVED_PLANK_STAIRS = registerBlock("willow_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WILLOW_CARVED_PLANK_WALL = registerBlock("willow_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_WILLOW_PLANKS = registerBlock("chiseled_willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> CHERRY_PILLAR = registerBlock("cherry_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_BOARDS = registerBlock("cherry_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_BOARD_SLAB = registerBlock("cherry_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_BOARD_STAIRS = registerBlock("cherry_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_BOARD_WALL = registerBlock("cherry_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_TILES = registerBlock("cherry_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_TILE_SLAB = registerBlock("cherry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_TILE_STAIRS = registerBlock("cherry_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_TILE_WALL = registerBlock("cherry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_CHERRY_PLANKS = registerBlock("carved_cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_CARVED_PLANK_SLAB = registerBlock("cherry_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_CARVED_PLANK_STAIRS = registerBlock("cherry_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHERRY_CARVED_PLANK_WALL = registerBlock("cherry_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_CHERRY_PLANKS = registerBlock("chiseled_cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> WISTERIA_PILLAR = registerBlock("wisteria_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_BOARDS = registerBlock("wisteria_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_BOARD_SLAB = registerBlock("wisteria_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_BOARD_STAIRS = registerBlock("wisteria_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_BOARD_WALL = registerBlock("wisteria_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_TILES = registerBlock("wisteria_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_TILE_SLAB = registerBlock("wisteria_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_TILE_STAIRS = registerBlock("wisteria_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_TILE_WALL = registerBlock("wisteria_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_WISTERIA_PLANKS = registerBlock("carved_wisteria_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_CARVED_PLANK_SLAB = registerBlock("wisteria_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_CARVED_PLANK_STAIRS = registerBlock("wisteria_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WISTERIA_CARVED_PLANK_WALL = registerBlock("wisteria_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_WISTERIA_PLANKS = registerBlock("chiseled_wisteria_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> ROSEWOOD_PILLAR = registerBlock("rosewood_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_BOARDS = registerBlock("rosewood_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_BOARD_SLAB = registerBlock("rosewood_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_BOARD_STAIRS = registerBlock("rosewood_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_BOARD_WALL = registerBlock("rosewood_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_TILES = registerBlock("rosewood_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_TILE_SLAB = registerBlock("rosewood_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_TILE_STAIRS = registerBlock("rosewood_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_TILE_WALL = registerBlock("rosewood_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_ROSEWOOD_PLANKS = registerBlock("carved_rosewood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_CARVED_PLANK_SLAB = registerBlock("rosewood_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_CARVED_PLANK_STAIRS = registerBlock("rosewood_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ROSEWOOD_CARVED_PLANK_WALL = registerBlock("rosewood_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_ROSEWOOD_PLANKS = registerBlock("chiseled_rosewood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> MORADO_PILLAR = registerBlock("morado_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_BOARDS = registerBlock("morado_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_BOARD_SLAB = registerBlock("morado_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_BOARD_STAIRS = registerBlock("morado_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_BOARD_WALL = registerBlock("morado_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_TILES = registerBlock("morado_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_TILE_SLAB = registerBlock("morado_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_TILE_STAIRS = registerBlock("morado_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_TILE_WALL = registerBlock("morado_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_MORADO_PLANKS = registerBlock("carved_morado_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_CARVED_PLANK_SLAB = registerBlock("morado_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_CARVED_PLANK_STAIRS = registerBlock("morado_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MORADO_CARVED_PLANK_WALL = registerBlock("morado_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_MORADO_PLANKS = registerBlock("chiseled_morado_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> YUCCA_PILLAR = registerBlock("yucca_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_BOARDS = registerBlock("yucca_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_BOARD_SLAB = registerBlock("yucca_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_BOARD_STAIRS = registerBlock("yucca_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_BOARD_WALL = registerBlock("yucca_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_TILES = registerBlock("yucca_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_TILE_SLAB = registerBlock("yucca_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_TILE_STAIRS = registerBlock("yucca_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_TILE_WALL = registerBlock("yucca_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_YUCCA_PLANKS = registerBlock("carved_yucca_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_CARVED_PLANK_SLAB = registerBlock("yucca_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_CARVED_PLANK_STAIRS = registerBlock("yucca_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> YUCCA_CARVED_PLANK_WALL = registerBlock("yucca_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_YUCCA_PLANKS = registerBlock("chiseled_yucca_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> GRIMWOOD_PILLAR = registerBlock("grimwood_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_BOARDS = registerBlock("grimwood_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_BOARD_SLAB = registerBlock("grimwood_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_BOARD_STAIRS = registerBlock("grimwood_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_BOARD_WALL = registerBlock("grimwood_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_TILES = registerBlock("grimwood_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_TILE_SLAB = registerBlock("grimwood_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_TILE_STAIRS = registerBlock("grimwood_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_TILE_WALL = registerBlock("grimwood_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_GRIMWOOD_PLANKS = registerBlock("carved_grimwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_CARVED_PLANK_SLAB = registerBlock("grimwood_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_CARVED_PLANK_STAIRS = registerBlock("grimwood_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> GRIMWOOD_CARVED_PLANK_WALL = registerBlock("grimwood_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_GRIMWOOD_PLANKS = registerBlock("chiseled_grimwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> RIVER_PILLAR = registerBlock("river_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_BOARDS = registerBlock("river_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_BOARD_SLAB = registerBlock("river_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_BOARD_STAIRS = registerBlock("river_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_BOARD_WALL = registerBlock("river_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_TILES = registerBlock("river_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_TILE_SLAB = registerBlock("river_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_TILE_STAIRS = registerBlock("river_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_TILE_WALL = registerBlock("river_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_RIVER_PLANKS = registerBlock("carved_river_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_CARVED_PLANK_SLAB = registerBlock("river_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_CARVED_PLANK_STAIRS = registerBlock("river_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> RIVER_CARVED_PLANK_WALL = registerBlock("river_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_RIVER_PLANKS = registerBlock("chiseled_river_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> MAPLE_PILLAR = registerBlock("maple_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_BOARDS = registerBlock("maple_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_BOARD_SLAB = registerBlock("maple_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_BOARD_STAIRS = registerBlock("maple_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_BOARD_WALL = registerBlock("maple_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_TILES = registerBlock("maple_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_TILE_SLAB = registerBlock("maple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_TILE_STAIRS = registerBlock("maple_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_TILE_WALL = registerBlock("maple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_MAPLE_PLANKS = registerBlock("carved_maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_CARVED_PLANK_SLAB = registerBlock("maple_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_CARVED_PLANK_STAIRS = registerBlock("maple_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MAPLE_CARVED_PLANK_WALL = registerBlock("maple_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_MAPLE_PLANKS = registerBlock("chiseled_maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> DRIFTWOOD_PILLAR = registerBlock("driftwood_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_BOARDS = registerBlock("driftwood_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_BOARD_SLAB = registerBlock("driftwood_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_BOARD_STAIRS = registerBlock("driftwood_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_BOARD_WALL = registerBlock("driftwood_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_TILES = registerBlock("driftwood_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_TILE_SLAB = registerBlock("driftwood_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_TILE_STAIRS = registerBlock("driftwood_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_TILE_WALL = registerBlock("driftwood_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_DRIFTWOOD_PLANKS = registerBlock("carved_driftwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_CARVED_PLANK_SLAB = registerBlock("driftwood_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_CARVED_PLANK_STAIRS = registerBlock("driftwood_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DRIFTWOOD_CARVED_PLANK_WALL = registerBlock("driftwood_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_DRIFTWOOD_PLANKS = registerBlock("chiseled_driftwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> ASPEN_PILLAR = registerBlock("aspen_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_BOARDS = registerBlock("aspen_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_BOARD_SLAB = registerBlock("aspen_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_BOARD_STAIRS = registerBlock("aspen_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_BOARD_WALL = registerBlock("aspen_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_TILES = registerBlock("aspen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_TILE_SLAB = registerBlock("aspen_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_TILE_STAIRS = registerBlock("aspen_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_TILE_WALL = registerBlock("aspen_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_ASPEN_PLANKS = registerBlock("carved_aspen_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_CARVED_PLANK_SLAB = registerBlock("aspen_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_CARVED_PLANK_STAIRS = registerBlock("aspen_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ASPEN_CARVED_PLANK_WALL = registerBlock("aspen_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_ASPEN_PLANKS = registerBlock("chiseled_aspen_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> KOUSA_PILLAR = registerBlock("kousa_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_BOARDS = registerBlock("kousa_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_BOARD_SLAB = registerBlock("kousa_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_BOARD_STAIRS = registerBlock("kousa_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_BOARD_WALL = registerBlock("kousa_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_TILES = registerBlock("kousa_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_TILE_SLAB = registerBlock("kousa_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_TILE_STAIRS = registerBlock("kousa_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_TILE_WALL = registerBlock("kousa_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_KOUSA_PLANKS = registerBlock("carved_kousa_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_CARVED_PLANK_SLAB = registerBlock("kousa_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_CARVED_PLANK_STAIRS = registerBlock("kousa_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> KOUSA_CARVED_PLANK_WALL = registerBlock("kousa_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_KOUSA_PLANKS = registerBlock("chiseled_kousa_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);


    public static final RegistryObject<Block> AZALEA_PILLAR = registerBlock("azalea_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_BOARDS = registerBlock("azalea_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_BOARD_SLAB = registerBlock("azalea_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_BOARD_STAIRS = registerBlock("azalea_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_BOARD_WALL = registerBlock("azalea_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_TILES = registerBlock("azalea_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_TILE_SLAB = registerBlock("azalea_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_TILE_STAIRS = registerBlock("azalea_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_TILE_WALL = registerBlock("azalea_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_AZALEA_PLANKS = registerBlock("carved_azalea_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_CARVED_PLANK_SLAB = registerBlock("azalea_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_CARVED_PLANK_STAIRS = registerBlock("azalea_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> AZALEA_CARVED_PLANK_WALL = registerBlock("azalea_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_AZALEA_PLANKS = registerBlock("chiseled_azalea_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);







    public static final RegistryObject<Block> LAUREL_PILLAR = registerBlock("laurel_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_BOARDS = registerBlock("laurel_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_BOARD_SLAB = registerBlock("laurel_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_BOARD_STAIRS = registerBlock("laurel_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_BOARD_WALL = registerBlock("laurel_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_TILES = registerBlock("laurel_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_TILE_SLAB = registerBlock("laurel_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_TILE_STAIRS = registerBlock("laurel_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_TILE_WALL = registerBlock("laurel_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_LAUREL_PLANKS = registerBlock("carved_laurel_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_CARVED_PLANK_SLAB = registerBlock("laurel_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_CARVED_PLANK_STAIRS = registerBlock("laurel_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> LAUREL_CARVED_PLANK_WALL = registerBlock("laurel_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_LAUREL_PLANKS = registerBlock("chiseled_laurel_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, isFuel, fuelAmount);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        if(isFuel == false) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        } else {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)){
                @Override public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return fuelAmount;}});
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}