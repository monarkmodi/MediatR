package com.ljcapps.middleman;

public class Profile {

    private String _firstName;
    private String _lastName;
    private int _ccNumber;
    private int _expDate;
    private int _cvv;
    private String _email;
    private long _cellPhone;
    private String _address;

    public Profile() {}

    public Profile(String _firstName, String _lastName, int _ccNumber, int _expDate, String _email, int _cvv, long _cellPhone) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._ccNumber = _ccNumber;
        this._expDate = _expDate;
        this._email = _email;
        this._cvv = _cvv;
        this._cellPhone = _cellPhone;
    }

    public String get_firstName() {
        return _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public int get_ccNumber() {
        return _ccNumber;
    }

    public int get_expDate() {
        return _expDate;
    }

    public int get_cvv() {
        return _cvv;
    }

    public String get_email() {
        return _email;
    }

    public long get_cellPhone() {
        return _cellPhone;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public void set_cvv(int _cvv) {
        this._cvv = _cvv;
    }

    public void set_ccNumber(int _ccNumber) {
        this._ccNumber = _ccNumber;
    }

    public void set_expDate(int _expDate) {
        this._expDate = _expDate;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public void set_cellPhone(long _cellPhone) {
        this._cellPhone = _cellPhone;
    }
}
