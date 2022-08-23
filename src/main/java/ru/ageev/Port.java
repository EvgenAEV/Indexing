package ru.ageev;

import java.util.*;


public class Port {
    private String[] indexes;
    private List<Integer> list = new ArrayList<>();
//    Deque<Integer> index = new LinkedList<>();

    public Port(String[] indexes) {
        this.indexes = indexes;
    }

    public String[] getIndexes() {
        return indexes;
    }

    public void setIndexes(String[] indexes) {
        indexes = indexes;
    }

    public Integer[] stringToNumber() {

//        List<Integer> list1 = new ArrayList<>();

        for (String sT : indexes) {
            String[] tempArray = sT.split("(,|-)");
            for (String sA : tempArray)
                list.add(Integer.parseInt(sA));

        }
        return list.toArray(new Integer[0]);
    }


    public void returnOfPossibleOptions() {
        stringToNumber();
        int i;
        int j;
        int k;

        for (i = 0; i < list.size(); i++)
            for (j = 0; j < list.size(); j++) {
                if (j != i)

                    for (k = 0; k < list.size(); k++)
                        if (k != i && k != j) {
                            list.get(i);
                            list.get(j);
                            list.get(k);
                            System.out.printf("%s %s %s%n",
                                    list.get(i),
                                    list.get(j),
                                    list.get(k));
                        }
            }

    }
}


