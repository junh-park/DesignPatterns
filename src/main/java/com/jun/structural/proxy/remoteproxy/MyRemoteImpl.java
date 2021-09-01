package com.jun.structural.proxy.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	private static final long serialVersionUID = 1L;

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String sayHello() throws RemoteException {
		return "Server says Hello";
	}
	
	public static void main(String[] args) {
		try {
			MyRemoteImpl service = new MyRemoteImpl();
			Naming.bind("remoteHello", service);
		} catch (MalformedURLException | RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
}
