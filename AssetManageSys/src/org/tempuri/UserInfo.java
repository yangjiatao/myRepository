/**
 * UserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UserInfo  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String nickname;

    private java.lang.String digitalID;

    private java.lang.String email;

    private int freeDays;

    private int expireDate;

    private int male;

    private int coin;

    private int cash;

    private int deposit;

    private int luckmoney;

    private int memberRank;

    private int powerGameCoin;

    private int born;

    public UserInfo() {
    }

    public UserInfo(
           java.lang.String username,
           java.lang.String nickname,
           java.lang.String digitalID,
           java.lang.String email,
           int freeDays,
           int expireDate,
           int male,
           int coin,
           int cash,
           int deposit,
           int luckmoney,
           int memberRank,
           int powerGameCoin,
           int born) {
           this.username = username;
           this.nickname = nickname;
           this.digitalID = digitalID;
           this.email = email;
           this.freeDays = freeDays;
           this.expireDate = expireDate;
           this.male = male;
           this.coin = coin;
           this.cash = cash;
           this.deposit = deposit;
           this.luckmoney = luckmoney;
           this.memberRank = memberRank;
           this.powerGameCoin = powerGameCoin;
           this.born = born;
    }


    /**
     * Gets the username value for this UserInfo.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserInfo.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the nickname value for this UserInfo.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this UserInfo.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the digitalID value for this UserInfo.
     * 
     * @return digitalID
     */
    public java.lang.String getDigitalID() {
        return digitalID;
    }


    /**
     * Sets the digitalID value for this UserInfo.
     * 
     * @param digitalID
     */
    public void setDigitalID(java.lang.String digitalID) {
        this.digitalID = digitalID;
    }


    /**
     * Gets the email value for this UserInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the freeDays value for this UserInfo.
     * 
     * @return freeDays
     */
    public int getFreeDays() {
        return freeDays;
    }


    /**
     * Sets the freeDays value for this UserInfo.
     * 
     * @param freeDays
     */
    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }


    /**
     * Gets the expireDate value for this UserInfo.
     * 
     * @return expireDate
     */
    public int getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this UserInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(int expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the male value for this UserInfo.
     * 
     * @return male
     */
    public int getMale() {
        return male;
    }


    /**
     * Sets the male value for this UserInfo.
     * 
     * @param male
     */
    public void setMale(int male) {
        this.male = male;
    }


    /**
     * Gets the coin value for this UserInfo.
     * 
     * @return coin
     */
    public int getCoin() {
        return coin;
    }


    /**
     * Sets the coin value for this UserInfo.
     * 
     * @param coin
     */
    public void setCoin(int coin) {
        this.coin = coin;
    }


    /**
     * Gets the cash value for this UserInfo.
     * 
     * @return cash
     */
    public int getCash() {
        return cash;
    }


    /**
     * Sets the cash value for this UserInfo.
     * 
     * @param cash
     */
    public void setCash(int cash) {
        this.cash = cash;
    }


    /**
     * Gets the deposit value for this UserInfo.
     * 
     * @return deposit
     */
    public int getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this UserInfo.
     * 
     * @param deposit
     */
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the luckmoney value for this UserInfo.
     * 
     * @return luckmoney
     */
    public int getLuckmoney() {
        return luckmoney;
    }


    /**
     * Sets the luckmoney value for this UserInfo.
     * 
     * @param luckmoney
     */
    public void setLuckmoney(int luckmoney) {
        this.luckmoney = luckmoney;
    }


    /**
     * Gets the memberRank value for this UserInfo.
     * 
     * @return memberRank
     */
    public int getMemberRank() {
        return memberRank;
    }


    /**
     * Sets the memberRank value for this UserInfo.
     * 
     * @param memberRank
     */
    public void setMemberRank(int memberRank) {
        this.memberRank = memberRank;
    }


    /**
     * Gets the powerGameCoin value for this UserInfo.
     * 
     * @return powerGameCoin
     */
    public int getPowerGameCoin() {
        return powerGameCoin;
    }


    /**
     * Sets the powerGameCoin value for this UserInfo.
     * 
     * @param powerGameCoin
     */
    public void setPowerGameCoin(int powerGameCoin) {
        this.powerGameCoin = powerGameCoin;
    }


    /**
     * Gets the born value for this UserInfo.
     * 
     * @return born
     */
    public int getBorn() {
        return born;
    }


    /**
     * Sets the born value for this UserInfo.
     * 
     * @param born
     */
    public void setBorn(int born) {
        this.born = born;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfo)) return false;
        UserInfo other = (UserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.digitalID==null && other.getDigitalID()==null) || 
             (this.digitalID!=null &&
              this.digitalID.equals(other.getDigitalID()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.freeDays == other.getFreeDays() &&
            this.expireDate == other.getExpireDate() &&
            this.male == other.getMale() &&
            this.coin == other.getCoin() &&
            this.cash == other.getCash() &&
            this.deposit == other.getDeposit() &&
            this.luckmoney == other.getLuckmoney() &&
            this.memberRank == other.getMemberRank() &&
            this.powerGameCoin == other.getPowerGameCoin() &&
            this.born == other.getBorn();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getDigitalID() != null) {
            _hashCode += getDigitalID().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getFreeDays();
        _hashCode += getExpireDate();
        _hashCode += getMale();
        _hashCode += getCoin();
        _hashCode += getCash();
        _hashCode += getDeposit();
        _hashCode += getLuckmoney();
        _hashCode += getMemberRank();
        _hashCode += getPowerGameCoin();
        _hashCode += getBorn();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "UserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DigitalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FreeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("male");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Male"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Coin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Cash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luckmoney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Luckmoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberRank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MemberRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerGameCoin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PowerGameCoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("born");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Born"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
