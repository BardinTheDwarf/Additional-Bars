package com.codenamerevy.additionalbars.init;

import com.codenamerevy.additionalbars.AdditionalBars;
import com.codenamerevy.additionalbars.content.block.BlockBarsBase;
import com.codenamerevy.additionalbars.content.block.BlockHorizontalBars;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBars.MODID);

    public static final RegistryObject<Block> GOLD_BARS                         = BLOCKS.register("gold_bars",                          () -> new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.GOLD).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> ACACIA_BARS                       = BLOCKS.register("acacia_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> BIRCH_BARS                        = BLOCKS.register("birch_bars",                         () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> JUNGLE_BARS                       = BLOCKS.register("jungle_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> OAK_BARS                          = BLOCKS.register("oak_bars",                           () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> DARK_OAK_BARS                     = BLOCKS.register("dark_oak_bars",                      () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> SPRUCE_BARS                       = BLOCKS.register("spruce_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CRIMSON_BARS                      = BLOCKS.register("crimson_bars",                       () -> new BlockBarsBase(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));
    public static final RegistryObject<Block> WARPED_BARS                       = BLOCKS.register("warped_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.WARPED_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));

    public static final RegistryObject<Block> CROSSED_IRON_BARS                 = BLOCKS.register("crossed_iron_bars",                  () -> new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> CROSSED_GOLD_BARS                 = BLOCKS.register("crossed_gold_bars",                  () -> new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.GOLD).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> CROSSED_ACACIA_BARS               = BLOCKS.register("crossed_acacia_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_BIRCH_BARS                = BLOCKS.register("crossed_birch_bars",                 () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_JUNGLE_BARS               = BLOCKS.register("crossed_jungle_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_OAK_BARS                  = BLOCKS.register("crossed_oak_bars",                   () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_DARK_OAK_BARS             = BLOCKS.register("crossed_dark_oak_bars",              () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_SPRUCE_BARS               = BLOCKS.register("crossed_spruce_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_CRIMSON_BARS              = BLOCKS.register("crossed_crimson_bars",               () -> new BlockBarsBase(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));
    public static final RegistryObject<Block> CROSSED_WARPED_BARS               = BLOCKS.register("crossed_warped_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.WARPED_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));

    public static final RegistryObject<Block> HORIZONTAL_IRON_BARS              = BLOCKS.register("horizontal_iron_bars",               () -> new BlockHorizontalBars(Block.Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> HORIZONTAL_GOLD_BARS              = BLOCKS.register("horizontal_gold_bars",               () -> new BlockHorizontalBars(Block.Properties.create(Material.IRON, MaterialColor.GOLD).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> HORIZONTAL_ACACIA_BARS            = BLOCKS.register("horizontal_acacia_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_BIRCH_BARS             = BLOCKS.register("horizontal_birch_bars",              () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_JUNGLE_BARS            = BLOCKS.register("horizontal_jungle_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_OAK_BARS               = BLOCKS.register("horizontal_oak_bars",                () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_DARK_OAK_BARS          = BLOCKS.register("horizontal_dark_oak_bars",           () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_SPRUCE_BARS            = BLOCKS.register("horizontal_spruce_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CRIMSON_BARS           = BLOCKS.register("horizontal_crimson_bars",            () -> new BlockHorizontalBars(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));
    public static final RegistryObject<Block> HORIZONTAL_WARPED_BARS            = BLOCKS.register("horizontal_warped_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.WARPED_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));

    public static final RegistryObject<Block> HORIZONTAL_CROSSED_IRON_BARS      = BLOCKS.register("horizontal_crossed_iron_bars",       () -> new BlockHorizontalBars(Block.Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_GOLD_BARS      = BLOCKS.register("horizontal_crossed_gold_bars",       () -> new BlockHorizontalBars(Block.Properties.create(Material.IRON, MaterialColor.GOLD).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(5.0F, 6.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_ACACIA_BARS    = BLOCKS.register("horizontal_crossed_acacia_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_BIRCH_BARS     = BLOCKS.register("horizontal_crossed_birch_bars",      () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_JUNGLE_BARS    = BLOCKS.register("horizontal_crossed_jungle_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_OAK_BARS       = BLOCKS.register("horizontal_crossed_oak_bars",        () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_DARK_OAK_BARS  = BLOCKS.register("horizontal_crossed_dark_oak_bars",   () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_SPRUCE_BARS    = BLOCKS.register("horizontal_crossed_spruce_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_CRIMSON_BARS   = BLOCKS.register("horizontal_crossed_crimson_bars",    () -> new BlockHorizontalBars(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_WARPED_BARS    = BLOCKS.register("horizontal_crossed_warped_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.WARPED_STEM).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(4.0F, 5.0F)));

    public static final RegistryObject<Block> FIR_BARS                          = BLOCKS.register("fir_bars",                           () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> REDWOOD_BARS                      = BLOCKS.register("redwood_bars",                       () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CHERRY_BARS                       = BLOCKS.register("cherry_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> MAHOGANY_BARS                     = BLOCKS.register("mahogany_bars",                      () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> JACARANDA_BARS                    = BLOCKS.register("jacaranda_bars",                     () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> PALM_BARS                         = BLOCKS.register("palm_bars",                          () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> WILLOW_BARS                       = BLOCKS.register("willow_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> DEAD_BARS                         = BLOCKS.register("dead_bars",                          () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> MAGIC_BARS                        = BLOCKS.register("magic_bars",                         () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> UMBRAN_BARS                       = BLOCKS.register("umbran_bars",                        () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HELLBARK_BARS                     = BLOCKS.register("hellbark_bars",                      () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));

    public static final RegistryObject<Block> CROSSED_FIR_BARS                  = BLOCKS.register("crossed_fir_bars",                   () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_REDWOOD_BARS              = BLOCKS.register("crossed_redwood_bars",               () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_CHERRY_BARS               = BLOCKS.register("crossed_cherry_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_MAHOGANY_BARS             = BLOCKS.register("crossed_mahogany_bars",              () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_JACARANDA_BARS            = BLOCKS.register("crossed_jacaranda_bars",             () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_PALM_BARS                 = BLOCKS.register("crossed_palm_bars",                  () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_WILLOW_BARS               = BLOCKS.register("crossed_willow_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_DEAD_BARS                 = BLOCKS.register("crossed_dead_bars",                  () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_MAGIC_BARS                = BLOCKS.register("crossed_magic_bars",                 () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_UMBRAN_BARS               = BLOCKS.register("crossed_umbran_bars",                () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> CROSSED_HELLBARK_BARS             = BLOCKS.register("crossed_hellbark_bars",              () -> new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));

    public static final RegistryObject<Block> HORIZONTAL_FIR_BARS               = BLOCKS.register("horizontal_fir_bars",                () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_REDWOOD_BARS           = BLOCKS.register("horizontal_redwood_bars",            () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CHERRY_BARS            = BLOCKS.register("horizontal_cherry_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_MAHOGANY_BARS          = BLOCKS.register("horizontal_mahogany_bars",           () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_JACARANDA_BARS         = BLOCKS.register("horizontal_jacaranda_bars",          () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_PALM_BARS              = BLOCKS.register("horizontal_palm_bars",               () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_WILLOW_BARS            = BLOCKS.register("horizontal_willow_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_DEAD_BARS              = BLOCKS.register("horizontal_dead_bars",               () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_MAGIC_BARS             = BLOCKS.register("horizontal_magic_bars",              () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_UMBRAN_BARS            = BLOCKS.register("horizontal_umbran_bars",             () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_HELLBARK_BARS          = BLOCKS.register("horizontal_hellbark_bars",           () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));

    public static final RegistryObject<Block> HORIZONTAL_CROSSED_FIR_BARS       = BLOCKS.register("horizontal_crossed_fir_bars",        () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_REDWOOD_BARS   = BLOCKS.register("horizontal_crossed_redwood_bars",    () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_CHERRY_BARS    = BLOCKS.register("horizontal_crossed_cherry_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAHOGANY_BARS  = BLOCKS.register("horizontal_crossed_mahogany_bars",   () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_JACARANDA_BARS = BLOCKS.register("horizontal_crossed_jacaranda_bars",  () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_PALM_BARS      = BLOCKS.register("horizontal_crossed_palm_bars",       () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_WILLOW_BARS    = BLOCKS.register("horizontal_crossed_willow_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_DEAD_BARS      = BLOCKS.register("horizontal_crossed_dead_bars",       () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAGIC_BARS     = BLOCKS.register("horizontal_crossed_magic_bars",      () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_UMBRAN_BARS    = BLOCKS.register("horizontal_crossed_umbran_bars",     () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_HELLBARK_BARS  = BLOCKS.register("horizontal_crossed_hellbark_bars",   () -> new BlockHorizontalBars(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F)));

}

