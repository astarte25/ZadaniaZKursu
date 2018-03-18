package lambda.introduction.materials;

import java.util.ArrayList;
import java.util.List;

public class WomenGroup {

    public static List<Woman> getWomenGroup() {
        List<Woman> womenGroup = new ArrayList<>();
        womenGroup.add(new Woman("Tosia", true, false, true));
        womenGroup.add(new Woman("Grazyna", false, false, false));
        womenGroup.add(new Woman("Aga", true, true, true));
        womenGroup.add(new Woman("Ewelina", false, true, true));
        womenGroup.add(new Woman("Ewa", false, true, false));
        womenGroup.add(new Woman("Krystyna", true, true, false));
        return womenGroup;
    }

    public static void main(String[] args) {

        List<Woman> womenGroup = getWomenGroup();
        print(womenGroup, new CheckIfDancer());

        print(womenGroup, new CheckSport() {
            @Override
            public boolean check(Woman woman) {
                return woman.isRunner();
            }
        });
    }

    public static void print(List<Woman> womanList, CheckSport checker) {
        for (Woman woman : womanList) {
            if (checker.check(woman)) {
                System.out.println(woman);
            }
        }
        System.out.println();
    }
}
