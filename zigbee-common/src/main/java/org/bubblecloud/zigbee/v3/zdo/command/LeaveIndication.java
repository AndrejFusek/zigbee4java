package org.bubblecloud.zigbee.v3.zdo.command;

import org.bubblecloud.zigbee.v3.zdo.ZdoCommand;

/**
 * Created by Andrej on 14.4.2018.
 */
public class LeaveIndication extends ZdoCommand {
    /**
     * Source address.
     */
    private int sourceAddress;
    /**
     * Device IEEE address.
     */
    private long ieeeAddress;
    /**
     * true = request, false = indication
     */
    private boolean request;
    /**
     * true = remove children
     */
    private boolean remove;
    /**
     * true = rejoin
     */
    private boolean rejoin;

    public LeaveIndication() {
    }

    public LeaveIndication(int sourceAddress, long ieeeAddress, boolean request, boolean remove, boolean rejoin) {
        this.sourceAddress = sourceAddress;
        this.ieeeAddress = ieeeAddress;
        this.request = request;
        this.remove = remove;
        this.rejoin = rejoin;
    }

    public int getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(int sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public long getIeeeAddress() {
        return ieeeAddress;
    }

    public void setIeeeAddress(long ieeeAddress) {
        this.ieeeAddress = ieeeAddress;
    }

    public boolean isRequest() {
        return request;
    }

    public void setRequest(boolean request) {
        this.request = request;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }

    public boolean isRejoin() {
        return rejoin;
    }

    public void setRejoin(boolean rejoin) {
        this.rejoin = rejoin;
    }
}
