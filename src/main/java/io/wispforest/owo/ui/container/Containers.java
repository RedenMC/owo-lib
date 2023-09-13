package io.wispforest.owo.ui.container;

import io.wispforest.owo.ui.core.Component;
import io.wispforest.owo.ui.core.Sizing;
import io.wispforest.owo.ui.util.ElementConfigurer;
import net.minecraft.text.Text;

public final class Containers {

    private Containers() {}

    // ------
    // Layout
    // ------

    public static GridLayout grid(Sizing horizontalSizing, Sizing verticalSizing, int rows, int columns) {
        return new GridLayout(horizontalSizing, verticalSizing, rows, columns, null);
    }

    public static GridLayout grid(Sizing horizontalSizing, Sizing verticalSizing, int rows, int columns, ElementConfigurer<GridLayout> configurer) {
        return new GridLayout(horizontalSizing, verticalSizing, rows, columns, configurer);
    }

    public static FlowLayout verticalFlow(Sizing horizontalSizing, Sizing verticalSizing) {
        return new FlowLayout(horizontalSizing, verticalSizing, FlowLayout.Algorithm.VERTICAL, null);
    }

    public static FlowLayout horizontalFlow(Sizing horizontalSizing, Sizing verticalSizing) {
        return new FlowLayout(horizontalSizing, verticalSizing, FlowLayout.Algorithm.HORIZONTAL, null);
    }

    public static FlowLayout ltrTextFlow(Sizing horizontalSizing, Sizing verticalSizing) {
        return new FlowLayout(horizontalSizing, verticalSizing, FlowLayout.Algorithm.LTR_TEXT, null);
    }

    public static FlowLayout verticalFlow(Sizing horizontalSizing, Sizing verticalSizing, ElementConfigurer<FlowLayout> configurer) {
        return new FlowLayout(horizontalSizing, verticalSizing, FlowLayout.Algorithm.VERTICAL, configurer);
    }

    public static FlowLayout horizontalFlow(Sizing horizontalSizing, Sizing verticalSizing, ElementConfigurer<FlowLayout> configurer) {
        return new FlowLayout(horizontalSizing, verticalSizing, FlowLayout.Algorithm.HORIZONTAL, configurer);
    }

    public static FlowLayout ltrTextFlow(Sizing horizontalSizing, Sizing verticalSizing, ElementConfigurer<FlowLayout> configurer) {
        return new FlowLayout(horizontalSizing, verticalSizing, FlowLayout.Algorithm.LTR_TEXT, configurer);
    }

    public static StackLayout stack(Sizing horizontalSizing, Sizing verticalSizing) {
        return new StackLayout(horizontalSizing, verticalSizing);
    }

    // ------
    // Scroll
    // ------

    public static <C extends Component> ScrollContainer<C> verticalScroll(Sizing horizontalSizing, Sizing verticalSizing, C child) {
        return new ScrollContainer<>(ScrollContainer.ScrollDirection.VERTICAL, horizontalSizing, verticalSizing, child);
    }

    public static <C extends Component> ScrollContainer<C> horizontalScroll(Sizing horizontalSizing, Sizing verticalSizing, C child) {
        return new ScrollContainer<>(ScrollContainer.ScrollDirection.HORIZONTAL, horizontalSizing, verticalSizing, child);
    }

    // ----------------
    // Utility wrappers
    // ----------------

    public static <C extends Component> DraggableContainer<C> draggable(Sizing horizontalSizing, Sizing verticalSizing, C child) {
        return new DraggableContainer<>(horizontalSizing, verticalSizing, child);
    }

    public static CollapsibleContainer collapsible(Sizing horizontalSizing, Sizing verticalSizing, Text title, boolean expanded) {
        return new CollapsibleContainer(horizontalSizing, verticalSizing, title, expanded);
    }

    public static <C extends Component> OverlayContainer<C> overlay(C child) {
        return new OverlayContainer<>(child);
    }

    public static <C extends Component> RenderEffectWrapper<C> renderEffect(C child) {
        return new RenderEffectWrapper<>(child);
    }

}
