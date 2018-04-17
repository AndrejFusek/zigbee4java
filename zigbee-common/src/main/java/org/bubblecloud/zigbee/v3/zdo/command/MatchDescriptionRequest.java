package org.bubblecloud.zigbee.v3.zdo.command;

import org.bubblecloud.zigbee.util.DoubleByte;
import org.bubblecloud.zigbee.v3.model.ZToolAddress16;
import org.bubblecloud.zigbee.v3.zdo.ZdoCommand;

/**
 * Created by Andrej on 17.4.2018.
 */
public class MatchDescriptionRequest extends ZdoCommand {

    public ZToolAddress16 DstAddr;

    public DoubleByte[] InClusterList;

    public int NumInClusters;

    public int NumOutClusters;

    public ZToolAddress16 NWKAddrOfInterest;

    public DoubleByte[] OutClusterList;

    public DoubleByte ProfileID;

    public MatchDescriptionRequest() {
    }

    public MatchDescriptionRequest(int destinationAddress, int addressOfInterest, int profileID,
                                   int[] inputClusters,
                                   int[] outputClusters) {
        DstAddr = new ZToolAddress16(new int[]{destinationAddress>>8, destinationAddress&0xFF});
        NWKAddrOfInterest = new ZToolAddress16(new int[]{addressOfInterest>>8, addressOfInterest&0xFF});
        NumInClusters = inputClusters.length;
        DoubleByte[] db = new DoubleByte[inputClusters.length];
        for(int i = 0; i < inputClusters.length; i++) {
            db[i] = new DoubleByte(inputClusters[i]);
        }
        InClusterList = db;

        NumOutClusters = outputClusters.length;
        db = new DoubleByte[outputClusters.length];
        for(int i = 0; i < outputClusters.length; i++) {
            db[i] = new DoubleByte(outputClusters[i]);
        }
        OutClusterList = db;

        ProfileID = new DoubleByte(profileID);
    }

    public ZToolAddress16 getDstAddr() {
        return DstAddr;
    }

    public void setDstAddr(ZToolAddress16 dstAddr) {
        DstAddr = dstAddr;
    }

    public DoubleByte[] getInClusterList() {
        return InClusterList;
    }

    public void setInClusterList(DoubleByte[] inClusterList) {
        InClusterList = inClusterList;
    }

    public int getNumInClusters() {
        return NumInClusters;
    }

    public void setNumInClusters(int numInClusters) {
        NumInClusters = numInClusters;
    }

    public int getNumOutClusters() {
        return NumOutClusters;
    }

    public void setNumOutClusters(int numOutClusters) {
        NumOutClusters = numOutClusters;
    }

    public ZToolAddress16 getNWKAddrOfInterest() {
        return NWKAddrOfInterest;
    }

    public void setNWKAddrOfInterest(ZToolAddress16 NWKAddrOfInterest) {
        this.NWKAddrOfInterest = NWKAddrOfInterest;
    }

    public DoubleByte[] getOutClusterList() {
        return OutClusterList;
    }

    public void setOutClusterList(DoubleByte[] outClusterList) {
        OutClusterList = outClusterList;
    }

    public DoubleByte getProfileID() {
        return ProfileID;
    }

    public void setProfileID(DoubleByte profileID) {
        ProfileID = profileID;
    }
}
