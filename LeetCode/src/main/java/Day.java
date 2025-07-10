public class Day {
    public int dayOfYear(String date) {
        //date[0] to date[3] is the year
        //date[5] to date[6] is the month
        //date[8] to date[9] is the day
        int day= Integer.parseInt(date.substring(8,10));
        int month = Integer.parseInt(date.substring(5,7));
        int year = Integer.parseInt(date.substring(0,4));
        int days_to_add =0;
        int ans =0;
        boolean isLeap = false;

        if(month == 1){
            return day;
        }
        if(year%4 == 0){
            isLeap = true;
        }
        if(year%100 == 0){
            isLeap = year % 400 == 0;
        }



        int i =1;
        while( i < month){
            if(i == 4 || i == 6 ||i == 9 ||  i == 11 ){
                days_to_add = 30;
            }else if(i == 2){
                if(isLeap){
                    days_to_add = 29;
                }else{
                    days_to_add = 28;
                }
            }else{
                days_to_add = 31;
            }
            ans+=days_to_add;
            i++;
        }

        return ans + day;

    }

    public static void main(String[] args) {
        Day d = new Day();
        String date = "2004-03-01";
        System.out.println(d.dayOfYear(date));
    }
}
