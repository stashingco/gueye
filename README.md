# Gueye

Fabric server-side inventory GUI API with Kotlin DSL.

## Examples

```kotlin
GuiInventory {
    title = "GUI Title"
    panel {
        item(Items.EMERALD.defaultStack) {
            onClick = {
                println("click!")
            }
        }
        item(Items.STICK.defaultStack) {
            onRightClick = {
                println("rightclick!")
            }
        }
    }
}
```
