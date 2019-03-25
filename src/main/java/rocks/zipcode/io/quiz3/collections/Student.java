package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
   List<Lab> labList;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
      this.labList = new ArrayList<>();
    }

    public Lab getLab(String labName) {
        Lab lab = get
        if(this.labList.contains()){
            Integer index = labList.indexOf(labName);
            return labList.get(index);
        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if(lab == null){
            throw new UnsupportedOperationException();
        }
        lab.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        this.labList.add(lab);

    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
