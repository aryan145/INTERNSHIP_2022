public class Algo1_day1_2 extends VersionControl {  
    public int firstBadVersion(int n) {
        if (isBadVersion(1)) {
		return 1;
	}

	int l = 1;
	int r = n;

	while (l < r) {
		int m = l + (r - l) / 2;
		if (isBadVersion(m)) {
			// move left
			r = m;
		} else {
			// move right
			l = m + 1;
		}
	}

	return l;
}
        
    }
