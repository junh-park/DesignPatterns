package com.jun.structural.proxy.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.*;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String sayHello = service.sayHello();
			
			System.out.println(sayHello);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}