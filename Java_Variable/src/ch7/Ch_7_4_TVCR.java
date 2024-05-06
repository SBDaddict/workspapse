package ch7;

public class Ch_7_4_TVCR extends Tv1 {
	VCR vcr = new VCR();

	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}

}

class Tv1 {
	boolean power;
	int channle;

	void power() {
		power = !power;
	}

	void channleUp() {
		++channle;
	}

	void channleDoun() {
		--channle;
	}
}

class VCR {
	boolean power;
	int counter = 0;

	void power() {
		power = !power;
	}

	void play() {
		/* 내용생략 */}

	void stop() {
		/* 내용생략 */}

	void rew() {
		/* 내용생략 */}

	void ff() {
		/* 내용생략 */}
}
