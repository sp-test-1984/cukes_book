package nicebank;

public class Money {
    // field to track dollars
    private final int dollars;
    private final int cents;

    // no arg constructor
    public Money(){
        this.dollars = 0;
        this.cents = 0;
    }

    // arg constructor
    public Money(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    // accessors
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // provide equals method, otherwise assertion will fail since
    // comparison will verify if both arguments are the same object.
    @Override
    public boolean equals(Object other){
        boolean equals = false;
        if(other instanceof Money){
            equals = this.getDollars() == ((Money) other).getDollars() &&
                    this.getCents() == ((Money) other).getCents();

        }
        return equals;
    }

    // override to string
    @Override
    public String toString(){
        return String.format("$%01d.%02d", this.getDollars(), this.getCents());
    }

    // credit
    public Money add(Money amount){
        int newCents = this.cents + amount.cents;
        int newDollars = this.dollars + amount.dollars;
        if(newCents >= 100){
            newCents -= 100;
            newDollars++;
        }
        return new Money(newDollars, newCents);
    }

    //debit
    public Money minus(Money amount){
        int newCents = this.cents - amount.cents;
        int newDollars = this.dollars - amount.dollars;
        if(newCents < 0){
            newCents += 100;
            newDollars--;
        }
        return new Money(newDollars, newCents);
    }
}
