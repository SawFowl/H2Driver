package sawfowl.h2driver;

import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

import com.google.inject.Inject;

@Plugin("h2driver")
public class H2Driver {

	private PluginContainer pluginContainer;

	@Inject
	public H2Driver(PluginContainer pluginContainer) {
		this.pluginContainer = pluginContainer;
	}

	public PluginContainer getPluginContainer() {
		return pluginContainer;
	}

}
