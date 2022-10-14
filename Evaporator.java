public class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        double p = content;
        int n=0;
        while (content>(threshold*p/100)){
            content = content - content*evap_per_day/100;
            n=n+1;
        }
        return n;
    }
}