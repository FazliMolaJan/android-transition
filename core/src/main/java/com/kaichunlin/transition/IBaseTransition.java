package com.kaichunlin.transition;

import android.support.annotation.UiThread;

/**
 * Created by Kai on 2015/7/12.
 */
public interface IBaseTransition {
    /**
     * Starts the transition
     *
     * @return
     */
    @UiThread
    boolean startTransition();

    /**
     * Starts the transition, {@link com.kaichunlin.transition.adapter.ITransitionAdapter#getAdapterState()}.isTransitioning() will always returns true after this method is executed.
     *
     * @param progress the starting transition progress, the valid value range depends on the specific Adapter implementation
     * @return true if the call caused the transition to be started, false if the transition is already in the started state
     */
    @UiThread
    boolean startTransition(float progress);

    /**
     * Updates the transition progress
     *
     * @param progress
     */
    void updateProgress(float progress);

    /**
     * Stops the transition
     */
    @UiThread
    void stopTransition();
}
