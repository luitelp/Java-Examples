2   // Demonstrating Strings in switch.
 3   public class AutoPolicyTest {
 4     public static void main(String[] args) {
 5         // create two AutoPolicy objects
 6        AutoPolicy policy1 =
 7           new AutoPolicy(11111111, "Toyota Camry", "NJ");
 8        AutoPolicy policy2 =
 9           new AutoPolicy(22222222, "Ford Fusion", "ME");
10
11        // display whether each policy is in a no-fault state
12        policyInNoFaultState(policy1);
13        policyInNoFaultState(policy2);
14     }
15
16     // method that displays whether an AutoPolicy
17     // is in a state with no-fault auto insurance
18     public static void policyInNoFaultState(AutoPolicy policy) {
19        System.out.println("The auto policy:");
20        System.out.printf(
21           "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
22           policy.getAccountNumber(), policy.getMakeAndModel(),
23           policy.getState(),
24           (policy.isNoFaultState() ? "is": "is not"));
25     }
26  }
