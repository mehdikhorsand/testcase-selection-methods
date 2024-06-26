package methods.ART_AutoISP_C;

import methods.ART_AutoISP.MethodEdgePairCoverage;
import randomTestcase.TestCase;
import tools.activity.Action;
import tools.activity.Activity;

import java.util.ArrayList;

public class ConditionEdgePairCoverage extends MethodEdgePairCoverage {
    public ConditionEdgePairCoverage(TestCase testcase) {
        super(testcase);
    }

    @Override
    public ArrayList<Activity> get_activities() {
        return testcase.method_and_condition_coverage.read_list();
    }

    @Override
    public void add_to_behavior(ArrayList<Action> behavior, Action action){
        if(action.check_type("Condition") || action.check_type("InsideLoop") ||
                action.check_type("EndLoop") || action.check_type("MethodFinish"))
            behavior.add(action);
    }
}
