package dev.stashy.gueye.gui

import dev.stashy.gueye.gui.layout.Panel

class GuiInventory(callback: GuiInventory.() -> Unit) : Panel(null) {
    var title: String = "Menu"

    init {
        callback.invoke(this)
    }
}