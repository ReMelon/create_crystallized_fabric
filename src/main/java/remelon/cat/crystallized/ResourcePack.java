package remelon.cat.crystallized;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ResourcePack {
	public static void addPack() {
		if (FabricLoader.getInstance().isModLoaded("crystallized")) {
		ModContainer crystallized = FabricLoader.getInstance().getModContainer(Crystallized.ID)
				.orElseThrow(() -> new IllegalStateException("Crystallized's ModContainer couldn't be found!"));
		Identifier packId = Crystallized.GenI("rose_rename");
		ResourceManagerHelper.registerBuiltinResourcePack(packId, crystallized, Text.translatable("Rename Rose Quartz"), ResourcePackActivationType.DEFAULT_ENABLED);
		}
	}



	public static void register() {
		Crystallized.LOGGER.info("Registering Crystallized Resource Pack");
		ResourcePack.addPack();
	}
}
