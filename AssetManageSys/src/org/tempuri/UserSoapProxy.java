package org.tempuri;

public class UserSoapProxy implements org.tempuri.UserSoap {
  private String _endpoint = null;
  private org.tempuri.UserSoap userSoap = null;
  
  public UserSoapProxy() {
    _initUserSoapProxy();
  }
  
  public UserSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserSoapProxy();
  }
  
  private void _initUserSoapProxy() {
    try {
      userSoap = (new org.tempuri.UserLocator()).getUserSoap();
      if (userSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userSoap != null)
      ((javax.xml.rpc.Stub)userSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.UserSoap getUserSoap() {
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap;
  }
  
  public org.tempuri.ReturnValue checkUserName(java.lang.String userName) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.checkUserName(userName);
  }
  
  public void getUserDetailInfo(java.lang.String username, org.tempuri.holders.ReturnValueHolder getUserDetailInfoResult, org.tempuri.holders.UserInfoHolder ui) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    userSoap.getUserDetailInfo(username, getUserDetailInfoResult, ui);
  }
  
  public void getUserDetailInfoForDigitalID(int digitalID, org.tempuri.holders.ReturnValueHolder getUserDetailInfoForDigitalIDResult, org.tempuri.holders.UserInfoHolder ui) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    userSoap.getUserDetailInfoForDigitalID(digitalID, getUserDetailInfoForDigitalIDResult, ui);
  }
  
  public org.tempuri.ReturnValue checkUserForDigitalID(int digitalID) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.checkUserForDigitalID(digitalID);
  }
  
  public org.tempuri.ReturnValue getUsernameOrZwDigitalID(java.lang.String userName) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.getUsernameOrZwDigitalID(userName);
  }
  
  public void getLoginCookies(java.lang.String s1, org.tempuri.holders.ReturnValueHolder getLoginCookiesResult, org.tempuri.holders.UserInfoHolder ui) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    userSoap.getLoginCookies(s1, getLoginCookiesResult, ui);
  }
  
  public org.tempuri.ReturnValue getCooperationID(java.lang.String userName) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.getCooperationID(userName);
  }
  
  public org.tempuri.ReturnValue checkAccountBind(int companID, java.lang.String account) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.checkAccountBind(companID, account);
  }
  
  public org.tempuri.ReturnValue accountBind(int companID, java.lang.String account, java.lang.String password, java.lang.String nickName, int male) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.accountBind(companID, account, password, nickName, male);
  }
  
  public org.tempuri.ReturnValue accountBindEx(int companID, java.lang.String account, java.lang.String password, java.lang.String ogUsername, java.lang.String ogNickName, java.lang.String ogPassword, java.lang.String ogEmail, java.lang.String ogPersonalID, int ogMale, int ogBorn, java.lang.String ogRealName, int ogCountry, java.lang.String ogState, int ogIDType) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.accountBindEx(companID, account, password, ogUsername, ogNickName, ogPassword, ogEmail, ogPersonalID, ogMale, ogBorn, ogRealName, ogCountry, ogState, ogIDType);
  }
  
  public org.tempuri.ReturnValue getScore(java.lang.String userName, int dwGameID) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.getScore(userName, dwGameID);
  }
  
  public org.tempuri.ReturnValue clearScoreEx(java.lang.String userName, int dwGameID, int nMoney, int nTable) throws java.rmi.RemoteException{
    if (userSoap == null)
      _initUserSoapProxy();
    return userSoap.clearScoreEx(userName, dwGameID, nMoney, nTable);
  }
  
  
}