import java.util.*;

public class PrimeDivisorListImpl implements PrimeDivisorList {
	private List<Integer> primes = new ArrayList<Integer>();

	@Override
	public void add(Integer integer) throws NullPointerException, IllegalArgumentException {
		if (integer == null) {
			throw new NullPointerException();
		} else if (isPrime(integer)) {
			primes.add(integer);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void remove(int index) {
	}

	@Override
	public String toString() {
		return primes.toString();
	}

	private boolean isPrime(Integer number) {
		Integer divisor = number - 1;
		boolean prime = true;
		while (divisor > 1) {
			if(number % divisor == 0) {
				prime = false;
			}
			divisor--;
		}
		return prime;
	}

}