# class14-10
## kata task1

[Task link](https://www.codewars.com/kata/5506b230a11c0aeab3000c1f)    
My solution

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
My fav soluton

    import java.lang.Math;

        public class Evaporator { 
  
          public static int evaporator(double content, double evap_per_day, double threshold) {
            return (int)Math.ceil(Math.log(threshold / 100.0) / Math.log(1.0 - evap_per_day / 100.0));
          }
        }
 
## kata task2

[Task link](https://www.codewars.com/kata/62c93765cef6f10030dfa92b)    
My solution

    public class Kata {
      public static int solution(int start, int finish) {
        return ((finish - start) / 3 + (finish - start) % 3);
      }
    }
    
My fav solution

    public class Kata {
      public static int solution(int start, int finish) {
        return ((finish - start) / 3 + (finish - start) % 3);
      }
    }
    
Yeah, (My fav solution)==(My solution), because I'm too selfish. (There's no interesting solutons on codewars)    
