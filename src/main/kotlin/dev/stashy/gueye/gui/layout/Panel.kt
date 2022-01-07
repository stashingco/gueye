package dev.stashy.gueye.gui.layout

import dev.stashy.gueye.gui.LayoutContainer
import net.minecraft.item.ItemStack
import net.minecraft.util.collection.DefaultedList

open class Panel(parent: LayoutContainer?) : LayoutContainer(parent) {

    override fun render(w: Int, h: Int): DefaultedList<ItemStack> {
        val list = DefaultedList.ofSize(w * h, ItemStack.EMPTY)
        children.flatMap { it.render(w, h) }.toCollection(list)
        return list
    }
}