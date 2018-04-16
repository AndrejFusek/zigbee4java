package org.bubblecloud.zigbee.network;

/**
 * Permit Join Listener - notification when the join of new devices is enabled or disabled.
 * Created on 16.4.2018.
 * @author AndrejFusek
 * @version 1.0
 * @since 3.0.2
 */
public interface PermitJoinListener {

    /**
     * Called when the join of new devices is enabled or disabled.
     * @param enabled true when new state is enabled, false when disabled
     */
    void changed(boolean enabled);

}
