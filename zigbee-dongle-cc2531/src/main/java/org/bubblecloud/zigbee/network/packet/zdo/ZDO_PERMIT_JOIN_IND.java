package org.bubblecloud.zigbee.network.packet.zdo;

import org.bubblecloud.zigbee.network.packet.ZToolCMD;
import org.bubblecloud.zigbee.network.packet.ZToolPacket;
import org.bubblecloud.zigbee.util.DoubleByte;

/**
 * Created by Andrej on 14.4.2018.
 */
public class ZDO_PERMIT_JOIN_IND extends ZToolPacket {

    /**
     * Constructor
     */
    public ZDO_PERMIT_JOIN_IND() {
    }

    /**
     * Constructor
     * @param framedata
     */
    public ZDO_PERMIT_JOIN_IND(int[] framedata) {
        super.buildPacket(new DoubleByte(ZToolCMD.ZDO_PERMIT_JOIN_IND), framedata);
    }

}
