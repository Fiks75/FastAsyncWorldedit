package com.boydti.fawe.bukkit.v1_10;

import com.boydti.fawe.bukkit.ABukkitMain;
import com.boydti.fawe.bukkit.v0.BukkitEditSessionWrapper_0;
import com.boydti.fawe.bukkit.v0.BukkitQueue_0;
import com.boydti.fawe.object.EditSessionWrapper;
import com.sk89q.worldedit.EditSession;

public class BukkitMain_110 extends ABukkitMain {
    @Override
    public BukkitQueue_0 getQueue(String world) {
        return new com.boydti.fawe.bukkit.v1_10.BukkitQueue_1_10(world);
    }

    @Override
    public EditSessionWrapper getEditSessionWrapper(EditSession session) {
        return new BukkitEditSessionWrapper_0(session);
    }
}