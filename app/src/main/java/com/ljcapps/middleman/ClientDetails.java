package com.ljcapps.middleman;

public class ClientDetails {

    private int _ccNumber;
    private double _latitude;
    private double _longitude;
    private long _phone;

    public ClientDetails(int _ccNumber, double _longitude, double _latitude, long _phone) {
        this._ccNumber = _ccNumber;
        this._longitude = _longitude;
        this._latitude = _latitude;
        this._phone = _phone;
    }

    public double get_latitude() {
        return _latitude;
    }

    public int get_ccNumber() {
        return _ccNumber;
    }

    public double get_longitude() {
        return _longitude;
    }

    public long get_phone() {
        return _phone;
    }

    public void set_ccNumber(int _ccNumber) {
        this._ccNumber = _ccNumber;
    }

    public void set_latitude(double _latitude) {
        this._latitude = _latitude;
    }

    public void set_longitude(double _longitude) {
        this._longitude = _longitude;
    }

    public void set_phone(long _phone) {
        this._phone = _phone;
    }
}
