package org.bubblecloud.zigbee.v3.zdo.command;

import org.bubblecloud.zigbee.v3.model.ZToolAddress16;
import org.bubblecloud.zigbee.v3.zdo.ZdoCommand;

/**
 * Created by Andrej on 17.4.2018.
 */
public class MatchDescriptionResponse extends ZdoCommand {
    public int MatchCount;

    public int[] MatchEndpointList;

    public ZToolAddress16 NWKAddrOfInterest;

    public ZToolAddress16 SrcAddress;

    public int Status;

    public MatchDescriptionResponse() {
    }

    public MatchDescriptionResponse(int matchCount, int[] matchEndpointList, ZToolAddress16 NWKAddrOfInterest, ZToolAddress16 srcAddress, int status) {
        MatchCount = matchCount;
        MatchEndpointList = matchEndpointList;
        this.NWKAddrOfInterest = NWKAddrOfInterest;
        SrcAddress = srcAddress;
        Status = status;
    }

    public int getMatchCount() {
        return MatchCount;
    }

    public void setMatchCount(int matchCount) {
        MatchCount = matchCount;
    }

    public int[] getMatchEndpointList() {
        return MatchEndpointList;
    }

    public void setMatchEndpointList(int[] matchEndpointList) {
        MatchEndpointList = matchEndpointList;
    }

    public ZToolAddress16 getNWKAddrOfInterest() {
        return NWKAddrOfInterest;
    }

    public void setNWKAddrOfInterest(ZToolAddress16 NWKAddrOfInterest) {
        this.NWKAddrOfInterest = NWKAddrOfInterest;
    }

    public ZToolAddress16 getSrcAddress() {
        return SrcAddress;
    }

    public void setSrcAddress(ZToolAddress16 srcAddress) {
        SrcAddress = srcAddress;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
