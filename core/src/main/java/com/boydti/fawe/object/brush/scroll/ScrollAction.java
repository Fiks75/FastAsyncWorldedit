package com.boydti.fawe.object.brush.scroll;

import com.sk89q.worldedit.command.tool.BrushTool;

public abstract class ScrollAction implements ScrollTool {
    private BrushTool tool;

    public ScrollAction(BrushTool tool) {
        this.tool = tool;
    }

    public void setTool(BrushTool tool) {
        this.tool = tool;
    }

    public BrushTool getTool() {
        return tool;
    }
}
