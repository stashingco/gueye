package dev.stashy.gueye.gui

import net.minecraft.item.ItemStack

class ClickableItem(
    var icon: ItemStack,
    var onClick: Function<Any>? = null,
    var onRightClick: Function<Any>? = null,
    var onShiftClick: Function<Any>? = null,
    var onDrop: Function<Any>? = null,
) : Renderable {
    override val size: Int = 1

    override fun render(w: Int, h: Int): List<ItemStack> {
        return listOf(icon)
    }
}