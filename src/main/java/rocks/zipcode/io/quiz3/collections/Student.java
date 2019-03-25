package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.*;

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
        for(Lab lab: labList) {
            if (lab.getName().equals(labName)) {
                Integer index = labList.indexOf(lab);
                return labList.get(index);
            }
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
        for(Lab lab: labList) {
            if (lab.getName().equals(labName)) {
                Integer index = labList.indexOf(lab);
                return labList.get(index).labStatus;
            }
        }
       return null;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        Collections.sort(labList);
        for (Lab lab: labList){
            builder.append(lab.getName());
            builder.append(" > ");
            builder.append(lab.getStatus());
            builder.append("\n");
        }
        builder.deleteCharAt(builder.length()-1);



        return builder.toString();
    }
}
