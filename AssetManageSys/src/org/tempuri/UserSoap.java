/**
 * UserSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface UserSoap extends java.rmi.Remote {

    /**
     * 验证用户是否存在，返回值：1正常，其它为不存在
     */
    public org.tempuri.ReturnValue checkUserName(java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * 读取用户基本信息for username
     */
    public void getUserDetailInfo(java.lang.String username, org.tempuri.holders.ReturnValueHolder getUserDetailInfoResult, org.tempuri.holders.UserInfoHolder ui) throws java.rmi.RemoteException;

    /**
     * 读取用户基本信息for digitalID
     */
    public void getUserDetailInfoForDigitalID(int digitalID, org.tempuri.holders.ReturnValueHolder getUserDetailInfoForDigitalIDResult, org.tempuri.holders.UserInfoHolder ui) throws java.rmi.RemoteException;

    /**
     * 验证数字ID是否存在，返回值：1正常，0为不存在
     */
    public org.tempuri.ReturnValue checkUserForDigitalID(int digitalID) throws java.rmi.RemoteException;

    /**
     * 格式为"1 or 0,返回值",0为失败，1为成功，返回内容：英文用户名返回不变，中文返回"zw~数字id",
     */
    public org.tempuri.ReturnValue getUsernameOrZwDigitalID(java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * 解密用户登录Cookie-S1
     */
    public void getLoginCookies(java.lang.String s1, org.tempuri.holders.ReturnValueHolder getLoginCookiesResult, org.tempuri.holders.UserInfoHolder ui) throws java.rmi.RemoteException;

    /**
     * 根据生成联众帐号得到合作方帐号
     */
    public org.tempuri.ReturnValue getCooperationID(java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * 检察合作方用户是否已经绑定
     */
    public org.tempuri.ReturnValue checkAccountBind(int companID, java.lang.String account) throws java.rmi.RemoteException;

    /**
     * 合作方用户绑定(根据合作方标识，自动生成联众帐号)
     */
    public org.tempuri.ReturnValue accountBind(int companID, java.lang.String account, java.lang.String password, java.lang.String nickName, int male) throws java.rmi.RemoteException;

    /**
     * 合作方用户绑定(根据用户输入生成联众帐号,companID, account, password, ogUsername,ogNickName,ogPassword以上五个参数为必输，其它为预留扩展)
     */
    public org.tempuri.ReturnValue accountBindEx(int companID, java.lang.String account, java.lang.String password, java.lang.String ogUsername, java.lang.String ogNickName, java.lang.String ogPassword, java.lang.String ogEmail, java.lang.String ogPersonalID, int ogMale, int ogBorn, java.lang.String ogRealName, int ogCountry, java.lang.String ogState, int ogIDType) throws java.rmi.RemoteException;

    /**
     * 获得用户的游戏积分
     */
    public org.tempuri.ReturnValue getScore(java.lang.String userName, int dwGameID) throws java.rmi.RemoteException;

    /**
     * 清除用户的游戏积分;0失败1成功2	财富不够8暂停竞猜
     */
    public org.tempuri.ReturnValue clearScoreEx(java.lang.String userName, int dwGameID, int nMoney, int nTable) throws java.rmi.RemoteException;
}
