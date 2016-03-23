package com.JTB.letsMod;

import com.JTB.letsMod.proxy.IProxy;
import com.JTB.letsMod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsMod {

	@Mod.Instance(Reference.MOD_ID)
	public static LetsMod instance;

	@SidedProxy(clientSide = "com.JTB.letsMod.proxy.ClientProxy", serverSide = "com.JTB.letsMod.proxy.ServerProxy")
	public static IProxy proxy;

	@Mod.EventHandler
	public void preIn(FMLPreInitializationEvent e) {

	}

	@Mod.EventHandler
	public void in(FMLInitializationEvent e) {

	}

	@Mod.EventHandler
	public void postIn(FMLPostInitializationEvent e) {

	}

}
