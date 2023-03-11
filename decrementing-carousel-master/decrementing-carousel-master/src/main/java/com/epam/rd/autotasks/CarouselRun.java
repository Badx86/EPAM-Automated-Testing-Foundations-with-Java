package com.epam.rd.autotasks;
import static com.epam.rd.autotasks.DecrementingCarousel.*;
public class CarouselRun {
    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;
    public int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        return array[position++]--;
    }

    public boolean isFinished() {
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }

}
