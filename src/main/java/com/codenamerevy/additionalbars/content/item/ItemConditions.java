package com.codenamerevy.additionalbars.content.item;

import com.codenamerevy.additionalbars.AdditionalBars;
import com.codenamerevy.additionalbars.util.ModSupport;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ItemConditions implements ICondition
{
    public static final ResourceLocation NAME = new ResourceLocation(AdditionalBars.MODID, "items");
    public static String OBJECT;

    public ItemConditions(String object)
    {
        this.OBJECT = object;
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test() {
        if(OBJECT.equals("BOP"))        return ModSupport.BOP.isLoaded();
        if(OBJECT.equals("Corail"))     return ModSupport.CORAIL.isLoaded();
        if(OBJECT.equals("quark"))      return ModSupport.QUARK.isLoaded();
        return false;
    }

    public static class Serializer implements IConditionSerializer<ItemConditions> {
        public static final ItemConditions.Serializer INSTANCE = new ItemConditions.Serializer();

        @Override
        public void write(JsonObject json, ItemConditions value) {

        }

        @Override
        public ItemConditions read(JsonObject json) {
            return new ItemConditions(json.get("object").getAsString());
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}