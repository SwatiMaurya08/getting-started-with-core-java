package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class InstanceVariable {
    String myInstancevar = "instance variable";

    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        InstanceVariable instanceVariable1 = new InstanceVariable();
        InstanceVariable instanceVariable2 = new InstanceVariable();

        System.out.println(instanceVariable.myInstancevar);
        System.out.println(instanceVariable1.myInstancevar);
        System.out.println(instanceVariable2.myInstancevar);

        instanceVariable1.myInstancevar = "Text Changed";

        System.out.println(instanceVariable.myInstancevar);
        System.out.println(instanceVariable1.myInstancevar);
        System.out.println(instanceVariable2.myInstancevar);

    }

}

