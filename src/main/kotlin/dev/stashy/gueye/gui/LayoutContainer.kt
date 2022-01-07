package dev.stashy.gueye.gui

import dev.stashy.gueye.gui.layout.Panel
import net.minecraft.item.ItemStack

abstract class LayoutContainer(val parent: LayoutContainer?) : Renderable {
    val children: MutableList<Renderable> = mutableListOf()
    override val size: Int
        get() = children.sumOf { it.size }

    fun item(
        icon: ItemStack, callback: ClickableItem.() -> Unit,
    ): ClickableItem {
        ClickableItem(icon).let {
            callback.invoke(it)
            children += it
            return it
        }
    }

    fun panel(callback: Panel.() -> Unit): Panel {
        Panel(this).let {
            callback.invoke(it)
            children += it
            return it
        }
    }
}