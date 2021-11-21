package OOP.Constructors;

public class Averager {

    int sum = 0;
    int count = 0;

    public int getSum() {

        return sum;
    }

    public void add(int a) {

        sum = sum + a;
        count++;
    }

    public int getCount() {

        count = count + sum;

        return count;
    }

    public double getAverage() {

        return (double) sum / count;
    }
}

