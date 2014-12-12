// @formatter:off
/*
 * Pexel Project - Minecraft minigame server platform. 
 * Copyright (C) 2014 Matej Kormuth <http://www.matejkormuth.eu>
 * 
 * This file is part of Pexel.
 * 
 * Pexel is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * Pexel is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 *
 */
// @formatter:on
package eu.matejkormuth.pexel.slave;

import java.io.File;

import eu.matejkormuth.pexel.slave.boot.PexelSlaveBukkitPlugin;
import eu.matejkormuth.pexel.slave.bukkit.HardCoded;
import eu.matejkormuth.pexel.slave.bukkit.PexelCore;

/**
 * ServerComponent that does initialize legacy PexelCore code.
 */
public class LegacyCoreComponent extends SlaveComponent {
    @Override
    public void onEnable() {
        this.getLogger().info("Enabling legacy PexelCore code...");
        File f = new File(PexelSlaveBukkitPlugin.getInstance()
                .getDataFolder()
                .getAbsolutePath()
                + "/$legacy/");
        f.mkdirs();
        new PexelCore(f, PexelSlaveBukkitPlugin.getInstance()).onEnable();
        HardCoded.main();
    }
    
    @Override
    public void onDisable() {
        this.getLogger().info("Disabling legacy PexelCore code...");
    }
}
