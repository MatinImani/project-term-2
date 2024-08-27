public class Date
{
    private int day;
    private int month;
    private int year;
    public Date()
    {
         day=3;
        month=11;
        year=1386;
    }
    public Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }


    public void setDay(int day)
    {
        if(day>=1 && day<=31)
            this.day = day;
        else
            day=1;
    }
    public int getDay()
    {
        return day;
    }


    public void setMonth(int month)
    {
        if(month>=1 && month<=12)
           this.month = month;
        else
            month=1;
    }
    public int getMonth()
    {
        return month;
    }


    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }


    public void print()
    {
        System.out.println("day is:"+day);
        System.out.println("month is:"+month);
        System.out.println("year is:"+year);
    }
}
