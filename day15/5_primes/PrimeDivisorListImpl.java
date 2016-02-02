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
		Collections.sort(primes);
	}

	@Override
	public void remove(int index) {
		primes.remove(index);
	}

	@Override
	public String toString() {
		String string = "";
		int prime;
		for(int i = 0; i < primes.size(); i++) {
			prime = primes.get(i);
			if (countOf(prime) > 1) {
				string += prime + "^" + countOf(prime);
				i += countOf(prime) - 1;
			} else {
				string += prime;
			}
			if (primes.size() > 1 && i < primes.size() - 1) {
				string += " * ";
			}
		}
		if (primes.size() > 1) {
			string += " = ";
			string += product();
		}
		return "[ " + string + " ]";
	}

	private int countOf(Integer number) {
		int count = 0;
		for(int i = 0; i < primes.size(); i++) {
			if (primes.get(i) == number) {
				count++;
			}
		}
		return count;
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

	private int product() {
		int accumulator = 1;
		for(int i = 0; i < primes.size(); i++) {
			accumulator *= primes.get(i);
		}
		return accumulator;
	}

}