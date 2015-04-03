package interfac.model;

import interfac.main.rateWindowsOperatingSystems;

public class WindowsOSModel implements rateWindowsOperatingSystems
{
	public int winMil;
	public int winVis;
	public int winXP;
	public String praise;
	
	public void rateWindowsMillenium(int x)
	{
		this.winMil = x;
	}

	public void rateWindowsVista(int x)
	{
		this.winVis = x;
	}

	public void rateWindowsXP(int x)
	{
		this.winXP = x;
	}

	public void praiseDEHBestOS(String praise)
	{
		this.praise = praise;
	}

	public String criticizeDaOtherOS()
	{
		String temp = "";
		if(winMil > winVis && winMil > winXP)
		{
			temp += ("WANDOWS MALAIAM IZ DA BEST OS IN DEH WORLDZ. ALL OTHER OS'S SUCK!!!!!");
		}
		if(winVis > winMil && winVis > winXP)
		{
			temp += ("WANDOWS VASTA IZ DA BEST OS IN DEH WORLDZ. ALL OTHER OS'S SUCK!!!!!");
		}
		if(winXP > winMil && winXP > winVis)
		{
			temp += ("WANDOWS AXEPEE IZ DA BEST OS IN DEH WORLDZ. ALL OTHER OS'S SUCK!!!!!");
		}
		return temp;
	}
}
