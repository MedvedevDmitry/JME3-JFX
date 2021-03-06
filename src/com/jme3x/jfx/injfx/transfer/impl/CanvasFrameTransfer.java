package com.jme3x.jfx.injfx.transfer.impl;

import com.jme3.texture.FrameBuffer;
import com.sun.istack.internal.NotNull;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.PixelWriter;

/**
 * The class for transferring content from the jME to {@link Canvas}.
 *
 * @author JavaSaBr
 */
public class CanvasFrameTransfer extends AbstractFrameTransfer<Canvas> {

    public CanvasFrameTransfer(@NotNull final Canvas canvas, @NotNull int width, int height) {
        this(canvas, null, width, height);
    }

    public CanvasFrameTransfer(@NotNull final Canvas canvas, @NotNull final FrameBuffer frameBuffer,
                               final int width, final int height) {
        super(canvas, frameBuffer, width, height);
    }

    @Override
    protected PixelWriter getPixelWriter(@NotNull final Canvas destination, @NotNull final FrameBuffer frameBuffer,
                                         final int width, final int height) {
        return destination.getGraphicsContext2D().getPixelWriter();
    }
}
