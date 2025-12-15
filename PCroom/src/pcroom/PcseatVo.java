package pcroom;

public class PcseatVo {
	
	int seatNo;
	boolean isUsing;
	int remainTime;
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;

	}
	public boolean isUsing() {
		return isUsing;
	}
	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}
	public int getRemainTime() {
		return remainTime;
	}
	public void setRemainTime(int remainTime) {
		this.remainTime = remainTime;
	}
	@Override
	public String toString() {
		return "PcseatVo [seatNo=" + seatNo + ", isUsing=" + isUsing + ", remainTime=" + remainTime + "]";
	}
	
	public PcseatVo(int seatNo, boolean isUsing, int remainTime) {

		this.seatNo = seatNo;

	}
	public PcseatVo() {
	
	}
	//시간 충전하기
	public void giveTime(int time) {
	    if (!isUsing) {
	        isUsing = true;  
	    }
	    remainTime += time;
	}
}
