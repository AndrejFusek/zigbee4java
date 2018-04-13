package org.bubblecloud.zigbee.network.packet.zdo;

import org.bubblecloud.zigbee.network.packet.ZToolCMD;
import org.bubblecloud.zigbee.network.packet.ZToolPacket;
import org.bubblecloud.zigbee.util.DoubleByte;
import org.bubblecloud.zigbee.v3.model.ZToolAddress16;
import org.bubblecloud.zigbee.v3.model.ZToolAddress64;

/**
 * This message is an indication to inform the host of a device leaving the network.
 * Byte: 1      1           1           2       8       1       1       1
 *  Length=0x0D Cmd0=0x45   Cmd1=0xC9   SrcAddr ExtAddr Request Remove  Rejoin
 * Created by Andrej on 13.4.2018.
 */
public class ZDO_LEAVE_IND extends ZToolPacket {
    /**
     * Short address of the source of the leave indication
     */
    public ZToolAddress16 srcAddr;
    /**
     * 64 bit IEEE address of the source of the leave indication
     */
    public ZToolAddress64 extAddr;
    /**
     * true = request, false = indication
     */
    public boolean request;
    /**
     * true = remove children
     */
    public boolean remove;
    /**
     * true = rejoin
     */
    public boolean rejoin;


    /**
     * Constructor
     */
    public ZDO_LEAVE_IND() {
    }


    /**
     * Constructor
     * @param framedata raw data of message
     */
    public ZDO_LEAVE_IND(int[] framedata) {
        srcAddr = new ZToolAddress16(framedata[1], framedata[0]);
        byte[] bytes = new byte[8];
        for (int i = 0; i < 8; i++) {
            bytes[i] = (byte) framedata[9 - i];
        }
        extAddr = new ZToolAddress64(bytes);
        request = (framedata[10] != 0);
        remove = (framedata[11] != 0);
        rejoin = (framedata[12] != 0);
        super.buildPacket(new DoubleByte(ZToolCMD.ZDO_LEAVE_IND), framedata);
    }
}
