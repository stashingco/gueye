package dev.stashy.gueye.gui

import net.minecraft.item.ItemStack

interface Renderable {
    val size: Int
    fun render(w: Int, h: Int): List<ItemStack>
}