public class Time {
	protected int hour;
	protected int minute;
	protected int second;
	public Time(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}
	public int getHour() {
		return hour;
	}
	public void setSecond(int sec) {
		second = sec;
	}
	public String toString() {
		String res = "";
		if (hour<10) {
			res+=(0+String.valueOf(hour));
		}
		else {
			res+=hour;
		}
		if (minute<10) {
			res+=(0+String.valueOf(minute));
		}
		else {
			res+=minute;
		}
		if (second<10) {
			res+=(0+String.valueOf(second));
		}
		else {
			res+=second;

		}
		return res;
	}
	public Time nextSecond() {
		second++;
		if (second==60) {
            minute++;
            second = 0;
        }
        if (minute==60) {
            hour++;
            minute = 0;
        }
        if (hour==13) {
            hour = 1;
        }
        return this;
    }
}		
