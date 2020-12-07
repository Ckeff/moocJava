/*
 * @author ColeKeffel
 */

public class Money {
	private final int euros;
	private final int cents;
	
	public Money(int euros, int cents) {
		if(cents > 99) {
			euros += cents / 100;
			cents %= 100;
		}
		
		this.euros = euros;
		this.cents = cents;
		
	}
	
	public int euros() {
		return euros;
		
	}
	
	public int cents() {
		return cents;
		
	}
	
	public Money plus(Money added) {
		int newEuros = this.euros + added.euros;
		int newCents = this.cents + added.cents;
		
		Money result = new Money(newEuros, newCents);
		return result;
		
	}
	
	public Money minus(Money decremeted) {
		int thisTotal = (this.euros * 100) + this.cents;
		int decremetedTotal = (decremeted.euros * 100) + decremeted.cents;
		int resultTotal = thisTotal - decremetedTotal;
		
		if(resultTotal > 0) {
			Money result = new Money(0, resultTotal);
			return result;
		} else {
			Money result = new Money(0, 0);
			return result;
		}
	}
	
	public boolean less(Money added) {
		int thisTotal = (this.euros * 100) + this.cents;
		int comparedTotal = (added.euros * 100) + added.cents;
		
		if(thisTotal < comparedTotal) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String zero = "";
		if(cents <= 10) {
			zero = "0";
		}
		return euros + "." + zero + cents + "e";
	}
	

}
