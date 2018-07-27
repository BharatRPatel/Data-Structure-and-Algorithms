import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OverlappingInterval {

    public static void main(String args[]) {



        Interval i1 = new Interval(4, 7);
        Interval i2 = new Interval(6, 8);
        Interval i5 = new Interval(3, 5);
        Interval i3 = new Interval(1, 9);
        Interval i4 = new Interval(2, 4);

        Interval arr[] = new Interval[]{i1, i2, i3, i4,i5};


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);  System.out.println(arr[4]);
        Arrays.sort(arr, new NumberComparator());
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        int i=0;
        int index=0;
        for (i=0; i<arr.length; i++)
        {
            // If this is not first Interval and overlaps
            // with the previous one
            if (index != 0 && arr[index-1].end >= arr[i].start)
            {
                while (index != 0 && arr[index-1].end >= arr[i].start)
                {
                    // Merge previous and current Intervals
                    arr[index-1].end = Math.max(arr[index-1].end, arr[i].end);
                    arr[index-1].start = Math.min(arr[index-1].start, arr[i].start);
                    index--;
                }
            }
            else {
                arr[index] = arr[i];
            }

            index++;
        }


        for(int j=0;j<index;j++){

            System.out.print(arr[j].start + " ");
            System.out.print(arr[j].end);
            System.out.println();
        }


    }
}



class Interval{

    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;

    }

    public String toString(){

        return start + " " + end;
    }
}

class NumberComparator implements Comparator <Interval> {

    public int compare(Interval i1, Interval i2){

        return (i1.start > i2.start ? 1:(i1.start < i2.start)?-1:0);
    }
}
