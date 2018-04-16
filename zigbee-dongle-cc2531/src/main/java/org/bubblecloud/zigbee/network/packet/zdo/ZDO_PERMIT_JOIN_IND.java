package org.bubblecloud.zigbee.network.packet.zdo;

import org.bubblecloud.zigbee.network.packet.ZToolCMD;
import org.bubblecloud.zigbee.network.packet.ZToolPacket;
import org.bubblecloud.zigbee.util.DoubleByte;

/**
 * Created by Andrej on 14.4.2018.
 */
public class ZDO_PERMIT_JOIN_IND extends ZToolPacket {

    /**
     * Remaining time (in seconds) to join new devices.
     * If value is 255, then the joining is enabled "forever" - without timeout.
     */
    public int value;

    /**
     * If join is enabled (it is so when value > 0).
     */
    public boolean enabled;

    /**
     * Constructor
     */
    public ZDO_PERMIT_JOIN_IND() {
    }

    /**
     * Constructor
     *
     * @param framedata
     */
    public ZDO_PERMIT_JOIN_IND(int[] framedata) {
        if (framedata.length > 0) {
            value = framedata[0];
            enabled = value > 0;
        }
        super.buildPacket(new DoubleByte(ZToolCMD.ZDO_PERMIT_JOIN_IND), framedata);
    }

}
