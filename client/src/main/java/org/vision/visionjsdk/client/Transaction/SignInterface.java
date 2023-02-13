package org.vision.visionjsdk.client.Transaction;

public interface SignInterface {

  byte[] getPrivateKey();

  byte[] getPubKey();

  byte[] getAddress();

  String signHash(byte[] hash);

  byte[] getNodeId();

  byte[] Base64toBytes(String signature);
}
