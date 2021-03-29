package pl.patryk.recruitment;

import pl.patryk.recruitment.utils.IntegerComparator;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayInfo {
    private List<Integer> distinctIntegers;
    private int count;
    private int distinct;
    private int min;
    private int max;

    public ArrayInfo() {
    }

    public ArrayInfo preprareInfo(List<Integer> inputList) {
        inputList.sort(new IntegerComparator());
        List<Integer> distinctIntegers = inputList.stream().distinct().collect(Collectors.toList());
        ArrayInfo arrayInfo = new ArrayInfo();
        arrayInfo.setDistinctIntegers(distinctIntegers);
        arrayInfo.setCount(inputList.size());
        arrayInfo.setDistinct(distinctIntegers.size());
        arrayInfo.setMin(distinctIntegers.get(0));
        arrayInfo.setMax(distinctIntegers.get(distinctIntegers.size() - 1));
        return arrayInfo;

    }

    public int getDistinct() {
        return distinct;
    }

    public void setDistinct(int distinct) {
        this.distinct = distinct;
    }

    public List<Integer> getDistinctIntegers() {
        return distinctIntegers;
    }

    public void setDistinctIntegers(List<Integer> distinctIntegers) {
        this.distinctIntegers = distinctIntegers;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String arrayString = distinctIntegers
                .toString()
                .substring(1, distinctIntegers.toString().length() - 1)
                .replaceAll(",", "");
        return arrayString +
                "\ncount: " + count +
                "\ndistinct: " + distinct +
                "\nmin: " + min +
                "\nmax: " + max;
    }
}
