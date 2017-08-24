package com.hydra.net.entries.impl;


import com.hydra.net.entries.Address;
import lombok.ToString;

@ToString
public class JGroupsAddress implements Address<org.jgroups.Address>{

    private org.jgroups.Address address;

    public void setAddress(org.jgroups.Address address) {
       this.address = address;
    }

    public org.jgroups.Address getAddress() {
        return this.address;
    }

    public org.jgroups.Address addressConverte(Address address) {
        return address.getAddress() instanceof org.jgroups.Address ? (org.jgroups.Address)address.getAddress():null;
    }
}
