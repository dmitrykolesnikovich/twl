/*
 * Copyright (c) 2008-2010, Matthias Mann
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Matthias Mann nor the names of its contributors may
 *       be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.matthiasmann.twl.model;

/**
 * A generic button model.
 * Allows to separate button behavior from the button Widget.
 * <p>
 * A ButtonModel should not be shared between Button instances.
 *
 * @author Matthias Mann
 */
public interface ButtonModel {

    public boolean isSelected();

    public void setSelected(boolean selected);

    public boolean isPressed();

    public void setPressed(boolean pressed);

    public boolean isArmed();

    public void setArmed(boolean armed);

    public boolean isHover();

    public void setHover(boolean hover);

    public boolean isEnabled();

    public void setEnabled(boolean enabled);

    public void addActionCallback(Runnable callback);

    public void removeActionCallback(Runnable callback);

    public void fireActionCallback();

    public boolean hasActionCallbacks();

    public void addStateCallback(Runnable callback);

    public void removeStateCallback(Runnable callback);

    /**
     * Called when the Button is placed in the GUI tree.
     * Callbacks to other models should only be installed after this call.
     */
    public void connect();

    /**
     * Called when the Button is no longer part of the GUI tree.
     * Callbacks to other models should be removed.
     */
    public void disconnect();
}
