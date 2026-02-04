package co.edu.unbosque.view;

public class ViewFacade {
	
	private StartWindow sWin;

	public ViewFacade () {
		sWin = new StartWindow();
	}

	public StartWindow getsWin() {
		return sWin;
	}

	public void setsWin(StartWindow sWin) {
		this.sWin = sWin;
	}
	
	
}
