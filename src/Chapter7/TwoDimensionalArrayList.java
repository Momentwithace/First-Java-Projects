package Chapter7;

import java.util.ArrayList;

public class TwoDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> cohorts = new ArrayList<>();


        ArrayList<String> cohort11 = new ArrayList<>();
        cohort11.add("Ace");
        cohort11.add("Boyo");
        cohort11.add("Tman");
        cohort11.add("John");
        cohort11.add("Ac");

        ArrayList<String> cohort12 = new ArrayList<>();
        cohort12.add("wale");
        cohort12.add("wole");
        cohort12.add("tony");
        cohort12.add("helen");
        cohort12.add("rollins");

        ArrayList<String> cohort13 = new ArrayList<>();
        cohort13.add("paul");
        cohort13.add("duke");
        cohort13.add("titus");
        cohort13.add("joy");
        cohort13.add("steve");

        ArrayList<String> cohort14 = new ArrayList<>();
        cohort14.add("paul");
        cohort14.add("duke");
        cohort14.add("titus");
        cohort14.add("joy");
        cohort14.add("steve");

        cohort14.clear();


        cohorts.add(cohort11);
        cohorts.add(cohort12);
        cohorts.add(cohort13);
        cohorts.add(cohort14);

//        for (int i = 0; i < cohorts.size(); i++) {
//            System.out.println(cohorts.get(i));
//        }
        for (ArrayList<String> i: cohorts
             ) {
            System.out.println(i);
        }
    }
}
