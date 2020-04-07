package com.dawn.di;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Dawn on 2020-04-07.
 */
public class JavaCollection implements Serializable{
    private static final long serialVersionUID = -6949455009873526400L;
    List addressList;
    Set addressSet;
    Map mapAddress;
    Properties addressProp;

    public List getAddressList() {
        System.out.println("List Element:"+addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements:"+addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }


    public Map getMapAddress() {
        System.out.println("Map Elements:"+mapAddress);
        return mapAddress;
    }

    public void setMapAddress(Map mapAddress) {
        this.mapAddress = mapAddress;
    }

    public Properties getAddressProp() {
        System.out.println("Properties Elements:"+addressProp);
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
}
