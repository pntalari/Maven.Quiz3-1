package rocks.zipcode.io.quiz3.collections;

import java.util.Comparator;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab>  {
    String labName = "";
    LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
       return this.labStatus;
    }

    @Override
    public int compareTo(Lab o) {
        return labName.compareTo(o.getName());
    }

//    @Override
//    public int compare(Lab o1, Lab o2) {
//        return o1.labName.compareTo(o2.labName);
//    }
}
