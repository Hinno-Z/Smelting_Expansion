package net.hinno.smelting_expansion;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod(smelting_expansion.MODID)
public class smelting_expansion
{
    public static final String MODID = "smelt_expand";

    public smelting_expansion()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
    public class Event {

        @SubscribeEvent
        public static void addFuel(FurnaceFuelBurnTimeEvent event) {
            ItemStack stack = event.getItemStack ();
            Item item = stack.getItem ();
            if (item == Items.STONE_AXE){event.setBurnTime (200);}
            if (item == Items.STONE_HOE){event.setBurnTime (200);}
            if (item == Items.STONE_SHOVEL){event.setBurnTime (200);}
            if (item == Items.STONE_SWORD){event.setBurnTime (100);}
            if (item == Items.STONE_PICKAXE){event.setBurnTime (200);}
        }
    }
}
