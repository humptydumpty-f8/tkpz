package kpi.apeps.lec8;

import kpi.apeps.lec8.company.common.Parent;

/**
 * Вплив модифікатору protected при наслідуванні
 */
public class ex2_2 extends Parent {

    public static void main(String[] args) {

        var ex = new ex2_2();
            ex.publicAccessMethod();
//            ex.defaultAccessMethod();
            ex.protectedAccessMethod();
    }

}
