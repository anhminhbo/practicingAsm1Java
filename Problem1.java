public class Problem1 {
    public static boolean canFollowRule(double length, int n, double min) {
        if (n == 1) return true;
        int distance = n - 1;
        System.out.println(Math.floor(length / distance));
        return (Math.floor(length / distance) < min) ? false : true;
    }

    public static boolean isFollowingRule(double[] locations, double min) {
        double previousPosition = 0;
        for (int i = 0; i< locations.length; i++) {
            if (i==0) continue;
            double distance = Math.abs(locations[i] - previousPosition);
            System.out.println(distance);
            if (distance < min) return false;
            previousPosition = locations[i];
        }
        return true;
    }

    public static boolean isFollowingRealRule(double[] locations, boolean[] protectedd, double min) {
        double previousPosition = 0;
        for (int i = 0; i< locations.length; i++) {
            for (int j = i + 1; j < locations.length; j++) {
                double distance = Math.abs(locations[j] - locations[i]);
                if (distance < min) {
                    if (protectedd[i] == false && protectedd[j] == false) return false;

                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
////        First method
        System.out.println(canFollowRule(9.0, 5, 1.0));
//        System.out.println(canFollowRule(10.0, 7, 2.0));
//        System.out.println(canFollowRule(10.0, 6, 2.5));;
//        System.out.println(canFollowRule(0.1, 1, 0.0001));


//    //        Second method
        System.out.println(isFollowingRule(new double[]{0,1,5,6,9}, 2.021));
//        System.out.println(isFollowingRule(new double[]{0.0, 1.5, 4.5, 10.0}, 2.0));
//        System.out.println(isFollowingRule(new double[]{-10.0, -7.5, 0.0}, 2.4));

//        Third method
        System.out.println(isFollowingRealRule(new double[]{0,1,5,6,9}, new boolean[]{true, false, false, true,false}, 3.21));
//        System.out.println(isFollowingRealRule(new double[]{0.0, 1.5, 1.9, 10.0}, new boolean[]{false, true, false, false}, 2.0));
//        System.out.println(isFollowingRealRule(new double[]{0.0, 0.5, 1.0, 1.5, 2.1}, new boolean[]{false, true, true, true, false}, 2.0));
}
}
