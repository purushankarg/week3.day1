package org.sysytem;
//Single inheritance
public class Desktop extends Computer {
	
	public void desktopSize() 
	{
		System.out.println("Desktop of the Dell size is 14inch");
	}
	
	public static void main(String[] args) 
	{
	Desktop dsk = new Desktop();
	dsk.computerModel();
	dsk.desktopSize();
	}

}
