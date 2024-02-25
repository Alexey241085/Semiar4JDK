package org.example;

import java.util.Comparator;

public class ComporatorByLengthOfWork implements Comparator<FelloWorker> {

    @Override
    public int compare(FelloWorker o1, FelloWorker o2) {
        return Double.compare(o1.lengthOfWork, o2.lengthOfWork);
    }
}
