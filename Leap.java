public class Leap {
    private int year;
    Leap(int y){
        year = y;
    }
    public boolean isLeap(){
        if((year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0))){
            return true;
        }else {
            return false;
        }
    }
    public int fixDay(int date,int month){
        int[] t = new int[]{0, 3, 3, 6, 1, 4, 6, 2,
                5, 0, 3, 5};
        year-=month<3?1:0;
        return ( year + year/4 - year/100 +
                year/400 + t[month-1] + date) % 7;

    }
    public int fixDays(int monthNumber){
        if(monthNumber%2==0&monthNumber!=1&&monthNumber<=6){
            return 31;
        }else if(monthNumber%2!=0&&monthNumber!=1&&monthNumber<=6){
            return 30;
        }else if(monthNumber%2==0&&monthNumber!=1&&monthNumber>6){
            return 30;
        } else if (monthNumber%2!=0&&monthNumber!=1&&monthNumber>6) {
            return 31;
        }else {
            if(isLeap()){
                return 29;
            }else {
                return 28;
            }
        }
    }
    public String getMonth(int i){
        String[] month = {"January","February","March","April","May","June","July","August","September","October",
        "November","December"};
        return month[i];
    }
    public void calender(){
        int day = fixDay(1,1);
        for(int i=0;i<12;i++){
            System.out.println("  -------------"+getMonth(i)+"------------");
            System.out.println("  sun  mon  tue  wed  thu  fri  sat  ");
            int no_of_days = fixDays(i);
            int k;
            for (k = 1; k <= day; k++)
                System.out.printf("     ");

            for (int j = 1; j <= no_of_days; j++)
            {
                System.out.printf("%5d", j);
                if (k++ > 6)
                {
                    k = 1;
                    System.out.printf("\n");
                }
            }
            if (k!=0)
                System.out.printf("\n");
            day = k-1;
        }

        }
    }

